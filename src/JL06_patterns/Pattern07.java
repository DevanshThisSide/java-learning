package JL06_patterns;

import java.util.Scanner;

//         *********
//          *******
//           *****
//            ***
//             *
public class Pattern07 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 1 - i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}