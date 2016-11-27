package model.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Util {

    public static final double EPS = 1e-9;

    public static boolean checkColumns(List<Column> colDef, List<String> colNames) throws Exception {
        if (colDef.size() > colNames.size())
            ExceptionHandler.columnFieldException(colDef, colNames);
        return false;
    }

    public static String listToString(List<Object> data) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        data.forEach(e -> {
            sb.append(e.toString());
            sb.append(',');
            sb.append(' ');
        });
        if (sb.length() > 1)
            sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }

    public static boolean matchData(Object a, Object b) {
        boolean aIsInteger = Integer.class.isInstance(a);
        boolean aIsDouble = Double.class.isInstance(a);
        boolean aIsVarchar = String.class.isInstance(a);
        boolean aIsBlob = StringBuilder.class.isInstance(a);

        boolean bIsInteger = Integer.class.isInstance(b);
        boolean bIsDouble = Double.class.isInstance(b);
        boolean bIsVarchar = String.class.isInstance(b);
        boolean bIsBlob = StringBuilder.class.isInstance(b);

        if (aIsInteger)
            return bIsInteger;
        if (aIsDouble)
            return bIsInteger || bIsDouble;
        if (aIsVarchar)
            return bIsVarchar;
        if (aIsBlob)
            return bIsBlob;
        return false;
    }

    public static Object getCorrectNumericObject(double num) {
        Integer round = (int) Math.round(num);
        if (cmp(round, num) == 0)
            return round;
        return (Double) num;
    }

    public static int cmp(double a, double b) {
        double dif = a - b;
        if (Math.abs(dif) < EPS)
            return 0;
        return dif < 0 ? -1 : 1;
    }

    public static List<Object> arrayAsList(Object[] array) {
        List<Object> list = new ArrayList<>(array.length);
        for (Object element : array)
            list.add(element);
        return list;
    }

    public static Object[] listAsArray(List<Object> list) {
        Object[] array = new Object[list.size()];
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        return array;
    }

    public static Object cmpOp(int cmp, String op) {
        Object r = null;
        switch (op) {
            case "=":
                r = cmp == 0;
                break;
            case "<":
                r = cmp == -1;
                break;
            case ">":
                r = cmp == 1;
                break;
            case "!=":
                r = cmp != 0;
                break;
            case "<=":
                r = cmp <= 0;
                break;
            case ">=":
                r = cmp >= 0;
                break;
        }
        return r;
    }

    public static Object cmpNumeric(double a, double b, String op) {
        int cmp = cmp(a, b);
        return cmpOp(cmp, op);
    }

    public static Object cmpString(String a, String b, String op) {
        int cmp = a.compareTo(b);
        return cmpOp(cmp, op);
    }

    public static Object cmpBoolean(boolean a, boolean b, String op) {
        Object r = null;
        switch (op) {
            case "AND":
                r = a && b;
                break;
            case "XOR":
                r = a ^ b;
                break;
            case "OR":
                r = a || b;
                break;
        }
        return r;
    }
}
