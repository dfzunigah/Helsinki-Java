import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
        
        
        /* -AUTOMATED TEST-
        String input = "translate\n" + "monkey\n"  +
                   "translate\n" + "cheese\n" +
                   "add\n"  + "cheese\n" + "juusto\n" +
                   "translate\n" + "cheese\n" +
                   "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
        */
    }
}
