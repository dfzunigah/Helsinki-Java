package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private  ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
            
    @Override
    public boolean isOn() {
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int average=0;
        if(!this.isOn() || sensors.isEmpty()){
            throw new IllegalStateException();
        }
        for(Sensor sensor : sensors){
            average+=sensor.measure();
        }
        int meas=(int)(average/sensors.size());
        readings.add(meas);
        return meas;
    }
    
    public List<Integer> readings(){
       return readings;
    }
    
}
