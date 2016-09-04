import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides=numberOfSides;
        random = new Random();
    }

    public int roll(){
        int p=random.nextInt(numberOfSides+1);
        while(p==0 || p>numberOfSides){
            p=random.nextInt(numberOfSides);
        }
        return p;
    }
}
