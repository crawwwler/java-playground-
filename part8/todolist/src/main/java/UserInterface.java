
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                list.add(task);
            }

            if (cmd.equals("list")) {
                list.print();
            }

            if (cmd.equals("remove")) {
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                list.remove(num);
            }
        }
    }
}
