package JL04_arrays;

public class ArrayTraversal {
    public static void main(String[] args) {

        int[] marks = {91, 89, 78, 95, 62, 83, 76};

        // Using for loop
        System.out.println("Using For Loop :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // In Reverse Order
        System.out.println("\nReverse Order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Using for-each loop (Enhanced for loop)
        System.out.println("\nUsing Enhanced For Loop:");
        for (int elem : marks) {
            System.out.println(elem);
        }
    }
}