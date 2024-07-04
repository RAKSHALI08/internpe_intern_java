import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object for input and Random object for generating computer's choice
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize variables
        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        // Game loop
        while (playAgain) {
            // Get user's choice
            System.out.println("Enter your choice (rock, paper, scissors). To quit the game, type 'quit':");
            String userChoice = scanner.nextLine().toLowerCase();

            // Check if the user wants to quit the game
            if (userChoice.equals("quit")) {
                playAgain = false;
                System.out.println("Thank you for playing!");
                break;
            }

            // Validate user's choice
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate computer's choice
            String computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the result
            String result;
            if (userChoice.equals(computerChoice)) {
                result = "It's a tie!";
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                result = "You win!";
            } else {
                result = "You lose!";
            }

            // Display the result
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }
}