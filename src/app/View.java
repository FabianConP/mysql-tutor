package app;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import model.QueryResult;

/**
 *
 * @author milder
 */
public abstract class View {
    
    protected MySQLTutor tutor;
    protected String source;
    protected FXMLLoader loader;
    
    public View(MySQLTutor tutor, String source) throws IOException {
        this.tutor = tutor;
        this.source = source;
        
        loader = new FXMLLoader();
        loader.setLocation(MySQLTutor.class.getResource(source));
        AnchorPane selectOverview = (AnchorPane) loader.load();
        tutor.getRootLayout().setCenter(selectOverview);
    }
    
    public abstract void setUp (QueryResult result);
    public abstract void animate ();
}
