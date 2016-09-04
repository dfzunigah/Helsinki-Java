public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
 
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        this.seconds.next();
        if(seconds.getValue()==0){
            minutes.next();
            if(minutes.getValue()==0){
                hours.next();
            }
        }
    }
    
    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
