package dungeon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner reader = new Scanner(System.in);
        String answer="";
        System.out.println("****  VAMPIRE DUNGEONS  ****");*/
        /*
            CREATE A LANGUAJE SELECTOR (SPANISH, ENGLISH, FRENCH)
            MAKE IT MORE INCLUSIVE - ASK AT THE END IF THE USER WANTS TO PLAY AGAIN
            ADD IT TO GITHUB (INDEPENDET PROJECT + HANGMAN)
            THINK ABOUT UI (FOR LATER)
            DO THE SAME WITH HANGMAN
            THINK OF A CAMPAING OR A DIFICCULTY LEVER SELECTOR
        */
        /*System.out.print("\nSelect an option:\n  1. Custom game\n  2. Default Game\n  3. Instructions\n  4. Credits\n\nYour choise (1, 2 or 3): ");
        answer=reader.nextLine();
        if(answer.equals("1")){
            System.out.print("\nPlease, write the length of the map: ");
            int length = Integer.parseInt(reader.nextLine());
            while(length<3 || length>100){
                System.out.print("Write a proper number (+2): ");
                length = Integer.parseInt(reader.nextLine());
            }
            System.out.print("\nPlease, write the height of the map: ");
            int height = Integer.parseInt(reader.nextLine());
            while(height<3 || height>100){
                System.out.print("Write a proper number (+2): ");
                height = Integer.parseInt(reader.nextLine());
            }
            System.out.print("\nPlease, write the number of vampires in the map: ");
            int vampires = Integer.parseInt(reader.nextLine());
            while(vampires<1 || vampires>=(height*length)-1){
                System.out.print("Write a proper number (+0 & -map size): ");
                vampires = Integer.parseInt(reader.nextLine());
            }
            System.out.print("\nPlease, write the number of moves you'll have: ");
            int moves = Integer.parseInt(reader.nextLine());
            while(moves<3){
                System.out.print("Write a proper number (+2): ");
                moves = Integer.parseInt(reader.nextLine());
            }
            Dungeon game = new Dungeon(length,height,vampires,moves,true);
            game.run();
        }else if(answer.equals("2")){*/
            Dungeon game = new Dungeon(10,10,5,14,true);
            game.run();
        /*}else if(answer.equals("3")){
            System.out.println("    **INSTRUCTIONS**");
            //TOBEWROTE
        }else if(answer.equals("4")){
            System.out.println("\nCreated by Daniel F. Zuñiga H.");
            System.out.println("All rights reserved.");
            //TOBECOMPLETED
        }else{
            //WE NEED THIS TO BE INCLUSIVE (REPEAT)    
            System.out.print("Write 1, 2 or 3: ");
            answer=reader.nextLine();
        }*/
    }
}
