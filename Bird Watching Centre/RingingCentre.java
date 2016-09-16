import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    private HashMap<Bird,List<String>> birds;
    
    public RingingCentre(){
        this.birds = new HashMap<Bird,List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(birds.containsKey(bird)){
            this.birds.get(bird).add(place);
        }else{
            this.birds.put(bird, new ArrayList<String>());
            this.birds.get(bird).add(place);
        }
        
    }
    
    public void observations(Bird bird){
        if(this.birds.containsKey(bird)){
            System.out.println(bird.getLatinName() + " (" + bird.getRingingYear() + ") observations: " + this.birds.get(bird).size());
            for(String place : this.birds.get(bird)){
                System.out.println(place);
            }
        }else{
            this.birds.put(bird, new ArrayList<String>());
            observations(bird);
        }
    }
}
