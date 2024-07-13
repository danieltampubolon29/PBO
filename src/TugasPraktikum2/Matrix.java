package TugasPraktikum2;

import java.util.Scanner;

public class Matrix {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the row in the matrix ");
        int row = sc.nextInt();
        System.out.println("Please enter the column in the matrix ");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter First [%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter Second [%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }

        System.out.println("First Matrix : ");
        Print2dArray.print2dArray(first);

        System.out.println("Second Matrix : ");
        Print2dArray.print2dArray(second);

        System.out.print("Pilih operator [ +, -, *, / ]  : ");
        char operator = sc.next().charAt(0);
        int[][] resultMatrix = null;
        switch (operator) {
            case '+':
                resultMatrix = Sum.sum(first, second);
                break;
            case '-':
                resultMatrix = Sub.sub(first, second);
                break;
            case '*':
                resultMatrix = Mul.mul(first, second);
                break;
            case '/':
                resultMatrix = Dev.dev(first, second);
                if (resultMatrix == null) {
                    System.out.println("Error! Pembagian dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        int[][] transposedMatrix = Transpose.transpose(resultMatrix);
        int[][] normalMatrix = RotateToNormal.rotateToNormal(transposedMatrix);

        System.out.println("Rotated Back to Normal Matrix: ");
        Print2dArray.print2dArray(normalMatrix);
        sc.close();
    }
}