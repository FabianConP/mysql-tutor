package app.view;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

import java.util.ArrayList;
import app.model.*;

public class SelectController {
    @FXML
    private TableView<Field> personTable;

    private ArrayList<TableColumn<Field, String>> columns;

    public SelectController() {
    	columns = new ArrayList<TableColumn<Field,String> >();
    }

    public void setup (ArrayList<String> columnNames,
    		ObservableList<Field> data) {
    	//Clears the current columns
    	personTable.getColumns().removeAll(columns);

    	for ( String name : columnNames ) {
            columns.add(new TableColumn<>(name));
    	}

    	personTable.getColumns().addAll(columns);

    	int i = 0;
    	for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
    	}

        personTable.setItems(data);
    }

    @FXML
    private void initialize() {
    }
}