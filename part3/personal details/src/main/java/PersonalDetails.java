
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int length = 0;
        int count = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] array = input.split(",");
            int birthYear = Integer.valueOf(array[1]);
            sum = sum + birthYear;

            if (array[0].length() > length) {
                name = array[0];
                length = array[0].length();
            }

            count++;
        }

        System.out.println("Longest name:" + name);
        System.out.println("Average of the birth years: " + (double) sum / count);

    }
}
