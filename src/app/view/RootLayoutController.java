package app.view;

import app.MySQLTutor;
import app.controller.CreateView;
import app.controller.InsertView;
import app.controller.SelectView;
import app.controller.UpdateView;
import app.controller.View;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.function.IntFunction;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import model.QueryResult;
import model.logic.Interpreter;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.value.Val;

/**
 *
 * @author milder
 */
public class RootLayoutController {
    
    private MySQLTutor tutor;
            
    @FXML
    private BorderPane codePane;
    
    @FXML
    private Slider speedSlider;
    
    @FXML
    private Button pauseResumeButton;
    @FXML
    private Button runCommandButton;
    @FXML
    private Button stopButton;
    @FXML
    private Button reloadButton;
    
    private CodeArea codeArea;
    
    private final String SELECT_SOURCE;
    private final String UPDATE_SOURCE;
    private final String CREATE_SOURCE;
    private final String INSERT_SOURCE;
    
    
    private View currentView;
    
    private final double DEFAULT_SLIDER_VALUE;
    
    private AnimationThread animationThread;
    
    private ImageView playImage, pauseImage, stopImage, reloadImage;
    
    public RootLayoutController() {
        SELECT_SOURCE = "view/Select.fxml";
        UPDATE_SOURCE = "view/Update.fxml";
        CREATE_SOURCE = "view/Create.fxml";
        INSERT_SOURCE = "view/Insert.fxml";
        DEFAULT_SLIDER_VALUE = 80;
        
        playImage = new ImageView(new Image(
                RootLayoutController.class.getResourceAsStream("img/play-button.png")));
        pauseImage = new ImageView(new Image(
                RootLayoutController.class.getResourceAsStream("img/pause-button.png")));
        stopImage = new ImageView(new Image(
                RootLayoutController.class.getResourceAsStream("img/stop-button.png")));
        reloadImage = new ImageView(new Image(
                RootLayoutController.class.getResourceAsStream("img/reload-button.png")));
    }
    
    private static final String[] KEYWORDS = new String[] {
            "select", "from", "where", "like", "insert", "into", "update",
            "create", "table",
            "values"
    };

    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String BRACKET_PATTERN = "\\[|\\]";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";

