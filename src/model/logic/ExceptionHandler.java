package model.logic;

import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

public class ExceptionHandler {

    public static String COL_DIF_SIZE = "There are incorrect number of columns";

    public static void columnFieldException(List<Column> colDef, List<String> colNames) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(COL_DIF_SIZE);
        sb.append('\n');
        sb.append("Table colums: ");
        //sb.append(Util.listToString(colDef));
        sb.append("Parameters: ");
        //sb.append(Util.listToString(colNames));
        throw new Exception(sb.toString());
    }

    public static void generalException(String... message) throws Exception {
        StringBuilder r = new StringBuilder();
        for(String m : message)
            r.append(m).append(' ');
        throw new Exception(r.toString());
    }

    public static void generalException(ParserRuleContext ctx, String... message) throws Exception {
        int row = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        StringBuilder r = new StringBuilder();
        for(String m : message)
            r.append(m).append(' ');
        throw new Exception("Error in [" + row + "," + col + "]. " + r.toString());
    }
}
