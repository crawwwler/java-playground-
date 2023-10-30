
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        if (size % 2 == 0) {

        }
        int number = 1;
        int row = 0;
        int column = size / 2;

        while (number <= size * size) {
            square.placeValue(column, row, number);
            number++;
            int xrow = row;
            int xcolumn = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = square.getHeight() - 1;
            }
            if (column == square.getWidth()) {
                column = 0;
            }
            if (square.readValue(column, row) != 0) {
                row = xrow + 1;
                column = xcolumn;
            }

        }
        return square;
    }

}
