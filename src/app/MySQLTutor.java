package app;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import app.model.*;
import app.view.SelectController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.generated.MySQLLexer;
import model.generated.MySQLParser;
import model.logic.MyVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MySQLTutor extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    public static MySQLTutor tutor;

    public MySQLTutor() {
        tutor = this;
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MySQLTutor");

        initRootLayout();
        showSelect();       
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MySQLTutor.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().add(MySQLTutor.class.getResource("view/java-keywords.css").toExternalForm());
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showSelect() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MySQLTutor.class.getResource("view/Select.fxml"));
            AnchorPane selectOverview = (AnchorPane) loader.load();
            rootLayout.setCenter(selectOverview);

            //Dummy data
            ArrayList<String> columnNames = new ArrayList<>();
            columnNames.add("id");
            columnNames.add("name");
            columnNames.add("lel");
            ArrayList<String> temp = new ArrayList<>();
            temp.add("Milder");
            temp.add("Hernandez");
            temp.add("milderhc");
            ObservableList<Field> data = FXCollections.observableArrayList();
            data.add(new Field(temp));
            data.add(new Field(temp));
            data.add(new Field(temp));
            data.add(new Field(temp));
            data.add(new Field(temp));
            
            SelectController controller = loader.getController();
            
            controller.setMySQLTutorReference(this);
            controller.getCrossTableManagement().setup(columnNames, data);
            controller.getFinalTableManagement().setup(columnNames, data);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public void getCommand () {
        System.out.println("kjshdf");
    }
    
    

    public static void main(String[] args) throws FileNotFoundException, IOException {       
        launch(args);      
    }
}