import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        if(card1.getSuit()==card2.getSuit()){
            return card1.compareTo(card2);
        }
        return card1.getSuit()-card2.getSuit();
    }
}