/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import app.MySQLTutor;
import app.model.Field;
import app.model.TableManagement;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author milder
 */
public class CreateController {
    
    @FXML
    private TableView<Field> createTable;
    private TableManagement createTableManagement;
    private MySQLTutor tutorReference;

    @FXML
    public void initialize() {
        createTableManagement = new TableManagement(createTable);
    }    
    
    public TableView<Field> getCreateTable() {
        return createTable;
    }

    public void setCreateTable(TableView<Field> createTable) {
        this.createTable = createTable;
    }

    public TableManagement getCreateTableManagement() {
        return createTableManagement;
    }

    public void setCreateTableManagement(TableManagement createTableManagement) {
        this.createTableManagement = createTableManagement;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }
    
    
}
