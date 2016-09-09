import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
    private Scanner reader;
    private ArrayList<Jumper> jumpers;
    
    public Tournament(){
        this.reader = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void read(){
        String answer="";
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            answer=reader.nextLine();
            if(answer.isEmpty()){
                System.out.println("\nThe tournament begins!\n");
                break;
            }else{
                Jumper jumper = new Jumper(answer);
                jumpers.add(jumper);
            }
        }
    }
    
    public void challenge(){
        String answer;
        int roundNumber=1;
        int participants=1;
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            answer = this.reader.nextLine();
            if(answer.equals("jump")){
                System.out.println("\nRound " + roundNumber + "\n");
                System.out.println("Jumping order: ");
                jumperOrder();
                for(Jumper jumper : jumpers){
                    System.out.print("  " + participants + ". ");
                    System.out.println(jumper);
                    participants++;
                }
                participants=1;
                System.out.println();
                for(Jumper jumper : jumpers){
                    jumper.jump();
                }
                System.out.println("Results of round " + roundNumber);
                results();
                roundNumber++;
            }else{
                System.out.println("\nThanks!\n");
                break;
            }
        }
        finale();
    }
    
    public void results(){
        for(Jumper jumper : jumpers){
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getLength());
            System.out.println("    judge votes: " + jumper.getJudgesPoints());
        }
        System.out.println("");
    }
    
    public void jumperOrder(){
        Collections.sort(jumpers);
    }
    
    public void finale(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int position=1;
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for(Jumper jumper : jumpers){
            System.out.println(position + "           " + jumper);
            System.out.println("            jump lengths: " + jumper.getJumpLenghts());
            position++;
        }
    }
}
