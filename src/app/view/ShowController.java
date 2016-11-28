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
public class ShowController  {

    @FXML
    private TableView<Field> showTable;
    private TableManagement showTableManagement;
    private MySQLTutor tutorReference;

    @FXML
    public void initialize() {
        showTableManagement = new TableManagement(showTable);
    }   

    public TableView<Field> getShowTable() {
        return showTable;
    }

    public void setShowTable(TableView<Field> showTable) {
        this.showTable = showTable;
    }

    public TableManagement getShowTableManagement() {
        return showTableManagement;
    }

    public void setShowTableManagement(TableManagement showTableManagement) {
        this.showTableManagement = showTableManagement;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }
    
    
}
