package codSoft;

import java.util.Random;
import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int round = 1;
        final int maxAttempt = 4;

        while (true) {
            int randomNum = random.nextInt(100) + 1;
            int attempt = 1;

            while (attempt < maxAttempt) {
                System.out.println("Round " + round + ": Guess the number between 1 and 100");
                System.out.print("Attempt " + attempt + ": Enter your Guess: ");
                int userMove = s.nextInt();
                attempt++;

                if (userMove < 1 || userMove > 100) {
                    System.out.println("Invalid number, please enter a number between 1 and 100.");
                    continue;
                }

                int diff = userMove - randomNum;
                int finalDiff = Math.abs(diff);

                if (userMove > randomNum && finalDiff < 10) {
                    System.out.println(" Your Number Little Higher. Try Again!");
                } else if (userMove > randomNum && finalDiff > 10) {
                    System.out.println(" Your Number Much Higher. Try Again!");
                } else if (userMove < randomNum && finalDiff < 10) {
                    System.out.println(" Your Number Little Lower. Try Again!");
                } else if (userMove < randomNum && finalDiff > 10) {
                    System.out.println(" Your Number Much Lower. Try Again!");
                } else {
                    System.out.println("Congrats! You guessed the correct number.");
                    totalScore += (10 - attempt + 1);
                    break;
                }
            }

            if (attempt == maxAttempt) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNum + ".");
            }

            String op;
            while (true) {
                System.out.print("Do you want to play another round? (yes/no): ");
                op = s.next();
                if (op.equalsIgnoreCase("yes") || op.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

            if (op.equalsIgnoreCase("no")) {
                break;
            }

            round++;
        }

        System.out.println("Game over! Your total score is: " + totalScore);
        s.close();
    }
}
