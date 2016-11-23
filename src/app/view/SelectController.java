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
import app.model.*;
import model.logic.Interpreter;

public class SelectController {
    
    @FXML
    private TableView<Field> crossTable;
    private TableManagement crossTableManagement;
    
    @FXML
    private TableView<Field> finalTable;
    private TableManagement finalTableManagement;

    public SelectController() {
    }
    
    public TableManagement getCrossTableManagement () {
        return crossTableManagement;
    }
    
    public TableManagement getFinalTableManagement () {
        return finalTableManagement;
    }

    @FXML
    private void initialize() {
        crossTableManagement = new TableManagement(crossTable);
        finalTableManagement = new TableManagement(finalTable);
    }
    
    @FXML
    private void runCommand () {
        Interpreter.runCommand("create table usuario (id int, edad int)");
    }
}