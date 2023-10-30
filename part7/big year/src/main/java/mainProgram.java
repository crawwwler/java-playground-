
import java.util.*;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Birds> list = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String cmd = scan.nextLine();

            if (cmd.equals("Quit")) {
                break;
            }

            if (cmd.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                Birds bird = new Birds(name, latinName);
                if (list.contains(bird)) {
                    continue;
                }
                list.add(bird);
            }

            if (cmd.equals("Observation")) {
                System.out.println("Bird?");
                String observ = scan.nextLine();
                int help = 0;
                for (Birds x : list) {
                    if (x.getName().equals(observ)) {
                        x.addObservation();
                        help++;
                    }
                }
                if (help == 0) {
                    System.out.println("Not a bird!");
                }
            }

            if (cmd.equals("All")) {
                for (Birds x : list) {
                    System.out.println(x);
                }
            }

            if (cmd.equals("One")) {
                System.out.println("Bird?");
                String boo = scan.nextLine();
                int help = 0;
                for (Birds x : list) {
                    if (x.getName().equals(boo)) {
                        System.out.println(x);
                        help++;
                    }
                }
                if (help == 0) {
                    System.out.println("Not a bird!");
                }
            }

        }

    }
}
