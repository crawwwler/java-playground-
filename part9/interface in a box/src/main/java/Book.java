
public class Book implements Packable {

    private String author;
    private String title;
    private double weight;

    public Book(String author, String name, double w) {
        this.author = author;
        this.title = name;
        this.weight = w;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.title;
    }

}
