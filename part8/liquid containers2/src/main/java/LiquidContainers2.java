
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

            String[] spliter = input.split(" ");
            String cmd = spliter[0];
            int amount = Integer.valueOf(spliter[1]);

            if (cmd.equals("add")) {
                first.add(amount);
            }

            if (cmd.equals("move")) {

                if (first.contains() >= amount) {
                    first.remove(amount);
                    second.add(amount);
                } else {
                    second.add(first.contains());
                    first.remove(amount);
                }
            }

            if (cmd.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
