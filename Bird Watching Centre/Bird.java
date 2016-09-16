
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    public String getLatinName() {
        return latinName;
    }
 
    public int getRingingYear() {
        return ringingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRingingYear(int ringingYear) {
        this.ringingYear = ringingYear;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Bird bird = (Bird)obj;
        if(this.ringingYear!=bird.ringingYear){
            return false;
        }
        if(!this.getLatinName().equals(bird.latinName)){
            return false;
        }
        return true;
    }
 
    @Override
    public int hashCode() {
        if(this.name==null){
            return 666;
        }
        return this.getRingingYear()+this.latinName.hashCode();
    }

}


