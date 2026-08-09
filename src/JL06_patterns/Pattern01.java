package JL06_patterns;

import java.util.Scanner;

//        *
//        **
//        ***
//        ****
//        *****

public class Pattern01 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
//        String str= "*";
//        for (int i=1;i<=n;i++){
//            System.out.println(str.repeat(i));
//     }
        for (int i = 0; i < n; i++) {
            for (int j= 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
