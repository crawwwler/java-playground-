
public class Book {

    private String author;
    private String title;
    private int pageCount;

    public Book(String a, String t, int pc) {
        this.author = a;
        this.title = t;
        this.pageCount = pc;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
