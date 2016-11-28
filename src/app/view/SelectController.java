package app.view;

import app.MySQLTutor;
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
    
    private MySQLTutor tutorReference;

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

    public TableView<Field> getCrossTable() {
        return crossTable;
    }

    public void setCrossTable(TableView<Field> crossTable) {
        this.crossTable = crossTable;
    }

    public TableView<Field> getFinalTable() {
        return finalTable;
    }

    public void setFinalTable(TableView<Field> finalTable) {
        this.finalTable = finalTable;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }

    
}