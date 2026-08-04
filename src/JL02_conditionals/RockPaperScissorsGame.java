package JL02_conditionals;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("===== WELCOME TO THE RockPaperScissors GAME =====");
        System.out.print("Enter Your Choice ((R/r for Rock) / (P/p for Paper) / (S/s for Scissors) ) : ");
        String Ch = sc.next().toUpperCase();
        int computer = random.nextInt(3);
        // Assuming 0 as R , 1 as P and 2 as S
        if (Ch.equals("R") && computer == 0) {
            System.out.print("Its a TIE. Computer Chooses Rock.");
        } else if (Ch.equals("P") && computer == 1) {
            System.out.print("Its a TIE. Computer Chooses Paper.");
        } else if (Ch.equals("S") && computer == 2) {
            System.out.print("Its a TIE. Computer Chooses Scissors.");
        } else if (Ch.equals("R") && computer == 1) {
            System.out.print("Computer Win! , Computer Chooses Paper.");
        } else if (Ch.equals("R") && computer == 2) {
            System.out.print("User Win! , Computer Chooses Scissors.");
        } else if (Ch.equals("P") && computer == 0) {
            System.out.print("User Win! , Computer Chooses Rock.");
        } else if (Ch.equals("P") && computer == 2) {
            System.out.print("Computer Win! , Computer Chooses Scissors.");
        } else if (Ch.equals("S") && computer == 0) {
            System.out.print("Computer Win! , Computer Chooses Rock.");
        } else if (Ch.equals("S") && computer == 1) {
            System.out.print("User Win! , Computer Chooses Paper.");
        }else{
            System.out.print("Enter a Valid Choice.");
        }
        System.out.print("\n===== THANK YOU FOR PLAYING THE GAME =====");

        sc.close();
    }
}
