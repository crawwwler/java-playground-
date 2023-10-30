
public class Cube {

    private int edgeLength;

    public Cube(int el) {
        this.edgeLength = el;
    }

    public int volume() {
        return (int) Math.pow(edgeLength, 3);
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }

}
