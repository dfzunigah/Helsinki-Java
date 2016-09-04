public class Purchase {
    private String product;
    private int amount;
    private int price;
    
    public Purchase(String product, int amount, int unitPrice){
        this.product=product;
        this.amount=amount;
        this.price=unitPrice;
    }
    
    public int price(){
        return this.price*this.amount;
    }
    
    public void increaseAmount(){
        this.amount++;
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
}
