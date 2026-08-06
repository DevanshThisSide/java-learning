package JL05_methods;

import java.util.Scanner;

public class MethodOverloading {
    static int areaCalculator(int side) { // Square
        return side * side;
    }

    static int areaCalculator(int length, int breadth) { // Rectangle
        return length * breadth;
    } // Rectangle

    static double areaCalculator(double radius) { // Circle
        return Math.PI * radius * radius;
    } // Circle

    static double areaCalculator(double base, double height) { // Triangle
        return 0.5 * base * height;
    } // Triangle

    static void salaryCalculator(int basic) {
        System.out.print("Net Salary ₹: " + basic);
    } // Basic

    static void salaryCalculator(int basic, int bonus) {
        System.out.print("Net Salary : ₹" + (basic + bonus));
    } // Basic + Bonus

    static void salaryCalculator(int basic, int bonus, int deduction) { // Basic + Bonus - Deduction and Basic - Deduction
        System.out.print("Net Salary : ₹" + (basic + bonus - deduction));
    }

    public static void main(String[] args) {
        System.out.print("Choose : 1 for Area Calculator" +
                "\nChoose : 2 for Salary Calculator\nEnter Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.print("Choose : 1 for Square" +
                    "\nChoose : 2 for Rectangle" +
                    "\nChoose : 3 for Circle" +
                    "\nChoose : 4 for Triangle\nEnter Choice : ");
            int choice2 = sc.nextInt();
            if (choice2 == 1) {
                System.out.print("Enter the Side of Square : ");
                int a = sc.nextInt();
                System.out.print("Area of Square is : " + areaCalculator(a));
            } else if (choice2 == 2) {
                System.out.print("Enter the Length of Rectangle : ");
                int l = sc.nextInt();
                System.out.print("Enter the Breadth of Rectangle : ");
                int br = sc.nextInt();
                System.out.print("Area of Rectangle is : " + areaCalculator(l, br));
            } else if (choice2 == 3) {
                System.out.print("Enter the Radius of Circle : ");
                double radi = sc.nextDouble();
                System.out.printf("Area of Circle is : %.2f", areaCalculator(radi));
            } else if (choice2 == 4) {
                System.out.print("Enter the Base of Triangle : ");
                double b = sc.nextDouble();
                System.out.print("Enter the Height of Triangle : ");
                double h = sc.nextDouble();
                System.out.printf("Area of Triangle is : %.2f", areaCalculator(b, h));
            } else {
                System.out.print("Invalid Choice.");
            }
        } else if (choice1 == 2) {
            System.out.print("Enter Your Basic Salary : ");
            int basicSalary = sc.nextInt();
            if (basicSalary < 0) {
                System.out.print("Basic Salary Can't be Negative.");
            } else {
                int bonus = 0;
                int deduction = 0;
                System.out.print("Do You got any Bonus (y/yes or n/no) : ");
                String choice3 = sc.next();
                if (choice3.equalsIgnoreCase("yes") || choice3.equalsIgnoreCase("y")) {
                    System.out.print("Enter Bonus Amount : ");
                    bonus = sc.nextInt();
                } else if (choice3.equalsIgnoreCase("no") || choice3.equalsIgnoreCase("n")) {
                    System.out.print("No Bonus Added.\n");
                } else {
                    System.out.print("Invalid Choice.\n");
                }
                System.out.print("Do You got any Deduction (y/yes or n/no) : ");
                String choice4 = sc.next();
                if (choice4.equalsIgnoreCase("yes") || choice4.equalsIgnoreCase("y")) {
                    System.out.print("Enter Deduction Amount : ");
                    deduction = sc.nextInt();
                } else if (choice4.equalsIgnoreCase("no") || choice4.equalsIgnoreCase("n")) {
                    System.out.print("No Deduction Done.\n");
                } else {
                    System.out.print("Invalid Choice.\n");
                }
                if (bonus == 0) {
                    if (deduction == 0)
                        salaryCalculator(basicSalary);
                    else
                        salaryCalculator(basicSalary, 0, deduction);
                } else {
                    if (deduction == 0)
                        salaryCalculator(basicSalary, bonus);
                    else
                        salaryCalculator(basicSalary, bonus, deduction);
                }
            }
        }
        sc.close();
    }
}