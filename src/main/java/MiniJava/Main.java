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
            Scanner scanner = new Scanner(new File("src/main/resources/code"));
            ParserFacade parserFacade = new ParserFacade(scanner);
            parserFacade.startParsing();
        } catch (FileNotFoundException e) {
            ErrorHandler.printError(e.getMessage());
        }
    }
}
