/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import com.sun.javafx.scene.control.skin.TableViewSkin;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Duration;

/**
 *
 * @author milder
 */
public class TableManagement {
    private TableColumn<Field, String> indexColumn;
    private List<TableColumn<Field, String>> columns;
    
    private TableView<Field> table;
    private ObservableList<Field> data;

    public TableManagement(TableView<Field> table) {
        this.table = table;
        columns = new ArrayList<>();
        data = FXCollections.observableArrayList();
    }
    
    public void setup (List<String> columnNames) {
        setup(columnNames, null);
    }
    
    public void setup (List<String> columnNames,
    		ObservableList<Field> data) {
        this.data = data;
    	
        //Clears the current columns
    	table.getColumns().removeAll(columns);
        
        indexColumn = new TableColumn<Field, String>("#");
        indexColumn.setSortable(false);
        indexColumn.setCellValueFactory(column-> 
                new ReadOnlyObjectWrapper<String>(
                        String.valueOf(table.getItems().indexOf(column.getValue()))));
        
    	for ( String name : columnNames ) {
            columns.add(new TableColumn<>(name));
    	}

        table.getColumns().add(indexColumn);
    	table.getColumns().addAll(columns);

    	for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
    	}
        
        if (this.data == null) 
            this.data = FXCollections.observableArrayList();
        
        table.setItems(data);
    }
    
    
    private void cellFactory (int row, String style, TableColumn<Field,String> col) {
        col.setCellFactory(column -> {
            return new TableCell<Field, String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);  

                    if (item == null || empty) {
                        setText(null);
                        setStyle("");
                    } else {
                        setText(item);
                        if (getIndex() == row) {
                            setStyle(style);
                        }
                    }
                }
            };
        });
    }
    
    public void markRow (int row, String style) { 
        cellFactory(row, style, indexColumn);
        for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
            cellFactory(row, style, col);
        }
    }

    public List<TableColumn<Field, String>> getColumns() {
        return columns;
    }

    public void setColumns(List<TableColumn<Field, String>> columns) {
        this.columns = columns;
    }

    public TableView<Field> getTable() {
        return table;
    }

    public void setTable(TableView<Field> table) {
        this.table = table;
    }
    
    public void addRow (Field field) {            
        data.add(field);
        table.setItems(data);
    }

    public ObservableList<Field> getData() {
        return data;
    }

    public void setData(ObservableList<Field> data) {
        this.data = data;
    }
}
