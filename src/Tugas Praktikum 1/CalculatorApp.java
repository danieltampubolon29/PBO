package TugasPraktikum1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write two number and +, -, * or / sign : ");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;

        try {
            System.out.print("Input Number 1 : ");
            firstNum = scanner.nextDouble();
            System.out.print("Input Operator : ");
            operator = scanner.next().charAt(0);
            System.out.print("Input Number 2 : ");
            secondNum = scanner.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input");
        } finally {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
        }
        Calculation calculation = new Calculation(firstNum, secondNum, operator);
        System.out.println("The Result is  : " + calculation.makeCalculation());
    }

}
