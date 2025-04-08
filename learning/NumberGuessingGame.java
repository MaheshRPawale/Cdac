package learning;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Limit the number of attempts
            int score = 100; // Starting score

            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            System.out.println("You have a maximum of " + maxAttempts + " attempts.");

            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                score -= 10; // Deduct points for each wrong attempt
            }

            if (guessedCorrectly) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                System.out.println("Your score is: " + score);
            } else {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}
