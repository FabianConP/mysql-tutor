package model.logic;

import java.util.List;

public class Util {

    public static boolean checkColumns(List<Column> colDef, List<String> colNames) throws Exception{
        if(colDef.size() > colNames.size())
            ExceptionHandler.columnFieldException(colDef, colNames);
        return false;
    }
    
    public static String listToString(List<Object> data){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        data.forEach(e -> {
            sb.append(e.toString());
            sb.append(',');
            sb.append(' ');
        });
        if(sb.length() > 1)
            sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }
    
    public static boolean matchData(Object a, Object b){
        boolean aIsInteger = Integer.class.isInstance(a);
        boolean aIsDouble = Double.class.isInstance(a);
        boolean aIsVarchar = String.class.isInstance(a);
        boolean aIsBlob = StringBuilder.class.isInstance(a);
        
        boolean bIsInteger = Integer.class.isInstance(b);
        boolean bIsDouble = Double.class.isInstance(b);
        boolean bIsVarchar = String.class.isInstance(b);
        boolean bIsBlob = StringBuilder.class.isInstance(b);
        
        if(aIsInteger)
            return bIsInteger;
        if(aIsDouble)
            return bIsInteger || bIsDouble;
        if(aIsVarchar)
            return bIsVarchar;
        if(aIsBlob)
            return bIsBlob;
        return false;
    }
}
