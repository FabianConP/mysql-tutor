/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author milder
 */
public class TableManagement {
    private ArrayList<TableColumn<Field, String>> columns;
    private TableView<Field> table;

    public TableManagement(TableView<Field> table) {
        this.table = table;
        columns = new ArrayList<>();
    }
    
    public void setup (ArrayList<String> columnNames,
    		ObservableList<Field> data) {
    	//Clears the current columns
    	table.getColumns().removeAll(columns);

    	for ( String name : columnNames ) {
            columns.add(new TableColumn<>(name));
    	}

    	table.getColumns().addAll(columns);

    	for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
    	}

        table.setItems(data);
    }
}
