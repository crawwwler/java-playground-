
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String content = reader.nextLine();

                String[] array = content.split(",");
                String names = array[0];
                int ages = Integer.valueOf(array[1]);
                persons.add(new Person(names, ages));

            }

        } catch (Exception e) {
            System.out.println("");
        }
        return persons;

    }
}
