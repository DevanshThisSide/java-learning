package JL09_errors_exceptions;

public class ErrorExceptionPractice {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("index : " + i + " - value : " + arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.print("- End of List content. -");
        }
    }
}