package model.logic;

import java.util.ArrayList;
import java.util.List;

public class TableDefinition {
    private String name;
    private String alias;
    private List<Column> columns;
    private List<Constraint> constraints;
    
    public TableDefinition(){
        name = "";
        alias = "";
        columns = new ArrayList<>();
        constraints = new ArrayList<>();
    }
    
    public TableDefinition(String name, String alias, List<Column> columns, List<Constraint> constraints){
        this.name = name;
        this.alias = alias;
        this.columns = columns;
        this.constraints = constraints;
    }
    
    public TableDefinition(String name){
        this.name = name;
        this.alias = name;
        this.columns = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }
    
    public TableDefinition(String name, List<Column> columns, List<Constraint> constraints){
        this.name = name;
        this.alias = name;
        this.columns = columns;
        this.constraints = constraints;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
    
    
}
