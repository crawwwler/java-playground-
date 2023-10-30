
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        String s = "";
        for (int row = 0; row < array.length; row++) {
            if (row > 0) {
                s = s + "\n";
            }
            for (int column = 0; column < array[row].length; column++) {
                int x = array[row][column];
                s = s + x + "";
            }
        }
        return s;
    }
}
