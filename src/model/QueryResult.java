package model;

import java.util.LinkedList;
import java.util.List;

public class QueryResult {
    
    public enum Type {
        SELECT, UPDATE, CREATE, INSERT
    };
    
    private Type type;    
    
    private List<String> columns;
    private List<SingleResult> results;
    
    public QueryResult() {
    }    
    
    public QueryResult(Type type) {
        this(type, new LinkedList<String>(), new LinkedList<SingleResult>());
    }
    
    public QueryResult(Type type, List<String> columns, List<SingleResult> results) {
        this.type = type;
        this.columns = columns;
        this.results = results;
    }
    
    public Type getType() {
        return type;
    }
    
    public void setType(Type type) {
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
    
    @Override
    public String toString() {
        StringBuilder cols = new StringBuilder();
        columns.forEach(column -> cols.append('|').append(column).append('\t'));
        StringBuilder r = new StringBuilder();
        for (SingleResult single : results) {
            for (Object cell : single.getData())
                r.append(cell.toString()).append('\t');
            r.append("|\t").append(single.getTransate()).append('\t').append(single.isSuccessful()).append('\n');
        }
        return "QueryResult{" + "type=" + type + ", columns=\n" + cols.toString() + ", results=\n" + r.toString() + '}';
    }
    
}
