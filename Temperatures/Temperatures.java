
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Temperature: ");
            double number = Double.parseDouble(reader.nextLine());
            while(number<-30 || number>40){
               System.out.println("Temperature: ");
                number = Double.parseDouble(reader.nextLine());
            }
            Graph.addNumber(number);
            
        }    
        
            

        
    }
}