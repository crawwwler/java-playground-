
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add") && amount > 0) {
                first.add(amount);
            }

            if (input.equals("move") && amount > 0) {
                if (first.contains() == 0) {
                    continue;
                } else if (first.contains() - amount < 0) {
                    int x = first.contains();
                    first.remove(x);
                    second.add(x);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

            if (input.equals("remove") && amount > 0) {
                second.remove(amount);
            }

            System.out.println("");
        }
    }

}
