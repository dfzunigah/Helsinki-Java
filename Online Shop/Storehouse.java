import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(prices.get(product)==null){
            return -99;
        }
        return prices.get(product);
    }
    
    public int stock(String product){
        if(stocks.get(product)==null){
            return 0;
        }
        return stocks.get(product);
    }
    
    public boolean take(String product){
        if(stocks.get(product) == null){
            return false;
        }
        if(stocks.get(product)>=1){
            int stock=stocks.get(product)-1;
            stocks.replace(product, stocks.get(product), stock);
            return true;
        }else{
           return false;            
        }
    }
    
    public Set<String> products(){
        return prices.keySet();
    }
}
