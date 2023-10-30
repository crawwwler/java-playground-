
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(11);
        list.add(-4);

        System.out.println(sum(list));

    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int x : numbers) {
            sum = sum + x;
        }
        return sum;
    }
}
