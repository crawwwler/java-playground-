
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> publication = new ArrayList<>();

        while (true) {

            System.out.print("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());

            publication.add(new Books(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed?");
        String info = scanner.nextLine();

        for (Books p : publication) {
            if (info.equals("everything")) {
                System.out.println(p);
            }
            if (info.equals("name")) {
                System.out.println(p.getName());
            }
        }
    }
}
