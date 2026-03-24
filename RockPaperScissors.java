import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== ROCK PAPER SCISSORS GAME ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computerChoice = rand.nextInt(3);

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Game Logic
            if (userChoice - 1 == computerChoice) {
                System.out.println("It's a DRAW!");
            } else if ((userChoice == 1 && computerChoice == 2) ||
                       (userChoice == 2 && computerChoice == 0) ||
                       (userChoice == 3 && computerChoice == 1)) {
                System.out.println("Computer WINS!");
            } else {
                System.out.println("You WIN!");
            }
        }

        sc.close();
    }
}