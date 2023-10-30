
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] array = input.split(" ");
            int index = 0;
            while (index < array.length) {
                if (array[index].contains("av")) {
                    System.out.println(array[index]);
                }
                index++;
            }
        }

    }
}
