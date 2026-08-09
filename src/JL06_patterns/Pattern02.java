package JL06_patterns;

import java.util.Scanner;

//        *****
//        ****
//        ***
//        **
//        *

public class Pattern02 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

