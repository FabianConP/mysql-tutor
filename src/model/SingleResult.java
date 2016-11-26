package model;

import java.util.List;

public class SingleResult {
    
    private List<Object> data;
    private String transate;
    
    private boolean successful;

    public SingleResult(List<Object> data, String transate, boolean successful) {
        this.data = data;
        this.transate = transate;
        this.successful = successful;
    }

    public SingleResult() {
    }
    

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getTransate() {
        return transate;
    }

    public void setTransate(String transate) {
        this.transate = transate;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    
    
    
}
