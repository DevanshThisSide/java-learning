package JL04_arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] marks; // Declaration
        marks = new int[3]; // Memory Allocation
        marks[0] = 88; // Initialize
        marks[1] = 69;
        marks[2] = 91;
        String[] names = new String[7]; // Declaration + Memory Allocation
        float[] roll_no = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f}; // Declaration + Initialize

        // Accessing the array elements
        System.out.println(roll_no[4]);

        // Length of the array
        System.out.print(roll_no.length);
    }
}
