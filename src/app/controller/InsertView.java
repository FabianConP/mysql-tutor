/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.MySQLTutor;
import app.model.Field;
import app.model.TableManagement;
import app.view.InsertController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.QueryResult;
import model.SingleResult;

/**
 *
 * @author milder
 */
public class InsertView extends View {
    
    private ObservableList<Field> data;
    private QueryResult result;
    private InsertController controller;

    public InsertView(MySQLTutor tutor, String source) throws IOException {
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
        controller.getInsertTableManagement().setup(result.getColumns(), data);
    }
    
    @Override
    public void animate(int miliSeconds) throws InterruptedException {
        TableManagement insertTableManagement = controller.getInsertTableManagement();
        List<SingleResult> results = result.getResults();
        
        insertTableManagement.markRow(insertTableManagement.getData().size() - 1, STYLE_OCEAN);
    }

    @Override
    public void pauseAnimation() throws InterruptedException {
    }

    @Override
    public void resumeAnimation(int miliSeconds) throws InterruptedException {
        animate(miliSeconds);
    }

    public InsertController getController() {
        return controller;
    }
    
}