    private static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
            + "|(?<PAREN>" + PAREN_PATTERN + ")"
            + "|(?<BRACE>" + BRACE_PATTERN + ")"
            + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
            + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
            + "|(?<STRING>" + STRING_PATTERN + ")"
            + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
    );

    private static final String sampleCode = String.join("\n", new String[] {
        "select a, b from xd;",
        "select * from tabla where a = 2 and x = 1;",
        "select * from tabla where a = 2 and x = 1;",
        "insert into tabla values(value1, value2);"
    });
    
    
    private class ArrowFactory implements IntFunction<Node> {
        private final ObservableValue<Integer> shownLine;

        ArrowFactory(ObservableValue<Integer> shownLine) {
            this.shownLine = shownLine;
        }

        @Override
        public Node apply(int lineNumber) {
            Polygon triangle = new Polygon(0.0, 0.0, 10.0, 5.0, 0.0, 10.0);
            triangle.setFill(Color.ROYALBLUE);

            ObservableValue<Boolean> visible = Val.map(shownLine, sl -> sl == lineNumber);

            triangle.visibleProperty().bind(
                Val.flatMap(triangle.sceneProperty(), scene -> {
                    return scene != null ? visible : Val.constant(false);
            }));

            return triangle;
        }
    }

    
    @FXML
    private void initialize() {
        codeArea = new CodeArea();
        
        IntFunction<Node> numberFactory = LineNumberFactory.get(codeArea);
        IntFunction<Node> arrowFactory = new ArrowFactory(codeArea.currentParagraphProperty());
        IntFunction<Node> graphicFactory = line -> {
            HBox hbox = new HBox(
                    numberFactory.apply(line),
                    arrowFactory.apply(line));
            hbox.setAlignment(Pos.CENTER_LEFT);
            return hbox;
        };
        
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        codeArea.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) 
                .subscribe(change -> {
                    codeArea.setStyleSpans(0, computeHighlighting(codeArea.getText()));
                });
        
        codeArea.replaceText(0, 0, sampleCode);
        codeArea.moveTo(0, 0);
        codeArea.setOnKeyPressed(event -> {
                if (event.isControlDown() && event.getCode() == KeyCode.ENTER) {
                    try {
                        runCommand();
                    } catch (IOException ex) {
                        Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        );
        
        codePane.setCenter(codeArea);        
        
        speedSlider.setValue(DEFAULT_SLIDER_VALUE);
        animationThread = new AnimationThread();
        
        runCommandButton.setDisable(false);
        
        pauseResumeButton.setDisable(true);
        pauseResumeButton.setGraphic(playImage);
        stopButton.setDisable(true);
        stopButton.setGraphic(stopImage);
        reloadButton.setDisable(true);
        reloadButton.setGraphic(reloadImage);
    }
    
    
    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                    matcher.group("PAREN") != null ? "paren" :
                    matcher.group("BRACE") != null ? "brace" :
                    matcher.group("BRACKET") != null ? "bracket" :
                    matcher.group("SEMICOLON") != null ? "semicolon" :
                    matcher.group("STRING") != null ? "string" :
                    matcher.group("COMMENT") != null ? "comment" :
                    null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }
    
    private void enableDisableButtons () {
        runCommandButton.setDisable(!runCommandButton.isDisabled());
        pauseResumeButton.setDisable(!pauseResumeButton.isDisabled());
        stopButton.setDisable(!stopButton.isDisabled());
    }
    
    private String getLineCommand () {
        String queryString = codeArea.getText();
        
        int fromIndex = codeArea.getCaretPosition() - codeArea.getCaretColumn();
        int toIndex = queryString.indexOf(";", fromIndex);
        
        queryString = queryString.
                substring( fromIndex, toIndex != -1 ? toIndex : queryString.length() );
        
        return queryString;
    }
    
    private void moveCaretToNextParagraph () {
        if ( codeArea.getCurrentParagraph() < codeArea.getParagraphs().size() - 1 )
            codeArea.moveTo(codeArea.getCurrentParagraph() + 1, 0);
    }
    
    private void moveCaretToPreviousParagraph () {
        if ( codeArea.getCurrentParagraph() > 0 )
            codeArea.moveTo(codeArea.getCurrentParagraph() - 1, 0);
    }
    
    @FXML
    private void runCommand () throws IOException {
        reloadButton.setDisable(false);
        pauseResumeButton.setGraphic(pauseImage);
        enableDisableButtons();
        
        String queryString = getLineCommand();
        moveCaretToNextParagraph();
        
        Interpreter.runCommand(queryString);
        
        QueryResult result = Interpreter.result;
        switch (result.getType()) {
            case SELECT:
                currentView = new SelectView(tutor, SELECT_SOURCE);                
                break;
            case CREATE:
                currentView = new CreateView(tutor, CREATE_SOURCE);
                break;
            case UPDATE:
                currentView = new UpdateView(tutor, UPDATE_SOURCE);
                break;
            case INSERT:
                currentView = new InsertView(tutor, INSERT_SOURCE);
                break;
                
            default:
                currentView = new CreateView(tutor, CREATE_SOURCE);
        }
        
        currentView.setUp(result);
        animationThread = new AnimationThread();
        animationThread.start();
    }

    public void setMySQLReference(MySQLTutor tutor) {
        this.tutor = tutor;
    }
    
    private class AnimationThread extends Thread {

        public AnimationThread() {
            setName("animation-thread");
        }
        
        @Override
        public void run () {
            try {
                currentView.animate((int) ((100 - speedSlider.getValue()) * 25));
            } catch (InterruptedException ex) {
                Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
            }
//            pauseResumeButton.setGraphic(playImage);
            enableDisableButtons();
        }
    }
    
    @FXML
    private void pauseAnimation () throws InterruptedException {
        if ( animationThread.isAlive() ) {
            currentView.pauseAnimation();
            animationThread.stop();
            pauseResumeButton.setGraphic(playImage);
        } else {
            animationThread = new AnimationThread();
            animationThread.start();
            pauseResumeButton.setGraphic(pauseImage);
        }
    }
    
    @FXML
    private void stopAnimation () throws InterruptedException {       
        if ( animationThread.isAlive() ) {
            animationThread.stop();
        }
        enableDisableButtons();
    }
    
    @FXML
    private void reloadAnimation () throws InterruptedException, IOException { 
        if (!runCommandButton.isDisabled())
            enableDisableButtons();
        stopAnimation();
        moveCaretToPreviousParagraph();
        runCommand();
    }
}
