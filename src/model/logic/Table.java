package model.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Table {

    private TableDefinition def;
    private List<Object[]> data;

    public Table() {
        def = new TableDefinition();
        data = new ArrayList<>();
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

    public void insert(List<Column> columns, List<Object> values) throws Exception {
        try {
//        if (Util.checkColumns(def.getColumns(), columns))
//            ExceptionHandler.columnFieldException(def.getColumns(), columns);
            List<Column> colsDef = def.getColumns();
            Object[] row = new Object[colsDef.size()];
            int processed = 0;
            for (int i = 0; i < colsDef.size(); i++) {
                Column colDef = colsDef.get(i);
                if (colDef.isAutoIncrement()) {
                    row[i] = getNextAIValue(i);
                } else if (colDef.getAlias().equals(columns.get(processed).getAlias())) {
                    // Check if match the data
                    if (Util.matchData(colDef.getType().getDataType(), values.get(processed))) {
                        row[i] = values.get(i);
                        processed++;
                    } else {
                        ExceptionHandler.generalException("Mistmatch exception ",
                                "expecting",
                                colDef.getType().getDataType().toString(),
                                "received",
                                values.get(processed).toString());// Throw mismatch exception
                    }
                } else if (colDef.isNullable()) {
                    // OK, pass
                } else {
                    ExceptionHandler.generalException("Error in column", colDef.getName());
                    // Throw exception on column colDef.getName()
                }
            }
            if (processed == columns.size())
                data.add(row);
            else {
                ExceptionHandler.generalException("There are more columns, expecting",
                        columns.size() + "", "received", processed + "");
                // Throw exception on column colDef.getName()
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
                ExceptionHandler.generalException("Mistmatch exception ",
                        "expecting",
                        colDef.getType().getDataType().toString(),
                        "received",
                        values.get(processed).toString());// Throw mismatch exception
            } else {
                ExceptionHandler.generalException("Error in column", colDef.getName());
                // Throw exception on column colDef.getName()
            }
        }
        if (processed == values.size())
            data.add(row);
        else {
            ExceptionHandler.generalException("There are more columns, expecting",
                    values.size() + "", "received", processed + "");
            // Throw exception on column colDef.getName()
        }
    }

    public Map<String, Object> getRowAsMap(int index) {
        try {
            if (index < 0 || index >= data.size())
                ExceptionHandler.generalException("Index must be non negative, " + index); // Throw new index out of bounds exception

            Map<String, Object> map = new HashMap<>();
            Object[] row = data.get(index);

            for (int i = 0; i < def.getColumns().size(); i++)
                map.put(def.getColumns().get(i).getName(), row[i]);

            return map;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static Table crossTables(Table... tables) {
        try {

            int numCols = 0;
            TableDefinition tableDef = new TableDefinition();
            Set<String> tableNames = new HashSet<>();
            for (Table table : tables) {
                if (tableNames.contains(table.getDef().getAlias()))
                    ExceptionHandler.generalException("Not unique table alias for", table.getDef().getAlias()); // Throw new exception, Not unique table alias
                tableNames.add(table.getDef().getAlias());
            }
            StringBuilder crossTableName = new StringBuilder();
            for (Table table : tables) {
                String tableId = table.getDef().getAlias();
                if (crossTableName.length() > 0)
                    crossTableName.append('.');
                crossTableName.append(tableId);
                numCols += table.getDef().getColumns().size();
                for (Column column : table.getDef().getColumns()) {
                    Column newCol = (Column) column.clone();
                    String newColId = newCol.getName();
                    if (tables.length > 1)
                        newColId = tableId + "." + newColId;
                    newCol.setName(newColId);
                    newCol.setAlias(newColId);
                    tableDef.getColumns().add(newCol);
                }
            }
            Object[] data = new Object[numCols];
            tableDef.setName(crossTableName.toString());
            tableDef.setAlias(crossTableName.toString());
            Table table = new Table(tableDef);
            generateCrossTables(table, tables, 0, 0, data);
            return table;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private static void generateCrossTables(Table table, Table[] tables, int indexTable, int numCols, Object[] data) {
        if (indexTable == tables.length) {
            table.data.add(data.clone());
            return;
        }
        Table curTable = tables[indexTable];
        for (Object[] row : curTable.getData()) {
            int numColsNewRow = numCols;
            for (Object element : row)
                data[numColsNewRow++] = element;
            generateCrossTables(table, tables, indexTable + 1, numColsNewRow, data);
        }
    }

    @Override
    public String toString() {
        StringBuilder r = new StringBuilder();
        r.append("Table def: ").append(def).append('\n');
        r.append("----------------------------------------\n");
        data.forEach(row -> {
            r.append('|');
            for (Object element : row)
                r.append(element).append('\t');
            r.append('|').append('\n');
        });
        r.append("----------------------------------------\n");
        return r.toString();
    }

}
