package JL04_arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {23, 8, 91, 45, 17, 62, 39, 10, 55};
        int evenCount = 0;
        int oddCount = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.print("Even Numbers in Array : " + evenCount);
        System.out.print("\nOdd Numbers in Array : " + oddCount);
    }
}
