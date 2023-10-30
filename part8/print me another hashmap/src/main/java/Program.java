
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book x : hashmap.values()) {
            System.out.println(x);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String word) {
        String partOf = word;
        partOf = partOf.toLowerCase();
        partOf = partOf.trim();

        for (Book x : hashmap.values()) {
            if (x.getName().contains(partOf)) {
                System.out.println(x);
            }
        }
    }
}
