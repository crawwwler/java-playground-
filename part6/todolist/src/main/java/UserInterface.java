
import java.util.*;

public class UserInterface {

    private Scanner scanner;
    private TodoList todo;

    public UserInterface(TodoList td, Scanner scanner) {
        this.scanner = scanner;
        this.todo = td;
    }

    public void start() {
        while (true) {

            System.out.println("Command:");
            String box = scanner.nextLine();

            if (box.equals("stop")) {
                break;
            }

            if (box.equals("add")) {
                System.out.println("To add:");
                String add = scanner.nextLine();

                this.todo.add(add);

                continue;
            }

            if (box.equals("list")) {
                this.todo.print();

                continue;
            }

            if (box.equals("remove")) {
                System.out.println("Which one is removed?");
                int toremove = Integer.valueOf(scanner.nextLine());

                this.todo.remove(toremove);

                continue;
            }

        }
    }
}
