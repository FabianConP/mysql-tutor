package app.view;

import app.MySQLTutor;
import app.model.Field;
import app.model.TableManagement;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

/**
 *
 * @author milder
 */
public class UpdateController {
    @FXML
    private TableView<Field> previousTable;
    private TableManagement previousTableManagement;
    
    @FXML
    private TableView<Field> updatedTable;
    private TableManagement updatedTableManagement;
    
    private MySQLTutor tutorReference;

    public UpdateController() {
    }
    
    
    public TableManagement getPreviousTableManagement () {
        return previousTableManagement;
    }
    
    public TableManagement getUpdatedTableManagement () {
        return updatedTableManagement;
    }

    @FXML
    private void initialize() {
        previousTableManagement = new TableManagement(previousTable);
        updatedTableManagement = new TableManagement(updatedTable);
    }

    public TableView<Field> getPreviousTable() {
        return previousTable;
    }

    public void setPreviousTable(TableView<Field> previousTable) {
        this.previousTable = previousTable;
    }

    public TableView<Field> getUpdatedTable() {
        return updatedTable;
    }

    public void setUpdatedTable(TableView<Field> updatedTable) {
        this.updatedTable = updatedTable;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }
    
    
}
