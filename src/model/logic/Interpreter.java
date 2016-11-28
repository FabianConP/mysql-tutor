package model.logic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import model.QueryResult;
import model.SingleResult;
import model.generated.MySQLLexer;
import model.generated.MySQLParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {
    
    public static QueryResult result;
    public static MyVisitor<Object> loader;
    
    public static void runCommand (String command) {
        System.out.println(command);
        
        ANTLRInputStream input = new ANTLRInputStream(command);

        MySQLLexer lexer = new MySQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySQLParser parser = new MySQLParser(tokens);
        ParseTree tree = parser.commands();
        if (loader == null)
            loader = new MyVisitor<>();
        loader.visit(tree);
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
        
        System.out.println(result);
    }
    
}
