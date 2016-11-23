package model.logic;

import java.util.List;

public class ExceptionHandler {
    
    public static String COL_DIF_SIZE = "There are incorrect number of columns";
    
    public static void columnFieldException(List<Column> colDef, List<String> colNames) throws Exception{
        StringBuilder sb = new StringBuilder();
        sb.append(COL_DIF_SIZE);
        sb.append('\n');
        sb.append("Table colums: ");
        //sb.append(Util.listToString(colDef));
        sb.append("Parameters: ");
        //sb.append(Util.listToString(colNames));
        throw new Exception(sb.toString());
    }
}
