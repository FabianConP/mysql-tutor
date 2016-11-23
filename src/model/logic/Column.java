package model.logic;

public class Column {

    private String name;
    private DataType type;
    private boolean nullable;
    private boolean autoIncrement;

    public Column() {
    }

    public Column(String name, DataType datatype, boolean nullable, boolean autoIncrement) {
        this.name = name;
        this.type = datatype;
        this.nullable = nullable;
        this.autoIncrement = autoIncrement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Override
    protected Object clone(){
        return (Object) new Column(name, type, nullable, autoIncrement);
    }
    
    

}
