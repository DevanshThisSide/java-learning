package JL04_arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {23, 8, 91, 45, 17, 62, 39, 10, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Maximum Element in The Array is : %d", max);
    }
}
