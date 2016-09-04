import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card card : cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int compareTo(Hand hand){
        int valuesA=0;
        int valuesB=0;
        for(Card card : cards){
            valuesA+=card.getValue();
        }
        for(Card card : hand.cards){
            valuesB+=card.getValue();
        }
        if(valuesA==valuesB){
            return 0;
        }else if(valuesA>valuesB){
            return 1;
        }else{
            return -1;
        }
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue() );
    }
}
