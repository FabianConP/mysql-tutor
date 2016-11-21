package model.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Table {

    private TableDefinition def;
    private List<Object[]> data;

    public Table() {
    }

    public Table(TableDefinition def) {
        this.def = def;
        data = new ArrayList<>();
    }

    public Table(TableDefinition definition, List<Object[]> data) {
        this.def = definition;
        this.data = data;
    }

    public TableDefinition getDef() {
        return def;
    }

    public void setDef(TableDefinition def) {
        this.def = def;
    }

    public List<Object[]> getData() {
        return data;
    }

    public void setData(List<Object[]> data) {
        this.data = data;
    }

    private int getNextAIValue(int indexColumn) {
        int index = 0;
        for (Object[] e : data)
            index = Math.max(index, (Integer) e[indexColumn]);
        return index + 1;
    }

    public void insert(List<String> columns, List<Object> values) throws Exception {
        if (Util.checkColumns(def.getColumns(), columns))
            ExceptionHandler.columnFieldException(def.getColumns(), columns);
        List<Column> colsDef = def.getColumns();
        Object[] row = new Object[colsDef.size()];
        int processed = 0;
        for (int i = 0; i < colsDef.size(); i++) {
            Column colDef = colsDef.get(i);
            if (colDef.isAutoIncrement()) {
                row[i] = getNextAIValue(i);
            } else if (colDef.getName().equals(columns.get(processed))) {
                // Check if match the data
                if (Util.matchData(colDef.getType().getDataType(), values.get(processed))) {
                    row[i] = values.get(i);
                    processed++;
                } else {
                    // Throw mismatch exception
                }
            } else if (colDef.isNullable()) {
                // OK, pass
            } else {
                // Throw exception on column colDef.getName()
            }
        }
        if (processed == columns.size())
            data.add(row);
        else {
            // Throw exception on column colDef.getName()
        }
    }

    public void insert(List<Object> values) throws Exception {
        if (def.getColumns().size() < values.size())
            ExceptionHandler.columnFieldException(def.getColumns(), null); // Fix
        List<Column> colsDef = def.getColumns();
        Object[] row = new Object[colsDef.size()];
        int processed = 0;
        for (int i = 0; i < colsDef.size(); i++) {
            Column colDef = colsDef.get(i);
            // Check if match the data
            if (colDef.isAutoIncrement()) {
                row[i] = getNextAIValue(i);
            } else if (Util.matchData(colDef.getType().getDataType(), values.get(processed))) {
                row[i] = values.get(i);
                processed++;
            } else if (!colDef.isNullable()) {
                // Throw mismatch exception
            } else {
                // Throw exception on column colDef.getName()
            }
        }
        if (processed == values.size())
            data.add(row);
        else {
            // Throw exception on column colDef.getName()
        }
    }
    
    

}
