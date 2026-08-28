package JL06_patterns;

import java.util.Scanner;

//              1
//             123
//            12345
//           1234567
//          123456789
public class Pattern11 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        for (int i = 0; i < n; i++) {
            for (int spc = i; spc < n; spc++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}