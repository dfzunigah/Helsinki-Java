package farmsimulator;

public class MilkingRobot {
    private BulkTank connected;
    
    public MilkingRobot(){

    }
    
    public BulkTank getBulkTank(){
        if(this.connected ==null){
            return null;
        }
        return this.connected;
    }
    
    public void setBulkTank(BulkTank tank){
        this.connected = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.connected==null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        this.connected.addToTank(milkable.milk());
    }
}
