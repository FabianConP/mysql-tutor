/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.MySQLTutor;
import app.model.Field;
import app.model.TableManagement;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author milder
 */
public class InsertController  {

    @FXML
    private TableView<Field> insertTable;
    private TableManagement insertTableManagement;
    private MySQLTutor tutorReference;

    @FXML
    public void initialize() {
        insertTableManagement = new TableManagement(insertTable);
    }   

    public TableView<Field> getInsertTable() {
        return insertTable;
    }

    public void setInsertTable(TableView<Field> insertTable) {
        this.insertTable = insertTable;
    }

    public TableManagement getInsertTableManagement() {
        return insertTableManagement;
    }

    public void setInsertTableManagement(TableManagement insertTableManagement) {
        this.insertTableManagement = insertTableManagement;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }
    
    
}
