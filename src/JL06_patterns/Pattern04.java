package JL06_patterns;

import java.util.Scanner;

//                    *
//                  * *
//                * * *
//              * * * *
//            * * * * *
public class Pattern04 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
