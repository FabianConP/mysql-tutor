package app.view;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

import java.util.ArrayList;

import app.MySQLTutor;
import app.model.*;

public class SelectController {
    @FXML
    private TableView<Field> personTable;

    private ArrayList<TableColumn<Field, String>> columns;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;

    // Reference to the main application.
    private MySQLTutor mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public SelectController() {
    	columns = new ArrayList<TableColumn<Field,String> >();
    }


    public void setup (ArrayList<String> columnNames,
    		ObservableList<Field> data) {
    	//Clears the current columns
    	personTable.getColumns().removeAll(columns);

    	for ( String name : columnNames ) {
            columns.add(new TableColumn<>(name));
    	}

    	personTable.getColumns().addAll(columns);

    	int i = 0;
    	for ( TableColumn<Field,String> col : columns ) {
            System.out.println(i++);
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
    	}

        personTable.setItems(data);
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        //firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        //lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
}