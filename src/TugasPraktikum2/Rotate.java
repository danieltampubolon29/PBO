package TugasPraktikum2;

public class Rotate {
    public static int[][] rotate(int[][] data) {
        int row = data[0].length;
        int column = data.length;
        int[][] normal = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                normal[r][c] = data[c][r];
            }
        }
        return normal;
    }
}