package farmsimulator;
import java.util.ArrayList;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;
    
    public Farm(String name, Barn barn){
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : cows){
            cow.liveHour();
        }
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public String toString(){
        if(this.cows.isEmpty()){
            return "Farm owner: " + this.getOwner() + "\nBarn bulk tank: " + this.barn.toString() + "\nNo cows.";
        }else{
            String animals="        ";
            for(Cow cow : cows){
                animals+=cow.toString()+"\n        ";
            }
            animals.trim();
            return "Farm owner: " + this.getOwner() + "\nBarn bulk tank: " 
                    + this.barn.toString() + "\nAnimals:\n" + animals;
        }

    }
    
}
