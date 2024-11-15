import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do 
        {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and 100. Try to guess it!");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts--;

                if (userGuess == randomNumber) 
                {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } 
                else if (userGuess > randomNumber) 
                {
                    System.out.println("Too high! Try again.");
                } 
                else 
                {
                    System.out.println("Too low! Try again.");
                }

                if (attempts > 0) 
                {
                    System.out.println("You have " + attempts + " attempts left.");
                } 
                else 
                {
                    System.out.println("Sorry, you've used all attempts. The correct number was: " + randomNumber);
                }
            }

            if (guessedCorrectly) 
            {
                System.out.println("You've won this round!");
            }

            System.out.print("Would you like to play another round? (yes/no): ");
            playAgain = input.next();
        } 
        while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game over! Your final score: " + score);
        System.out.println("Thank you for playing!");
        input.close();
    }
}