package TugasPraktikum3;

public class Result {
    int[] result (int[] arr){
        int l = arr.length;
        System.out.print("Angka genap : ");
        for(int i = 0; i < l; i++){
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\nAngka ganjil : ");
        for(int j = 0; j < l; j++){
            if (arr[j] % 2 == 1) {
                System.out.print(arr[j] + " ");
            }
        }
        return arr;
    }
}
