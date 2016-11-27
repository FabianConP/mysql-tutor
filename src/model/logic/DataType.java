package model.logic;

class DataType {
    
    public static final String INTEGER = Integer.class.getSimpleName();
    public static final String DOUBLE = Double.class.getSimpleName();
    public static final String VARCHAR = String.class.getSimpleName();
    public static final String BLOB = StringBuilder.class.getSimpleName();
    
    String type;
    
    public DataType(){
    }
    
    public DataType(String type){
        this.type = type;
    }
    
    public Object getDataType(){
        if(type.equals(INTEGER)){
            return 0.0;
        }else if(type.equals(DOUBLE)){
            return 0.0;
        }else if(type.equals(VARCHAR))
            return "";
        else if(type.equals(BLOB))
            return new StringBuilder();
        return null;
    }
}
