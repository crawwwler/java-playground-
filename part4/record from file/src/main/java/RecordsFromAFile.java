
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File name: ");
        String fileName = scanner.nextLine();
        try ( Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String content = reader.nextLine();

                String[] array = content.split(",");
                String names = array[0];
                int ages = Integer.valueOf(array[1]);

                if (ages == 1) {
                    System.out.println(names + ", age:" + ages + " year");
                } else {
                    System.out.println(names + ", age:" + ages + " years");
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
