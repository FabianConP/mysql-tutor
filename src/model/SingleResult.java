package model;

import java.util.List;

public class SingleResult {
    
    private List<Object> data;
    private String translate;
    
    private boolean successful;

    public SingleResult(List<Object> data, String transate, boolean successful) {
        this.data = data;
        this.translate = transate;
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

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    
    
    
}
