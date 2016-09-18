package farmsimulator;
import java.util.Random;

public class Cow implements Milkable, Alive{
    private String name;
    private double capacity;
    private double volume;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.name = NAMES[new Random().nextInt(31)];
        int random = 15 + new Random().nextInt(26);
        this.capacity=random;
        this.volume=0;
    }
    
    public Cow(String name){
        this.name=name;
        int random = 15 + new Random().nextInt(26);
        this.capacity=random;
        this.volume=0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.volume;
    }
    
    public String toString(){
        return this.getName() + " " + Math.ceil(this.getAmount()) + "/" + Math.ceil(this.getCapacity());
    }

    @Override
    public double milk() {
        double answer=this.volume;
        this.volume=0;
        return answer;
    }

    @Override
    public void liveHour() {
        double randomValue = 0.7 + (2.0 - 0.7) *  new Random().nextDouble();
        if((this.volume+randomValue)<=this.capacity){
            this.volume+=randomValue;
        }else{
            this.volume=capacity;
        }
    }
    
    
    
}
