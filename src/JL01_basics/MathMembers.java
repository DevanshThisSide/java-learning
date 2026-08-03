package JL01_basics;

// Math is part of the java.lang package, and java.lang is automatically imported into every Java program.
// No need for import java.lang.Math;
public class MathMembers {
    public static void main(String[] args) {
        System.out.println(Math.PI);            // π (3.141592653589793...)
        System.out.println(Math.E);             // Euler's number (2.71828...)
        System.out.println(Math.sqrt(25));      // 5.0
        System.out.println(Math.pow(2, 3));     // 8.0
        System.out.println(Math.abs(-10));      // 10
        System.out.println(Math.max(10, 20));   // 20
        System.out.println(Math.min(10, 20));   // 10
        System.out.println(Math.random());      // Random number between 0.0 and 1.0
        System.out.println(Math.ceil(4.2));     // 5.0
        System.out.println(Math.floor(4.9));    // 4.0
        System.out.println(Math.round(4.6));    // 5
    }
}