/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.MySQLTutor;
import static app.controller.View.STYLE_OCEAN;
import app.model.Field;
import app.model.TableManagement;
import app.view.ShowController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.QueryResult;
import model.SingleResult;

public class ShowView extends View {
    
    private ObservableList<Field> data;
    private QueryResult result;
    private ShowController controller;

    public ShowView(MySQLTutor tutor, String source) throws IOException {
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
        controller.getShowTableManagement().setup(result.getColumns(), data);
    }
    
    @Override
    public void animate(int miliSeconds) throws InterruptedException {
        TableManagement showTableManagement = controller.getShowTableManagement();
        List<SingleResult> results = result.getResults();
        showTableManagement.markRow(showTableManagement.getData().size(), STYLE_OCEAN);
    }

    @Override
    public void pauseAnimation() throws InterruptedException {
    }

    @Override
    public void resumeAnimation(int miliSeconds) throws InterruptedException {
        animate(miliSeconds);
    }

    public ShowController getController() {
        return controller;
    }
    
}
