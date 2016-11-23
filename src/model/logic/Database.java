package model.logic;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private String name;
    private Map<String, Table> tables;

    public Database() {
    }

    public Database(String name) {
        this.name = name;
        this.tables = new HashMap<>();
    }

    public Database(String name, Map<String, Table> tables) {
        this.name = name;
        this.tables = tables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Table> getTables() {
        return tables;
    }

    public void setTables(Map<String, Table> tables) {
        this.tables = tables;
    }

    public boolean createTable(Table table, boolean notExists) {
        boolean containsTable = tables.containsKey(name);
        if (containsTable && !notExists)
            return false;
        if (!containsTable)
            tables.put(table.getDef().getName(), table);
        return true;
    }

    public boolean dropTable(String name, boolean notExists) {
        boolean containsTable = tables.containsKey(name);
        if (!containsTable && !notExists)
            return false;
        if (containsTable) {
            tables.remove(name);
        }
        return true;
    }

}
