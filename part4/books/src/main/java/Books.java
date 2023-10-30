
public class Books {

    private String name;
    private int pages;
    private int year;

    public Books(String title, int numOfPages, int publishYear) {
        this.name = title;
        this.pages = numOfPages;
        this.year = publishYear;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
