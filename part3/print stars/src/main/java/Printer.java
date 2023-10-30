
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;

        while (index < array.length) {
            int stars = array[index];
            for (int x = 1; x <= stars; x++) {
                System.out.print("*");
            }
            System.out.println("");
            index++;
        }

    }

}
