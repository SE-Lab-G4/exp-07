package MiniJava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import MiniJava.errorHandler.ErrorHandler;
import MiniJava.parser.Parser;
import MiniJava.parser.ParserFacade;


public class Main {
    public static void main(String[] args) {
        try {
            ParserFacade parserFacade = new ParserFacade(new Scanner(new File("src/main/resources/code")));
            parserFacade.startParsing();
        } catch (FileNotFoundException e) {
            ErrorHandler.printError(e.getMessage());
        }
    }
}
