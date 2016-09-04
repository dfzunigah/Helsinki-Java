import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases= new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(purchases.containsKey(product)){
            purchases.get(product).increaseAmount();
        }else{
            purchases.put(product, new Purchase(product,1,price));
        }
 
    }
    
    public int price(){
        int total=0;
        for(Purchase one : purchases.values()){
            total+=one.price();
        }
        return total;
    }
    
    public void print(){
        for(Purchase one : purchases.values()){
            System.out.println(one);
        }
    }
    
}
