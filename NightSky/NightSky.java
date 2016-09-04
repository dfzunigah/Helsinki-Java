import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint=0;
    
    public NightSky(double density){
        this.density=density;
        this.width=20;
        this.height=10;
    }
    
    public NightSky(int width, int height){
        this.density=0.1;
        this.height=height;
        this.width=width;
    }
    
    public NightSky(double density, int width, int height){
        this.density=density;
        this.height=height;
        this.width=width;
    }
    
    public void printLine(){
        Random random = new Random();
        String night="";
        for(int i=0;i<this.width;i++){
            double oneOrOther=random.nextDouble();
            if(oneOrOther>=this.density){
                night+=" ";
            }else{
                night+="*";
                this.starsInLastPrint++;
            }
        } 
        System.out.println(night);
    }
    
    public void print(){
        this.starsInLastPrint=0;
        for(int i=0;i<this.height;i++){
            printLine();
        }
        
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
