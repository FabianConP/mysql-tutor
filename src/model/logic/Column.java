package model.logic;

import java.util.Objects;

public class Column {

    private String name;
    private String alias;
    private DataType type;
    private boolean nullable;
    private boolean autoIncrement;

    public Column() {
    }

    public Column(String name, String alias, DataType datatype, boolean nullable, boolean autoIncrement) {
        this.name = name;
        this.alias = alias;
        this.type = datatype;
        this.nullable = nullable;
        this.autoIncrement = autoIncrement;
    }
    
    public Column(String name, DataType datatype, boolean nullable, boolean autoIncrement) {
        this(name, name, datatype, nullable, autoIncrement);
    }

    public Column(String name, String alias){
        this(name, alias, new DataType(), false, false);
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    @Override
    protected Object clone(){
        return (Object) new Column(name, type, nullable, autoIncrement);
    }

    @Override
    public boolean equals(Object obj) {
        Column o = (Column) obj;
        return alias.equals(o.alias);
    }

    @Override
    public int hashCode() {
        return alias.hashCode();
    }

    @Override
    public String toString() {
        return "Column{" + "name=" + name + ", alias=" + alias + ", type=" + type + ", nullable=" + nullable + ", autoIncrement=" + autoIncrement + '}';
    }
    
}
