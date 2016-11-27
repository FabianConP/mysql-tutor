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
    private TableView<Field> crossTable;
    private TableManagement crossTableManagement;
    
    @FXML
    private TableView<Field> finalTable;
    private TableManagement finalTableManagement;
    
    private MySQLTutor tutorReference;

    public UpdateController() {
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
