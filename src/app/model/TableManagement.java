/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;

/**
 *
 * @author milder
 */
public class TableManagement {
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

    	for ( String name : columnNames ) {
            columns.add(new TableColumn<>(name));
    	}

    	table.getColumns().addAll(columns);

    	for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
    	}
        
        if (this.data == null) 
            this.data = FXCollections.observableArrayList();
        
        table.setItems(data);
    }
    
    public void markRow (int row, String style) {
        for ( TableColumn<Field,String> col : columns ) {
            col.setCellValueFactory(cellData -> cellData.getValue().getColumnProperty());
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
