import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Jumper implements Comparable{
    private String name;
    private ArrayList<Integer> judgesPoints;
    private int totalPoints;
    private int lenght;
    private ArrayList<Integer> jumpLenghts;
    
    public Jumper(String name){
       this.name=name;
       this.judgesPoints= new ArrayList<Integer>();
       this.lenght=0;
       this.totalPoints=0;
       this.jumpLenghts= new ArrayList<Integer>();
    }
    
    public String toString(){
        return this.name + " (" + this.totalPoints + " points)";
    }
    
    public int getTotalPoints(){
        return this.totalPoints;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getLength(){
        return this.lenght;
    }
    
    public String getJumpLenghts(){
        String answer="";
        /*this.jumpLenghts.sort(null);
        Collections.sort(jumpLenghts);
        Collections.reverse(jumpLenghts);*/
        for(Integer base : jumpLenghts){
            answer+=base + " m,";
        }
        String newAnswer=answer.substring(0,answer.length()-1);
        return newAnswer;
        
    }
    
    public String getJudgesPoints(){
        String answer="[";
        for(Integer base : judgesPoints){
            answer+=base+", ";
        }
        String newAnswer=answer.substring(0, 19)+"]";
        return newAnswer;
    }
    
    public void jump(){
        Random random = new Random();
        int lenghtRange=120-60+1;
        int judgeRange=20-10+1;
        this.lenght=60+(int)(lenghtRange*random.nextDouble());
        this.jumpLenghts.add(this.lenght);
        for(int i=0;i<5;i++){
            this.judgesPoints.add(10+(int)(judgeRange*random.nextDouble()));
        }  
        judgesPoints.sort(null);
        int adding=judgesPoints.get(1) + judgesPoints.get(2) + judgesPoints.get(3) + this.lenght;
        this.totalPoints+=adding;
    }
    
    public int compareTo(Object jumper){
        int comparePoints = ((Jumper)jumper).getTotalPoints();
        return this.totalPoints-comparePoints;
    }

}
