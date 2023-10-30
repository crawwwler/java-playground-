
public class Book {
    
    private String name;
    private int publicationYear;
    
    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        
        if (!(x instanceof Book)) {
            return false;
        }
        
        Book xx = (Book) x;
        
        if (this.name.equals(xx.name)
                && this.publicationYear == xx.publicationYear) {
            return true;
        } else {
            return false;
        }
    }
    
}
