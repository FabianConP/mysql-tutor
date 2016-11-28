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
public class DeleteController {
    @FXML
    private TableView<Field> previousTable;
    private TableManagement previousTableManagement;
    
    @FXML
    private TableView<Field> updatedTable;
    private TableManagement updatedTableManagement;
    
    private MySQLTutor tutorReference;

    public DeleteController() {
    }
    
    
    public TableManagement getPreviousTableManagement () {
        return previousTableManagement;
    }
    
    public TableManagement getDeletedTableManagement () {
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

    public TableView<Field> getDeletedTable() {
        return updatedTable;
    }

    public void setDeletedTable(TableView<Field> updatedTable) {
        this.updatedTable = updatedTable;
    }

    public MySQLTutor getTutorReference() {
        return tutorReference;
    }

    public void setTutorReference(MySQLTutor tutorReference) {
        this.tutorReference = tutorReference;
    }
    
    
}
