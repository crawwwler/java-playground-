
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics xAll = new Statistics();
        Statistics xEvens = new Statistics();
        Statistics xOdds = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                xEvens.addNumber(number);
            }
            if (number % 2 != 0) {
                xOdds.addNumber(number);
            }

            xAll.addNumber(number);
        }

        System.out.println("Sum: " + xAll.sum());
        System.out.println("Sum of even numbers: " + xEvens.sum());
        System.out.println("Sum of odd numbers: " + xOdds.sum());
    }
}
