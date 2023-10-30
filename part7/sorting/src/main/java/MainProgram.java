
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] some = {-1, 3, 1, 2};

        System.out.println(MainProgram.indexOfSmallestFrom(some, 1));

    }

    public static int smallest(int[] array) {
        int helper = array[0];
        for (int index = 0; index < array.length; index++) {
            if (helper >= array[index]) {
                helper = array[index];
            }
        }
        return helper;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {

                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int helper = array[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (helper > array[i]) {
                helper = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }

    }
}
