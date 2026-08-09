package JL06_patterns;

import java.util.Scanner;

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
public class Pattern05 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }

            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}