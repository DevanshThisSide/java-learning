package JL04_arrays;

public class IsArraySorted {
    public static void main(String[] args) {
//        int[] arr = {23, 8, 91, 45, 17, 62, 39, 10, 55};
        int[] arr = {8, 17, 39, 55, 99, 121};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.print("Array is Not Sorted.");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Array is Sorted.");
        }
    }
}
