
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int data = Integer.valueOf(scanner.nextLine());

            if (data == -1) {
                break;
            }

            list.add(data);
        }

        int sum = 0;
        for (Integer x : list) {
            sum = sum + x;

        }
        double avg = (double) sum / list.size();
        System.out.println("Average: " + avg);
    }
}
