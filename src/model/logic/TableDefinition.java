package model.logic;

import java.util.List;

public class TableDefinition {
    private String name;
    private List<Column> columns;
    private List<Constraint> constraints;
    
    public TableDefinition(){
    }
    
    public TableDefinition(String name, List<Column> columns, List<Constraint> constraints){
        this.name = name;
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
