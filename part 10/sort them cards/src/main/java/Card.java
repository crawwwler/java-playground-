
public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return this.suit + " " + this.value;
    }

    public int getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public int compareTo(Card card) {
        if (this.value == card.getValue()) {
            if (this.suit.ordinal() == card.getSuit().ordinal()) {
                return 0;
            } else if (this.suit.ordinal() > card.getSuit().ordinal()) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.value < card.getValue()) {
            return -1;
        } else {
            return 1;
        }
    }
}
