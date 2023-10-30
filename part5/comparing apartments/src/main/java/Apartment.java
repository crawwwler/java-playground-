
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment x) {
        if (this.squares > x.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment x) {
        int home = this.squares * this.princePerSquare;
        int compare = x.squares * x.princePerSquare;

        return Math.abs(home - compare);
    }

    public boolean moreExpensiveThan(Apartment x) {

        int home = this.squares * this.princePerSquare;
        int compare = x.squares * x.princePerSquare;

        if (home > compare) {
            return true;
        }
        return false;
    }

}
