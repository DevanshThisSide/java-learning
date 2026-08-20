package JL07_oops;

import java.util.Scanner;

class Cone {
    double radius;
    double height;

    public void setRadius(double radiusInput) {
        radius = radiusInput;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double heightInput) {
        height = heightInput;
    }

    public double getHeight() {
        return height;
    }

    public double calculateSlantHeight() {
        return Math.sqrt((radius * radius) + (height * height));
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public double calculateCurvedSurfaceArea() {
        return Math.PI * radius * calculateSlantHeight();
    }

    public double calculateTotalSurfaceArea() {
        return Math.PI * radius * (calculateSlantHeight() + radius);
    }
// Inside a class, instance methods and instance variables can directly access other instance methods
// and instance variables of the same object. No separate object creation is needed.
}

public class OperationsOnConeExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cone : ");
        double radiusInput = sc.nextDouble();
        System.out.print("Enter height of Cone : ");
        double heightInput = sc.nextDouble();
        Cone cone = new Cone();
        cone.setRadius(radiusInput);
        cone.setHeight(heightInput);
        System.out.println("------ Cone Details ------");
        System.out.printf("Radius              : %.2f%n", cone.getRadius());
        System.out.printf("Height              : %.2f%n", cone.getHeight());
        System.out.printf("Slant Height        : %.2f%n", cone.calculateSlantHeight());
        System.out.printf("Volume              : %.2f%n", cone.calculateVolume());
        System.out.printf("Curved Surface Area : %.2f%n", cone.calculateCurvedSurfaceArea());
        System.out.printf("Total Surface Area  : %.2f", cone.calculateTotalSurfaceArea());
        sc.close();
    }
}