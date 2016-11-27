package model.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import static jdk.nashorn.tools.ShellFunctions.input;
import model.generated.MySQLParser;
import model.generated.MySQLParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor<T> extends MySQLParserBaseVisitor<T> {

    private Map<String, Table> tables;
    private Map<String, Object> row;
    private Map<String, Object> columnAssig;

    public MyVisitor() {
        tables = new HashMap<>();
        row = new HashMap<>();
        columnAssig = new HashMap<>();
    }

    @Override
    public T visitSelect_clause(MySQLParser.Select_clauseContext ctx) {
        if (ctx.column_list_clause() == null)
            ; // Throw new exception, error column list
        List<Column> columns = null;
        if (ctx.column_list_clause() != null)
            columns = (List<Column>) visitColumn_list_clause(ctx.column_list_clause());
        else if (ctx.ASTERISK() != null) {

        }
        List<String> colNames = new LinkedList<>();
        columns.forEach(column -> colNames.add(column.getAlias()));
        if (ctx.join_clause() != null) {

        } else if (ctx.table_references() != null) {
            List<Table> tables = (List<Table>) visitTable_references(ctx.table_references());
            Table crossTable = Table.crossTables(tables.toArray(new Table[tables.size()]));
            Table filteredTable = crossTable;
            if (ctx.where_clause() != null)
                filteredTable = filterTableByWhereClause(crossTable, ctx.where_clause());
            System.out.println("Selecting");
            System.out.println(filteredTable);
        }
        return super.visitSelect_clause(ctx);
    }

    public Table filterTableByWhereClause(Table fullTable, MySQLParser.Where_clauseContext whereClause) {
        Table filteredTable = new Table();
        TableDefinition def = fullTable.getDef();
        filteredTable.setDef(def);
        for (int i = 0; i < fullTable.getData().size(); i++) {
            try {
                row = fullTable.getRowAsMap(i);
                boolean condition = (Boolean) visitWhere_clause(whereClause);
                if (condition)
                    filteredTable.insert(Util.arrayAsList(fullTable.getData().get(i)));
            } catch (Exception ex) {
                ex.printStackTrace(); // Throw new exception, filtering table
            }
        }
        return filteredTable;
    }

    @Override
    public T visitWhere_clause(MySQLParser.Where_clauseContext ctx) {
        Object r = visitExpression(ctx.expression());
        if (!Boolean.class.isInstance(r))
            ; // Throw new exception, invalidad where clause
        return (T) r;
    }

    @Override
    public T visitColumn_list_clause(MySQLParser.Column_list_clauseContext ctx) {
        List<Column> columns = new LinkedList<>();
        ctx.column_name().forEach(column -> columns.add((Column) visitColumn_name(column)));
        return (T) columns;
    }

    @Override
    public T visitDelete_clause(MySQLParser.Delete_clauseContext ctx) {
        String tableName = ctx.table_name().getText();
        Table fullTable = tables.get(tableName);
        Table resultTable = new Table(fullTable.getDef());
        for (int i = 0; i < fullTable.getData().size(); i++) {
            boolean condition = true;
            loadRow(fullTable.getDef().getColumns(), fullTable.getData().get(i));
            if (ctx.where_clause() != null)
                condition = (Boolean) visitWhere_clause(ctx.where_clause());
            if (!condition)
                try {
                    resultTable.insert(Util.arrayAsList(fullTable.getData().get(i)));
                } catch (Exception ex) {
                    ex.printStackTrace(); // Throw new exception, deleting element i
                }
        }
        tables.put(tableName, resultTable);
        System.out.println("Removing");
        System.out.println(resultTable);
        return super.visitDelete_clause(ctx);
    }

    private void loadRow(List<Column> columns, Object[] data) {
        row = new HashMap<>();
        for (int i = 0; i < data.length; i++)
            row.put(columns.get(i).getAlias(), data[i]);
    }

    @Override
    public T visitUpdate_clause(MySQLParser.Update_clauseContext ctx) {
        String tableName = ctx.table_name().getText();
        Table fullTable = tables.get(tableName);
        TableDefinition def = fullTable.getDef();
        visitColumn_list_assignment(ctx.column_list_assignment());
        for (int i = 0; i < fullTable.getData().size(); i++) {
            Object[] data = fullTable.getData().get(i);
            boolean condition = true;
            loadRow(fullTable.getDef().getColumns(), data);
            if (ctx.where_clause() != null)
                condition = (Boolean) visitWhere_clause(ctx.where_clause());
            if (condition)
                try {
                    for (int j = 0; j < def.getColumns().size(); j++) {
                        String colName = def.getColumns().get(j).getName();
                        if (columnAssig.containsKey(colName))
                            data[j] = columnAssig.get(colName);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace(); // Throw new exception, updating element i
                }
        }
        System.out.println("Updating");
        System.out.println(fullTable);
        return super.visitUpdate_clause(ctx);
    }

    @Override
    public T visitColumn_assignment(MySQLParser.Column_assignmentContext ctx) {
        Column column = (Column) visitColumn_name(ctx.column_name());
        Object value = visitExpression(ctx.expression());
        columnAssig.put(column.getAlias(), value);
        return super.visitColumn_assignment(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T visitColumn_list_assignment(MySQLParser.Column_list_assignmentContext ctx) {
        columnAssig = new HashMap<>();
        ctx.column_assignment().forEach(column -> visitColumn_assignment(column));
        return super.visitColumn_list_assignment(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T visitInsert_clause(MySQLParser.Insert_clauseContext ctx) {
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if (!tableExists)
            ; // Throw new exception, table does not exists
        List<Column> columns = new LinkedList<>();
        if (ctx.column_list() != null)
            columns = (List<Column>) visitColumn_list(ctx.column_list());
        List<Object> values = new LinkedList<>();
        if (ctx.list_values() != null)
            values = (List<Object>) visitList_values(ctx.list_values());
        Table curTable = tables.get(tableName);
        if (columns.isEmpty())
            columns.addAll(curTable.getDef().getColumns());
        try {
            curTable.insert(columns, values);
        } catch (Exception ex) {
            ex.printStackTrace();
            // Throw new exception, inserting into 'tableName'
        }
        System.out.println("Inserting");
        System.out.println(curTable);
        return super.visitInsert_clause(ctx);
    }

    @Override
    public T visitDrop_table_clause(MySQLParser.Drop_table_clauseContext ctx) {
        boolean ifExists = ctx.IF() != null;
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if (!tableExists && !ifExists)
            ; // Throw new exception, table does not exists
        tables.remove(tableName);
        return super.visitDrop_table_clause(ctx);
    }

    @Override
    public T visitCreate_clause(MySQLParser.Create_clauseContext ctx) {
        boolean ifNotExists = ctx.IF() != null;
        String tableName = ctx.table_name().getText();
        boolean tableExists = tables.containsKey(tableName);
        if (tableExists && !ifNotExists)
            ; // Throw new exception, table already exists
        Column[] cols = (Column[]) visitColumn_list_definition(ctx.column_list_definition());
        List<Column> columns = new ArrayList<>();
        columns.addAll(Arrays.asList(cols));
        List<Constraint> constraints = new ArrayList<>();
        TableDefinition tableDef = new TableDefinition(tableName, columns, constraints);
        Table table = new Table(tableDef);
        tables.put(tableName, table);

        System.out.println("Created");
        System.out.println(table);
        return super.visitCreate_clause(ctx);
    }

    @Override
    public T visitColumn_list_definition(MySQLParser.Column_list_definitionContext ctx) {
        List<Column> cols = new ArrayList<>();
        ctx.column_definition().forEach((column) -> {
            cols.add((Column) visitColumn_definition(column));
        });
        Column[] columns = new Column[cols.size()];
        for (int i = 0; i < cols.size(); i++)
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
        if (ctx.INT_DT() != null)
            type = DataType.INTEGER;
        else if (ctx.DOUBLE_DT() != null)
            type = DataType.DOUBLE;
        else if (ctx.VARCHAR_DT() != null)
            type = DataType.VARCHAR;
        else if (ctx.BLOB_DT() != null)
            type = DataType.BLOB;
        return (T) type;
    }

    @Override
    public T visitColumn_attribute(MySQLParser.Column_attributeContext ctx) {
        return (T) new boolean[]{ctx.NOT() != null, ctx.AUTO() != null};
    }

    @Override
    public T visitColumn_definition(MySQLParser.Column_definitionContext ctx) {
        String name = ((Column) visitColumn_name(ctx.column_name())).getAlias();
        boolean[] attributes = new boolean[2];
        if (ctx.column_list_attributes() != null)
            attributes = (boolean[]) visitColumn_list_attributes(ctx.column_list_attributes());
        boolean nullable = attributes[0];
        boolean autoIncrement = attributes[1];
        String type = "";
        if (ctx.data_type() != null)
            type = (String) visitData_type(ctx.data_type());
        Column column = new Column(name, new DataType(type), nullable, autoIncrement);
        return (T) column;
    }

    @Override
    public T visitColumn_list(MySQLParser.Column_listContext ctx) {
        List<Column> colNames = new ArrayList<>();
        for (MySQLParser.Column_nameContext col : ctx.column_name())
            colNames.add((Column) visitColumn_name(col));
        return (T) colNames;
    }

    @Override
    public T visitColumn_name(MySQLParser.Column_nameContext ctx) {
        Column column = new Column();
        StringBuilder fullName = new StringBuilder();
        for (TerminalNode name : ctx.ID()) {
            if (fullName.length() > 0)
                fullName.append('.');
            fullName.append(name.getText());
        }
        String name = fullName.toString();
        String alias = name;
        if (ctx.AS() != null)
            alias = ctx.ID().get(ctx.ID().size() - 1).getText();
        column.setName(name);
        column.setAlias(alias);
        return (T) column;
    }

    @Override
    public T visitList_values(MySQLParser.List_valuesContext ctx) {
        List<Object> values = new LinkedList<>();
        ctx.expression().forEach((expr) -> {
            values.add(visitExpression(expr));
        });
        return (T) values;
    }

    @Override
    public T visitExpression(MySQLParser.ExpressionContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override
    public T visitExpr(MySQLParser.ExprContext ctx) {
        Object r = null;
        if (ctx.element() != null) {
            r = visitElement(ctx.element());
        } else if (ctx.expr_op() != null) {
            Object objA = visitExpr(ctx.expr(0));
            Object objB = visitExpr(ctx.expr(1));
            boolean aIsBoolean = Boolean.class.isInstance(objA);
            boolean bIsBoolean = Boolean.class.isInstance(objB);
            if (aIsBoolean && bIsBoolean) {
                boolean a = (Boolean) objA;
                boolean b = (Boolean) objB;
                String op = (String) visitExpr_op(ctx.expr_op());
                r = Util.cmpBoolean(a, b, op);
            } else {
            }
        } else if (ctx.mul_op() != null || ctx.SUM() != null || (ctx.RES() != null && ctx.expr().size() == 2)) {
            Double a, b;
            String strA = ctx.expr(0).getText();
            String strB = ctx.expr(1).getText();
            if (row.containsKey(strA))
                a = (Double) row.get(strA);
            else
                a = Double.parseDouble(strA);
            if (row.containsKey(strB))
                b = (Double) row.get(strB);
            else
                b = Double.parseDouble(strB);
            if (ctx.mul_op() != null) {
                String op = (String) visitMul_op(ctx.mul_op());
                if (op.equals('*'))
                    r = Util.getCorrectNumericObject(a * b);
                else if (op.equals('/')) {
                    if (Util.cmp(b, 0) == 0)
                    ; // Throw new exception, division by zero
                    r = Util.getCorrectNumericObject(a / b);
                }
            } else if (ctx.SUM() != null) {
                r = Util.getCorrectNumericObject(a + b);
            } else if (ctx.RES() != null && ctx.expr().size() == 2) {
                r = Util.getCorrectNumericObject(a - b);
            }
        } else if (ctx.relational_op() != null) {
            Object objA = visitExpr(ctx.expr(0));
            Object objB = visitExpr(ctx.expr(1));
            boolean aIsDouble = Double.class.isInstance(objA);
            boolean bIsDouble = Double.class.isInstance(objB);
            boolean aIsString = String.class.isInstance(objA);
            boolean bIsString = String.class.isInstance(objB);
            String op = (String) visitRelational_op(ctx.relational_op());
            if (aIsDouble && bIsDouble) {
                Double a = (Double) objA;
                Double b = (Double) objB;
                r = Util.cmpNumeric(a, b, op);
            } else if (aIsString && bIsString) {
                String a = (String) objA;
                String b = (String) objB;
                r = Util.cmpString(a, b, op);
            } else {
                // Throw new exception, invalid types
            }
        } else if (ctx.RES() != null) {
            Double a = Double.parseDouble(ctx.expr(0).getText());
            r = Util.getCorrectNumericObject(-a);
        } else if (ctx.LPAREN() != null) {
            r = visitExpr(ctx.expr(0));
        } else {
            // Throw new exception, invalid expression
        }
        return (T) r;
    }

    @Override
    public T visitIs_or_is_not(MySQLParser.Is_or_is_notContext ctx) {
        if (ctx.NOT() != null)
            return (T) (Boolean) false;
        return (T) (Boolean) true;
    }

    @Override
    public T visitMul_op(MySQLParser.Mul_opContext ctx) {
        String r = null;
        if (ctx.MUL() != null)
            r = "*";
        else if (ctx.DIV() != null)
            r = "/";
        else
            ; // Throw new exception unknown value ctx...
        return (T) r;
    }

    @Override
    public T visitExpr_op(MySQLParser.Expr_opContext ctx) {
        String op = "";
        if (ctx.AND() != null) {
            op = "AND";
        } else if (ctx.XOR() != null) {
            op = "XOR";
        } else if (ctx.OR() != null) {
            op = "OR";
        }
//        else if (ctx.NOT() != null) {
//            op = "NOT";
//        }
        return (T) op;
    }

    @Override
    public T visitRelational_op(MySQLParser.Relational_opContext ctx) {
        String op = "";
        if (ctx.EQ() != null) {
            op = "=";
        } else if (ctx.LTH() != null) {
            op = "<";
        } else if (ctx.GTH() != null) {
            op = ">";
        } else if (ctx.NOT_EQ() != null) {
            op = "!=";
        } else if (ctx.LET() != null) {
            op = "<=";
        } else if (ctx.GET() != null) {
            op = ">=";
        }
        return (T) op;
    }

    @Override
    public T visitElement(MySQLParser.ElementContext ctx) {
        Object r = null;
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!row.containsKey(id))
                ; // Throw new unknown value
            r = row.get(id);
        } else if (ctx.INT() != null) {
            r = Double.parseDouble(ctx.INT().getText());
        } else if (ctx.DOUBLE() != null) {
            r = Double.parseDouble(ctx.DOUBLE().getText());
        } else if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            r = text.substring(1, text.length() - 1);
        }
        return (T) r;
    }

    @Override
    public T visitTable_references(MySQLParser.Table_referencesContext ctx) {
        List<Table> tables = new LinkedList<>();
        ctx.table_alias().forEach(table -> tables.add((Table) visitTable_alias(table)));
        return (T) tables;
    }

    @Override
    public T visitTable_alias(MySQLParser.Table_aliasContext ctx) {
        String name = ctx.ID().get(0).getText();
        String alias = name;
        if (ctx.ID().size() == 2)
            alias = ctx.ID().get(1).getText();
        Table table = new Table();
        table.getDef().setName(name);
        table.getDef().setAlias(alias);
        if (tables.containsKey(name)) {
            Table fullTable = tables.get(name);
            table.getDef().getColumns().addAll(fullTable.getDef().getColumns());
            table.getData().addAll(fullTable.getData());
        }
        return (T) table;
    }

}
