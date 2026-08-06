package JL05_methods;

import java.util.Scanner;

public class PatternUsingRecursion {
    // Recursive implementation of Pattern01 (Ascending Triangle)
    static void pattern01(int n) {
        if (n == 0) {
            return;
        }
        pattern01(n - 1);
        // Recursive call first, so rows are printed while returning.
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Recursive implementation of Pattern02 (Descending Triangle)
    static void pattern02(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern02(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Pattern 01 :");
        pattern01(rows);
        System.out.println("Pattern 02 :");
        pattern02(rows);
        sc.close();
    }
}
