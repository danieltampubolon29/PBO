package TugasPraktikum2;

public class Transpose {
    public static int[][] transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;
        int[][] transposed = new int[column][row];

        System.out.println("Elements of transpose Matrix T are : ");
        for (int c = 0; c < column; c++) {
            for (int r = 0; r < row; r++) {
                transposed[c][r] = data[r][c];
                System.out.print(transposed[c][r] + "\t");
            }
            System.out.println();
        }
        return transposed;
    }
}
