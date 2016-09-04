
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int time=1;
        while(true){
            System.out.println("Guess a number: ");
            int number=Integer.parseInt(reader.nextLine()); 
            if(number<numberDrawn){
                System.out.println("The number is greater, guesses made: " + time);
            }else if(number>numberDrawn){
                System.out.println("The number is lesser, guesses made: " + time);
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            time++;
        }

        
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
