
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public int getSumOfHand() {
        int sum = 0;
        for (Card c : this.cards) {
            sum = sum + c.getValue();
        }
        return sum;
    }
    
    public void print() {
        Iterator<Card> ite = this.cards.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
    
    @Override
    public int compareTo(Hand hand) {
        if (this.getSumOfHand() == hand.getSumOfHand()) {
            return 0;
        } else if (this.getSumOfHand() < hand.getSumOfHand()) {
            return -1;
        } else {
            return 1;
        }
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards);
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
