package app;

import app.model.Field;
import app.view.SelectController;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.QueryResult;
import model.SingleResult;

/**
 *
 * @author milder
 */
public class SelectView extends View {
    
    private ObservableList<Field> data;
    private QueryResult result;

    public SelectView(MySQLTutor tutor, String source) throws IOException {
        super(tutor, source);
    }

    @Override
    public void setUp(QueryResult result) {
        this.result = result;
        
        data = FXCollections.observableArrayList();
        for ( SingleResult r : result.getResults() ) {
            data.add(new Field((ArrayList<Object>) r.getData()));
        }

        SelectController controller = loader.getController();

        controller.setMySQLTutorReference(tutor);
        controller.getCrossTableManagement().setup(result.getColumns(), data);
        controller.getFinalTableManagement().setup(result.getColumns(), data);
    }
    
    @Override
    public void animate() {
        
    }
    
}
