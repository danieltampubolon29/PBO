package TugasPraktikum2;

public class Sub {
    public static int[][] sub(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] sub = new int[row][column];

        // Mengecek apakah ukuran kedua matriks sama
        if (row != second.length || column != second[0].length) {
            throw new IllegalArgumentException("Ukuran kedua matriks harus sama");
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                sub[r][c] = first[r][c] - second[r][c];
            }
        }

        System.out.println("\nSum of Matrices : ");
        Print2dArray.print2dArray(sub);

        return sub;
    }
}