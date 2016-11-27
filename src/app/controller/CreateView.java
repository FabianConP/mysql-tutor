package app.controller;

import app.MySQLTutor;
import app.model.Field;
import app.view.CreateController;
import app.view.SelectController;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import model.QueryResult;
import model.SingleResult;

/**
 *
 * @author milder
 */
public class CreateView extends View {
    
    private QueryResult result;
    private CreateController controller;

    public CreateView(MySQLTutor tutor, String source) throws IOException {
        super(tutor, source);
    }

    @Override
    public void setUp(QueryResult result) {
        this.result = result;
        controller = loader.getController();
        controller.setTutorReference(tutor);
        controller.getCreateTableManagement().setup(result.getColumns());
    }

    @Override
    public void animate(int miliSeconds) throws InterruptedException {
    }

    @Override
    public void pauseAnimation() throws InterruptedException {
    }

    @Override
    public void resumeAnimation(int miliSeconds) throws InterruptedException {
        animate(miliSeconds);
    }
    
}
