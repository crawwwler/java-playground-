
import java.util.*;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String book = scanner.nextLine();

            if (book.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            Book x = new Book(book, age);
            books.add(x);
        }
        long numberOfBooks = books.stream().count();

        if (numberOfBooks == 1) {
            System.out.println(numberOfBooks + " book in total.");
        } else {
            System.out.println(numberOfBooks + " books in total.");
        }

        Comparator<Book> compar = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(books, compar);

        books.stream().forEach(b -> System.out.println(b));
    }

}
