package TugasPraktikum3;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        PrintArray pa = new PrintArray();
        InsertionSort is = new InsertionSort();
        FindTheLargest fl = new FindTheLargest();
        FindTheSmall fs = new FindTheSmall();
        Result r = new Result();
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("Given array : ");
        pa.PrintArray(arr);

        // find the largest number in array
        System.out.print("The Largest Number in array : ");
        pa.PrintArray(fl.findlargest(arr));

        // Find the minimum number and compare with key if the minimum number is greater
        // than key, it will be moving a head
        System.out.print("Insertion Sorted array : ");
        pa.PrintArray(is.insort(arr));

        // Find the minimum number and swap to first
        System.out.print("Selection Sorted array : ");
        pa.PrintArray(ob.selsort(arr));

        System.out.print("The Smallest Number in array : ");
        pa.PrintArray(fs.findsmall(arr));

        r.result(arr);
        sc.close();
    }
}
