public class Calculator {
    private Reader reader;
    private int amount;
    
    public Calculator(){
        reader = new Reader();
    }
    
    public void start(){
        while(true){
            System.out.print("command: ");
            String command=reader.readString();
            if(command.equals("end")){
                break;
            }
            
            if (command.equals("sum")){
                sum();
            } else if (command.equals("difference")){
                difference();
            } else if (command.equals("product")){
                product();
            }
        }
        
        statistics();
    }
    
    private void sum(){
        System.out.println("value 1: ");
        int value1 = reader.readInteger();
        System.out.println("value 2: ");
        int value2 = reader.readInteger();
        System.out.println("sum of the values " + (value1+value2));
        this.amount++;
    }
    
    private void difference(){
        System.out.println("value 1: ");
        int value1 = reader.readInteger();
        System.out.println("value 2: ");
        int value2 = reader.readInteger();
        System.out.println("difference of the values " + (value1-value2));
        this.amount++;
    }
    
    private void product(){
        System.out.println("value 1: ");
        int value1 = reader.readInteger();
        System.out.println("value 2: ");
        int value2 = reader.readInteger();
        System.out.println("product of the values " + (value1*value2));
        this.amount++;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.amount);
    }
}
