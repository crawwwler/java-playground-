
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Stats> list = new ArrayList<>();

        System.out.println("File:");
        String fileName = scan.nextLine();

        try ( Scanner read = new Scanner(Paths.get(fileName))) {

            while (read.hasNextLine()) {
                String content = read.nextLine();

                String[] array = content.split(",");
                String home = array[0];
                String away = array[1];
                int homeScore = Integer.valueOf(array[2]);
                int awayScore = Integer.valueOf(array[3]);

                list.add(new Stats(home, away, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Team:");
        String team = scan.nextLine();

        int index = 0;
        int games = 0;
        int win = 0;
        while (index < list.size()) {
            if (list.get(index).games(team)) {
                games++;
                if (list.get(index).win(team) > 0) {
                    win++;
                }
            }
            index++;
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (games - win));
    }

}
