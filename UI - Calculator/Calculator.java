public class Calculator {
    private int value;
    
    public Calculator(){
        this.value = 0;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void pressPlus(int n){
        this.value += n;
    }
    
    public void pressMinus(int n){
        this.value -= n;
    }
    
    public void pressZed(){
        this.value = 0;
    }
    
    public void pressBy(int n){
        this.value*=n;
    }
    
    public void pressMod(int n){
        this.value%=n;
    }
}