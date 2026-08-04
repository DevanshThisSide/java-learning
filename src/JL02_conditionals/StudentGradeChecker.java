package JL02_conditionals;

import java.util.Scanner;
//        |    Marks | Grade |
//        | -------: | :---- |
//        |   90–100 | A+    |
//        |    80–89 | A     |
//        |    70–79 | B     |
//        |    60–69 | C     |
//        |    50–59 | D     |
//        | Below 50 | F     |

public class StudentGradeChecker {
    public static void main(String[] args) {
        System.out.print("Enter the marks (0 - 100) : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = "PASS";
        if (marks < 0 || marks > 100) {
            System.out.print("Enter valid markes.");
            sc.close();
            return;
        }
        if (marks < 33) {
            result = "FAIL";
        }
        System.out.println("Result : " + result);
        if (marks < 50) {
            System.out.print("Grade : F");
        } else if (marks <= 59) {
            System.out.print("Grade : D");
        } else if (marks <= 69) {
            System.out.print("Grade : C");
        } else if (marks <= 79) {
            System.out.print("Grade : B");
        } else if (marks <= 89) {
            System.out.print("Grade : A");
        } else {
            System.out.print("Grade : A+");
        }
        sc.close();
    }
}
