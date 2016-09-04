import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers=new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        }
        return false;
    }
    
        public void drawNumbers() {
            this.numbers = new ArrayList<Integer>();
            Random random = new Random();
            int base=0;
            while(base<7){
                
                int addition=random.nextInt(40);
                while(addition<1 || addition>39){
                    addition=random.nextInt(40);
                }
                if(!containsNumber(addition)){
                    numbers.add(addition);
                    base++;
                }
                
            }
        }
}


