package model;

import java.util.List;

public class QueryResult {
    
    private String type;    
    
    private List<String> columns;
    private List<SingleResult> results;

    public QueryResult() {
    }    
    
    public QueryResult(String type) {
        this.type = type;
    }
    
    public QueryResult(String type, List<String> columns, List<SingleResult> results) {
        this.type = type;
        this.columns = columns;
        this.results = results;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<SingleResult> getResults() {
        return results;
    }

    public void setResults(List<SingleResult> results) {
        this.results = results;
    }
    
    
    
}
