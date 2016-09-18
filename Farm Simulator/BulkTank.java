package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity=2000.0;
        this.volume=0.0;
    }
    
    public BulkTank(double capacity){
        this.capacity=capacity;
        this.volume=0.0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity-this.volume;
    }
    
    public void addToTank(double amount){
        if((this.volume+amount)<=capacity){
            this.volume+=amount;
        }else{
            this.volume=capacity;
        }
    }
    
    public double getFromTank(double amount){
        if(amount>=volume){
            double taken=volume;
            volume=0.0;
            return taken;
        }else{
            volume-=amount;
            return amount;
        }
    }
    
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
