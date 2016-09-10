import java.io.File;
import java.util.Scanner;

public class Printer {
    private Scanner reader;
    private File file;
    
    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
        this.reader = new Scanner(file, "UTF-8");
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        reader = new Scanner(file,"UTF-8");
        if(word==""){
            while(reader.hasNextLine()){
                String read = reader.nextLine();
                System.out.println(read);
            }
        }else{
            while(reader.hasNextLine()){
                String read = reader.nextLine();
                if(read.contains(word)){
                    System.out.println(read);
                }
            }
        }
        reader.close();
    }
}
