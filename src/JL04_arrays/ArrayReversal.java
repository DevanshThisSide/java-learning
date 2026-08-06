package JL04_arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {23, 8, 91, 45, 17, 62, 39, 10, 55};
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
