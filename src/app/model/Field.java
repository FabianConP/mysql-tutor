package app.model;

import java.util.ArrayList;

import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Field {

    private final ArrayList<StringProperty> data;
    private int currentProperty;

    public Field() {
        this(new ArrayList<>());
    }

    public Field(List<Object> data) {
        this.data = new ArrayList<>();
        for (Object o : data) {
            this.data.add(new SimpleStringProperty(o.toString()));
        }
        currentProperty = 0;
    }

    public StringProperty getColumnProperty () {
        StringProperty sp = data.get(currentProperty++);
        if ( currentProperty == data.size() )
            resetCurrentProperty();
    	return sp;
    }
    
    public void resetCurrentProperty () {
        currentProperty = 0;
    }
}