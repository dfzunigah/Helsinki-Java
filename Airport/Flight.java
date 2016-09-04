public class Flight {
    private Airplane plane;
    private String departure;
    private String destination;
    
    public Flight(Airplane plane, String departure, String destination){
        this.plane=plane;
        this.departure=departure;
        this.destination=destination;
    }
    
    public String getID(){
        return this.plane.getID();
    }
    
    public String getDeparture(){
        return this.departure;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String toString(){
        return this.plane.toString() + " (" + this.getDeparture() + "-" + this.getDestination() + ")";
    }
    
}
