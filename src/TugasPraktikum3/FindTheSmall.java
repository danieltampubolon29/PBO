package TugasPraktikum3;

public class FindTheSmall {
    int[] findsmall(int[] arr){

        // Initialize maximum element
        int min = arr[0];

        // Traverse array elements from second and
        // compare every element with current min
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return new int[]{min};
    }
}
