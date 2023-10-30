
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int check = 0;
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {

                String names = reader.nextLine();

                if (names.equals(searchedFor)) {
                    check = 10;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (check == 10) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

        if (!(file.equals("names.txt") || file.equals("other-names.txt"))) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }

    }
}
