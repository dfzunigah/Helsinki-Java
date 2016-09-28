package dxn;

public class Card {
    private int value;
    private Suit suit;
    
    public Card(int value,Suit suit){
        this.value=value;
        this.suit=suit;
    }
    
    public String toString(){
        return suit + " " + value; 
    }
    
}
