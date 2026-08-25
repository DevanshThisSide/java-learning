package JL07_oops;

import java.util.Random;
import java.util.Scanner;

// Guess The Number Game
class GuessTheNumber {

    private int secretNumber;
    private int attempts;
    private int maximumAttempts;

    public GuessTheNumber() {
        Random random = new Random();
        this.secretNumber = random.nextInt(1, 101); // 1 to 100
        this.attempts = 0;
        this.maximumAttempts = 10;
    }

    public void printInstructions() {
        System.out.println("=====-|-===== Guess The Number Game =====-|-=====");
        System.out.println("Computer have chosen a number from 1 to 100.");
        System.out.print("You have " + maximumAttempts + " attempts.\n");
    }

    public boolean checkGuess(int userGuess) {

        attempts++;

        if (userGuess == secretNumber) {
            System.out.println("Correct Guess!");
            return true;
        }

        if (userGuess < secretNumber) {
            System.out.println("GO High!");
        } else {
            System.out.println("Go Low!");
        }

        return false;
    }

    public boolean attemptsOver() {
        return attempts >= maximumAttempts;
    }

    public int getAttempts() {
        return attempts;
    }

    public void printWinMessage() {
        System.out.println("-------------------------\nCongratulations!");
        System.out.print("You guessed the number in " + attempts + " attempts.");
    }

    public void printLoseMessage() {
        System.out.println("-------------------------\nGame Over!");
        System.out.print("The correct number was: " + secretNumber);
    }
}

public class GuessTheNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GuessTheNumber game = new GuessTheNumber();

        game.printInstructions();

        while (true) {

            System.out.println("-------------------------");
            System.out.println("Attempt : " + (game.getAttempts() + 1));
            System.out.print("Enter your guess: ");

            int guess = sc.nextInt();

            if (game.checkGuess(guess)) {
                game.printWinMessage();
                break;
            }

            if (game.attemptsOver()) {
                game.printLoseMessage();
                break;
            }
        }

        sc.close();
    }
}