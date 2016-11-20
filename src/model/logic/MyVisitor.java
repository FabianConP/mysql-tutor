package model.logic;

import model.generated.MySQLParser;
import model.generated.MySQLParserBaseVisitor;

public class MyVisitor<T> extends MySQLParserBaseVisitor<T> {

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
        return super.visitInsert_clause(ctx);
    }

    @Override
    public T visitDrop_table_clause(MySQLParser.Drop_table_clauseContext ctx) {
        return super.visitDrop_table_clause(ctx);
    }

    @Override
    public T visitCreate_clause(MySQLParser.Create_clauseContext ctx) {
        return super.visitCreate_clause(ctx);
    }

}
