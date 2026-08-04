package JL02_conditionals;

import java.util.Scanner;

// The Java ternary operator (?:) is a compact, one-line shorthand for traditional if-else statements
//variable = (condition) ? expressionIfTrue : expressionIfFalse;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No : ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        String vote = (age >= 18) ? "Eligible" : "Not Eligible";
        String grade =
                (marks >= 90) ? "A" :
                        (marks >= 75) ? "B" :
                                (marks >= 60) ? "C" :
                                        (marks >= 40) ? "D" : "F";
        System.out.println("-------- RESULT --------");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
        System.out.println("Status : " + result);
        System.out.println("Grade : " + grade);
        System.out.print("Vote Eligibility : " + vote);
    }
}