package model.logic;

import app.MySQLTutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.generated.MySQLParser;
import model.generated.MySQLParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor<T> extends MySQLParserBaseVisitor<T> {

    private Map<String, Table> tables;

    public MyVisitor() {
        tables = new HashMap<>();
    }
    
    @Override
    public T visitSelect_clause(MySQLParser.Select_clauseContext ctx) {

        return super.visitSelect_clause(ctx);
    }

    @Override
    public T visitDelete_clause(MySQLParser.Delete_clauseContext ctx) {
        return super.visitDelete_clause(ctx);
    }

    @Override
    public T visitUpdate_clause(MySQLParser.Update_clauseContext ctx) {
        return super.visitUpdate_clause(ctx);
    }

    @Override
    public T visitInsert_clause(MySQLParser.Insert_clauseContext ctx) {
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if(!tableExists)
            ; // Throw new exception, table does not exists
        List<String> colNames = new ArrayList<>();
        if(ctx.column_list() != null)
            colNames = (List<String>) visitColumn_list(ctx.column_list());
        List<Object> values = new ArrayList<>();
        if(ctx.list_values() != null)
            values = (List<Object>) visitList_values(ctx.list_values());
        Table curTable = tables.get(tableName);
        try {
            curTable.insert(colNames, values);
        } catch (Exception ex) {
           // Throw new exception, inserting into 'tableName'
        }
        
        return super.visitInsert_clause(ctx);
    }

    @Override
    public T visitDrop_table_clause(MySQLParser.Drop_table_clauseContext ctx) {
        boolean ifExists = ctx.IF() != null;
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if(!tableExists && !ifExists)
            ; // Throw new exception, table does not exists
        tables.remove(tableName);
        return super.visitDrop_table_clause(ctx);
    }

    @Override
    public T visitCreate_clause(MySQLParser.Create_clauseContext ctx) {
        System.out.println("Creation");
        
        boolean ifNotExists = ctx.IF() != null;
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if(tableExists && !ifNotExists)
            ; // Throw new exception, table already exists
        Column[] cols = (Column[]) visit(ctx.column_list_definition());
        List<Column> columns = new ArrayList<>();
        for(Column c: cols)
            columns.add(c);
        List<Constraint> constraints = new ArrayList<>();
        TableDefinition tableDef = new TableDefinition(tableName, columns, constraints);
        Table table = new Table(tableDef);
        tables.put(tableName, table);
        return super.visitCreate_clause(ctx);
    }

    @Override
    public T visitColumn_list_definition(MySQLParser.Column_list_definitionContext ctx) {
        List<Column> cols = new ArrayList<>();
        for(MySQLParser.Column_definitionContext column : ctx.column_definition())
            cols.add((Column) visitColumn_definition(column));
        Column[] columns = new Column[cols.size()];
        for(int i = 0; i < cols.size(); i++)
            columns[i] = cols.get(i);
        return (T) columns;
    }

    @Override
    public T visitColumn_list_attributes(MySQLParser.Column_list_attributesContext ctx) {
        // Not null, auto increment
        boolean[] attrib = new boolean[2];
        boolean[] aux;
        for (MySQLParser.Column_attributeContext attribute : ctx.column_attribute()) {
            aux = (boolean[]) visitColumn_attribute(attribute);
            for (int i = 0; i < attrib.length; i++)
                attrib[i] |= aux[i];
        }
        return (T) attrib;
    }

    @Override
    public T visitData_type(MySQLParser.Data_typeContext ctx) {
        String type = "";
        if(ctx.INT_DT() != null)
            type = DataType.INTEGER;
        else if(ctx.DOUBLE_DT() != null)
            type = DataType.DOUBLE;
        else if(ctx.VARCHAR_DT() != null)
            type = DataType.VARCHAR;
        else if(ctx.BLOB_DT() != null)
            type = DataType.BLOB;
        return (T) type;
    }

    @Override
    public T visitColumn_attribute(MySQLParser.Column_attributeContext ctx) {
        return (T) new boolean[]{ctx.NOT() != null, ctx.AUTO() != null};
    }

    @Override
    public T visitColumn_definition(MySQLParser.Column_definitionContext ctx) {
        String name = (String) visitColumn_name(ctx.column_name());
        boolean[] attributes = new boolean[2];
        if (ctx.column_list_attributes() != null)
            attributes = (boolean[]) visitColumn_list_attributes(ctx.column_list_attributes());
        boolean nullable = attributes[0];
        boolean autoIncrement = attributes[1];
        String type = "";
        if(ctx.data_type() != null)
            type = (String) visitData_type(ctx.data_type());
        Column column = new Column(name, new DataType(type), nullable, autoIncrement);
        return (T) column;
    }

    @Override
    public T visitColumn_list(MySQLParser.Column_listContext ctx) {
        List<String> colNames = new ArrayList<>();
        for(MySQLParser.Column_nameContext col: ctx.column_name())
            colNames.add((String) visitColumn_name(col));
        return (T) colNames;
    }

    @Override
    public T visitColumn_name(MySQLParser.Column_nameContext ctx) {
        StringBuilder fullName = new StringBuilder();
        for (TerminalNode name : ctx.ID()) {
            if (fullName.length() > 0)
                fullName.append('.');
            fullName.append(name.getText());
        }
        return (T) fullName.toString();
    }

    @Override
    public T visitList_values(MySQLParser.List_valuesContext ctx) {
        List<Object> values = new LinkedList<>();
        for(MySQLParser.ExpressionContext expr : ctx.expression())
            values.add(visitExpression(expr));
        return (T) values;
    }
    
    
    
    

    
    
}
