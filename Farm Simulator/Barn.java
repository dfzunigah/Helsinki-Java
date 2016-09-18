package farmsimulator;
import java.util.Collection;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank=tank;
        this.robot = new MilkingRobot();
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.robot==null){
            throw new IllegalStateException();
        }else{
            this.robot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        if(this.robot==null){
            throw new IllegalStateException();
        }else{
            for(Cow cow : cows){
                this.robot.milk(cow);
            }
        }
    }

    public String toString(){
        return this.tank.toString();
    }
}
