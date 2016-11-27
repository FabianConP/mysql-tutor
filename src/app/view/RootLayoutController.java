/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.MySQLTutor;
import app.SelectView;
import app.View;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.QueryResult;
import model.logic.Interpreter;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;

/**
 *
 * @author milder
 */
public class RootLayoutController {
    
    private MySQLTutor tutor;
            
    @FXML
    private TextField commandField;
    
    @FXML
    private BorderPane codePane;
    
    
    private CodeArea codeArea;
    
    
    private final String SELECT_SOURCE;
    private final String UPDATE_SOURCE;
    private final String CREATE_SOURCE;
    
    private View currentView;
    
    public RootLayoutController() {
        SELECT_SOURCE = "view/Select.fxml";
        UPDATE_SOURCE = "view/Update.fxml";
        CREATE_SOURCE = "view/Create.fxml";
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
        "select * from tabla;",
        "select * from tabla where a = 2 and x = 1;",
        "select * from tabla where a = 2 and x = 1;",
        "insert into tabla values(value1, value2);"
    });

    
    
    @FXML
    private void initialize() {
        codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        codeArea.richChanges()
                .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) // XXX
                .subscribe(change -> {
                    codeArea.setStyleSpans(0, computeHighlighting(codeArea.getText()));
                });
        codeArea.replaceText(0, 0, sampleCode);
        
        codePane.setCenter(codeArea); 
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
    
    
    @FXML
    private void runCommand () throws IOException {
        //Temporary gets the whole text from codeArea
        Interpreter.runCommand(codeArea.getText());
        
        QueryResult result = Interpreter.result;
        
        switch (result.getType()) {
            case SELECT:
                currentView = new SelectView(tutor, SELECT_SOURCE);                
                break;
            case CREATE:
                
                break;
            case UPDATE:
                
                break;
                
            default:
                
        }
        
        currentView.setUp(result);
        
        new Thread() {
            @Override
            public void run () {
                try {
                    currentView.animate(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RootLayoutController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    public void setMySQLReference(MySQLTutor tutor) {
        this.tutor = tutor;
    }
}
