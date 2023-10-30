
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String x = scanner.nextLine();

            if (x.equals("end")) {
                break;
            } else {
                int num = Integer.valueOf(x);
                System.out.println(num * num * num);
            }

        }
    }
}
