
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(18);
        list.add(23);
        list.add(26);
        list.add(30);

        printNumbersInRange(list, 9, 25);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The number in the range [" + lowerLimit + ", " + upperLimit + "]");
        for (int x : numbers) {
            if (lowerLimit < x && x < upperLimit) {
                System.out.println(x);
            }
        }
    }
}
