package JL07_oops;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double percentage;

    public void setRollNo(int roNo) {
        rollNo = roNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setPercentage(double per) {
        percentage = per;
    }

    public double getPercentage() {
        return percentage;
    }
}

public class OopsBasicsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student dev = new Student();
        System.out.print("Enter the Roll No : ");
        int rollNo = sc.nextInt();
        dev.setRollNo(rollNo);

        sc.nextLine(); // Consume the Leftover Enter
/*      nextInt() reads only the integer.
        It doesn't consume the Enter key (\n).
        So when nextLine() executes, it immediately reads that leftover Enter and returns an empty string.*/

        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        dev.setName(name);
        System.out.print("Enter the Percentage : ");
        double percentage = sc.nextDouble();
        dev.setPercentage(percentage);
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No    : " + dev.getRollNo());
        System.out.println("Name       : " + dev.getName());
        System.out.printf("Percentage : %.2f", dev.getPercentage());
        sc.close();
    }
}
// Procedural Programming:
//        - Focuses mainly on functions/procedures.
//        - Data and functions are generally separate.
//        - Follows a more function-oriented approach.
//        - Less emphasis on data hiding and security.
//        - Suitable for smaller and simpler programs.
// Object-Oriented Programming (OOP):
//        - Focuses on objects and classes.
//        - Combines data and methods together.
//        - Supports encapsulation, inheritance and polymorphism.
//        - Provides better data hiding and code organization.
//        - Suitable for large and complex applications.