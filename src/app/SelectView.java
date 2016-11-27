package app;

import app.model.Field;
import app.model.TableManagement;
import app.view.RootLayoutController;
import app.view.SelectController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import model.QueryResult;
import model.SingleResult;

/**
 *
 * @author milder
 */
public class SelectView extends View {
    
    private ObservableList<Field> data;
    private QueryResult result;
    private SelectController controller;

    public SelectView(MySQLTutor tutor, String source) throws IOException {
        super(tutor, source);
        startingRowAnimation = 0;
    }

    @Override
    public void setUp(QueryResult result) {
        this.result = result;
        
        data = FXCollections.observableArrayList();
        for ( SingleResult r : result.getResults() ) {
            data.add(new Field((ArrayList<Object>) r.getData()));
        }

        controller = loader.getController();

        controller.setMySQLTutorReference(tutor);
        controller.getCrossTableManagement().setup(result.getColumns(), data);
        controller.getFinalTableManagement().setup(result.getColumns());
    }
    
    @Override
    public void animate(int miliSeconds) throws InterruptedException {
        TableManagement crossManagement = controller.getCrossTableManagement();
        TableManagement finalManagement = controller.getFinalTableManagement();
        List<SingleResult> results = result.getResults();
        
        String greenStyle = "-fx-background-color: green";
        String redStyle = "-fx-background-color: red";
        
        for (currentRowAnimation = startingRowAnimation; 
                currentRowAnimation < results.size(); ++currentRowAnimation) {
            SingleResult r = results.get(currentRowAnimation);
            if ( r.isSuccessful() ) {
                crossManagement.markRow(currentRowAnimation, greenStyle);
                Thread.sleep(miliSeconds);
                finalManagement.addRow(new Field(r.getData()));
                finalManagement.markRow(finalManagement.getData().size() - 1, redStyle);
                Thread.sleep(miliSeconds);
            } else {
                crossManagement.markRow(currentRowAnimation, redStyle);
            }
        }
        
        crossManagement.markRow(crossManagement.getData().size(), greenStyle);
        finalManagement.markRow(finalManagement.getData().size(), greenStyle);
    }

    @Override
    public void pauseAnimation() throws InterruptedException {
        startingRowAnimation = currentRowAnimation;
    }

    @Override
    public void resumeAnimation(int miliSeconds) throws InterruptedException {
        animate(miliSeconds);
    }
    
}
