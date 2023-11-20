import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        int secretNumber = generateRandomNumber(1, 100);
        int maxAttempts = 10;
        boolean hasGuessedCorrectly = false;

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");

            int userGuess = getUserInput(scanner);

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static int getUserInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
