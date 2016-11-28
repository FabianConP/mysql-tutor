package app.controller;

import app.MySQLTutor;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import model.QueryResult;

/**
 *
 * @author milder
 */
public abstract class View {
    
    public static String 
        STYLE_OCEAN = "-fx-background-color: #1fb58f",
        STYLE_CORAL = "-fx-background-color: #e14658",
        STYLE_RED = "-fx-background-color: red",
        STYLE_WHITE = "-fx-background-color: white",
        STYLE_BLUE = "-fx-background-color: #039ED3",
        STYLE_CHILLI = "-fx-background-color: #af473c";
    
    protected MySQLTutor tutor;
    protected String source;
    protected FXMLLoader loader;
    
    protected int startingRowAnimation, currentRowAnimation;
    
    public View(MySQLTutor tutor, String source) throws IOException {
        this.tutor = tutor;
        this.source = source;
        
        loader = new FXMLLoader();
        loader.setLocation(MySQLTutor.class.getResource(source));
        AnchorPane view = (AnchorPane) loader.load();
        tutor.getRootLayout().setCenter(view);
    }
    
    public abstract void setUp (QueryResult result);
    public abstract void animate (int miliSeconds) throws InterruptedException;
    public abstract void pauseAnimation () throws InterruptedException;
    public abstract void resumeAnimation (int miliSeconds) throws InterruptedException;
}
