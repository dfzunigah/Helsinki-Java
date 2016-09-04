public class Airplane {
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity){
        this.id=id;
        this.capacity=capacity;
    }
    
    public String getID(){
        return this.id;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
   
    public String toString(){
        return this.getID() + " (" + this.getCapacity() + " ppl)";
    }
    
}
