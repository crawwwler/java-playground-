
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }

            list.add(number);

        }

        int smallest = list.get(0);
        int i;
        int index = 0;
        for(i = 0; i<list.size(); i++){
            int check = list.get(i);
            if(smallest>check){
                index = i;
                smallest =check;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);

        
    }
}
