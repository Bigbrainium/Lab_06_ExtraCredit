import java.util.Scanner;
import java.lang.Math;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int randomNumber = (int)((Math.random() * 10) + 1);
        int userGuess;

        // Making sure userGuess is a valid input
        do {
            if (scan.hasNextDouble()) {
                userGuess = scan.nextInt();
                if (userGuess >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Checks the user's guess
        if (userGuess > randomNumber) {
            System.out.println("Your guess was too high");
            System.out.println("The correct answer was: " + randomNumber);
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low");
            System.out.println("The correct answer was: " + randomNumber);
        } else {
            System.out.println("Right on the money!");
            System.out.println("The correct answer was: " + randomNumber);
        }
    }
}