package model.logic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import model.QueryResult;
import model.generated.MySQLLexer;
import model.generated.MySQLParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {
    
    
    public static QueryResult result;
    
    public static void runCommand (String command) {
        ANTLRInputStream input = new ANTLRInputStream(command);

        MySQLLexer lexer = new MySQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySQLParser parser = new MySQLParser(tokens);
        ParseTree tree = parser.commands();
        MyVisitor<Object> loader = new MyVisitor<>();
        loader.visit(tree);
        
        /*result = new QueryResult();
        
        
        //Dummy data
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("id");
        columnNames.add("name");
        columnNames.add("email");
        ArrayList<Object> temp = new ArrayList<>();
        temp.add("Milder");
        temp.add("Hernandez");
        temp.add("milderhc");
        
        SingleResult row = new SingleResult(temp, "no transtalation", true);
        ArrayList<SingleResult> data = new ArrayList<>();
        data.add(row);
        data.add(row);
        data.add(row);
        
        
        result.setType(QueryResult.Type.SELECT);
        result.setColumns(columnNames);
        result.setResults(data);
        */
    }
    
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream("input.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        
        MySQLLexer lexer = new MySQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySQLParser parser = new MySQLParser(tokens);
        ParseTree tree = parser.commands();
        MyVisitor<Object> loader = new MyVisitor<>();
        loader.visit(tree);
    }
    
}
