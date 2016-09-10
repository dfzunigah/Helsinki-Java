package application;
import java.util.Random;
import application.Sensor;

public class Thermometer implements Sensor{
    private boolean isit;
    
    public Thermometer(){
        this.isit = false;
    }
    
    @Override
    public boolean isOn() {
        return this.isit;
    }

    @Override
    public void on() {
        this.isit=true;
    }

    @Override
    public void off() {
        this.isit=false;
    }

    @Override
    public int measure() {
        Random random = new Random();
        if(this.isit=true){
            int range=61;
            return -30+(int)(range*random.nextDouble());
        }else{
            throw new IllegalStateException();
        }
    }
    
}
