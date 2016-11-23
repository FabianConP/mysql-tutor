package model.logic;

import java.io.File;
import java.io.FileInputStream;
import model.generated.MySQLLexer;
import model.generated.MySQLParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {
    
    public static void runCommand (String command) {
        ANTLRInputStream input = new ANTLRInputStream(command);

        MySQLLexer lexer = new MySQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySQLParser parser = new MySQLParser(tokens);
        ParseTree tree = parser.commands();

        MyVisitor<Object> loader = new MyVisitor<>();
        loader.visit(tree);
    }
    
}
