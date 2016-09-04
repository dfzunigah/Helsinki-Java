import java.util.Scanner;
import java.util.ArrayList;

public class Airport {
    private Scanner reader;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    
    public Airport(Scanner reader){
        this.reader=reader;
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void getPlanes(){
        for(Airplane plane : this.airplanes){
            System.out.println(plane);
        }
    }
    
    public void getFlights(){
        for(Flight flight : flights){
            System.out.println(flight);
        }
    }
    
    public void getOnePlane(){
        String answer;
        System.out.print("Give plane ID: ");
        answer=reader.nextLine();
        for(Airplane plane : airplanes){
            if(plane.getID().equals(answer)){
                System.out.println(plane);
                break;
            }
        }
    }
    
    public void addPlane(){
        String id;
        int cap;
        System.out.print("Give plane ID: ");
        id=reader.nextLine();
        System.out.print("Give plane capacity: ");
        cap=Integer.parseInt(reader.nextLine());
        Airplane newAirplane = new Airplane(id,cap);
        if(airplanes.isEmpty()){
            airplanes.add(newAirplane);
        }else{
            int base=0;
            for(Airplane plane : airplanes){
                if(plane.getID().equals(id)){
                    System.out.println("That airplane is already in the list.");
                    base++;
                }
            }
            if(base==0){
                airplanes.add(newAirplane);
            }
        }
    }

    public void addFlight(){
        if(airplanes.isEmpty()){
            System.out.println("First you need to add a plane.");
        }else{
            String id,dep,des;
            System.out.print("Give plane ID: ");
            id=reader.nextLine();
            System.out.print("Give departure airport code: ");
            dep=reader.nextLine();
            System.out.print("Give destination airport code: ");
            des=reader.nextLine();
            int base=0;
            for(Airplane plane : airplanes){
                if(plane.getID().equals(id)){
                    Flight newflight = new Flight(plane,dep,des);
                    flights.add(newflight);
                    base=0;
                    break;
                }else{
                    base++;
                }
            }
            if(base!=0){
                System.out.println("There's not a plane with that ID");
            }
        }
    }
    
    public void workerUI(){
        System.out.println("Airport panel\n" +
                           "--------------------\n");
        while(true){
            String answer;
            System.out.print("Choose operation:\n" +
                               "[1] Add airplane\n" +
                               "[2] Add flight\n" +
                               "[x] Exit\n" +
                               "> ");
            answer=reader.nextLine();
            answer=answer.trim();
            if(answer.equals("1")){
                addPlane();
            }else if(answer.equals("2")){
                addFlight();
            }else if(answer.equals("x")){
                break;
            }else{
                System.out.println("Unknown command");
            }
            System.out.println("");
        }
    }
    
    public void userUI(){
        System.out.println("\nFlight service\n" +
                           "------------\n");
        while(true){
            String answer;
            System.out.print("Choose operation:\n" +
                             "[1] Print planes\n" +
                             "[2] Print flights\n" +
                             "[3] Print plane info\n" +
                             "[x] Quit\n" +
                             "> ");
            answer=reader.nextLine();
            System.out.println(answer);
            if(answer.equals("1")){
                getPlanes();
            }else if(answer.equals("2")){
                getFlights();
            }else if(answer.equals("3")){
                getOnePlane();
            }else if(answer.equals("x")){
                break;
            }else{
                System.out.println("Unknown command");
            }
            System.out.println("");
        }
    }
    
    public void start(){
        workerUI();
        userUI();
    }
    
}
