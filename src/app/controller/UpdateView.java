package app.controller;

import app.MySQLTutor;
import app.model.Field;
import app.model.TableManagement;
import app.view.RootLayoutController;
import app.view.UpdateController;
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
public class UpdateView extends View {
    
    private ObservableList<Field> data;
    private QueryResult result;
    private UpdateController controller;

    public UpdateView(MySQLTutor tutor, String source) throws IOException {
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

        controller.setTutorReference(tutor);
        controller.getCrossTableManagement().setup(result.getColumns(), data);
        controller.getFinalTableManagement().setup(result.getColumns());
    }
    
    @Override
    public void animate(int miliSeconds) throws InterruptedException {
        TableManagement crossManagement = controller.getCrossTableManagement();
        TableManagement finalManagement = controller.getFinalTableManagement();
        List<SingleResult> results = result.getResults();
        
        for (currentRowAnimation = startingRowAnimation; 
                currentRowAnimation < results.size(); ++currentRowAnimation) {
            SingleResult r = results.get(currentRowAnimation);
            crossManagement.markRow(currentRowAnimation, STYLE_BLUE);
            Thread.sleep(miliSeconds);
            if ( r.isSuccessful() ) {
                crossManagement.markRow(currentRowAnimation, STYLE_OCEAN);
                finalManagement.addRow(new Field(r.getData()));
                finalManagement.markRow(finalManagement.getData().size() - 1, STYLE_OCEAN);
                Thread.sleep(miliSeconds);
            } else {
                crossManagement.markRow(currentRowAnimation, STYLE_CHILLI);
            }
        }
        
        crossManagement.markRow(crossManagement.getData().size(), null);
        finalManagement.markRow(finalManagement.getData().size(), null);
    }

    @Override
    public void pauseAnimation() throws InterruptedException {
        startingRowAnimation = currentRowAnimation;
    }

    @Override
    public void resumeAnimation(int miliSeconds) throws InterruptedException {
        animate(miliSeconds);
    }

    public UpdateController getController() {
        return controller;
    }
    
    
    
}
