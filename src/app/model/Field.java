package app.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Field {

    private final ArrayList<StringProperty> data;
    private int currentProperty;

    public Field() {
        this(new ArrayList<>());
    }

    public Field(ArrayList<Object> data) {
        this.data = new ArrayList<>();
        for ( int i = 0; i < data.size(); ++i ) {
            this.data.add(new SimpleStringProperty((String) data.get(i)));
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