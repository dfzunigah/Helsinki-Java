import java.util.Scanner;

public class TextUserInterface{
    private Scanner reader;
    private Dictionary dictionary;
    
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dictionary=dictionary;
    }
    
    public void add(){
        String finnish,english;
        System.out.print("In Finnish: ");
        finnish=reader.nextLine();
        System.out.print("Translation: ");
        english=reader.nextLine();
        dictionary.add(finnish, english);
    }
    
    public void translate(){
        String finnish;
        System.out.print("Give a word: ");
        finnish=reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(finnish));
    }
    
    public void start(){
        System.out.println("Statements:\n" +
                           "  add - adds a word pair to the dictionary\n" +
                           "  translate - asks a word and prints its translation\n" +
                           "  quit - quits the text user interface\n");
        while(true){
            String answer;
            System.out.print("Statement: ");
            answer=reader.nextLine();
            if(answer.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(answer.equals("add")){
                this.add();
            }else if(answer.equals("translate")){
                this.translate();
            }else{
                System.out.println("Unknown comand");
            }
            System.out.println("");
        }
    }
}
