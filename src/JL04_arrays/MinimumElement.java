package JL04_arrays;

public class MinimumElement {
    public static void main(String[] args) {

        int[] arr = {23, 8, 91, 45, 17, 62, 39, 10, 55};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Minimum Element in The Array is : %d", min);
    }
}
