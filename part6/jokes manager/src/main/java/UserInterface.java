import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jk;

    public UserInterface(JokeManager jk, Scanner scanner) {
        this.scanner = scanner;
        this.jk = jk;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1- add a joke");
            System.out.println("2- draw a joke");
            System.out.println("3- list jokes");
            System.out.println("X- stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jk.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(jk.drawJoke());
            } else if (command.equals("3")) {
                jk.printJokes();
            }

        }
    }

}
