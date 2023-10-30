
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCont = 0;
        int secondCont = 0;
        int maxAmount = 100;

        while (true) {

            System.out.println("First: " + firstCont + "/" + maxAmount);
            System.out.println("Second: " + secondCont + "/" + maxAmount);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] array = input.split(" ");
            String function = array[0];
            int amount = Integer.valueOf(array[1]);

            if (function.equals("add")) {
                if (firstCont + amount > 100) {
                    firstCont = 100;
                } else if (amount < 0) {
                    continue;
                } else {
                    firstCont += amount;
                }
            }

            if (function.equals("move")) {
                if (amount < 0 || firstCont == 0) {
                    continue;
                } else if (firstCont - amount <= 0 && secondCont + amount <= 100) {
                    secondCont += firstCont;
                    firstCont = 0;
                } else if (firstCont - amount <= 0 && secondCont + amount > 100) {
                    secondCont = 100;
                    firstCont = 0;
                } else if (secondCont + amount > 100) {
                    firstCont -= amount;
                    secondCont = 100;
                } else {
                    firstCont -= amount;
                    secondCont += amount;
                }
            }

            if (function.equals("remove")) {
                if (secondCont - amount < 0) {
                    secondCont = 0;
                } else {
                    secondCont -= amount;
                }
            }
        }
    }

}
