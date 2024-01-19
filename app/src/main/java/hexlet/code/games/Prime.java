package hexlet.code.games;
import hexlet.code.Cli;
import java.util.Scanner;

public class Prime {

    public static boolean round() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.print("Question: ");
        boolean isPrime = true;
        int a = Math.toIntExact(Math.round(Math.random() * 99));
        System.out.println(a);
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime & answer.equalsIgnoreCase("yes")) {
            System.out.println("Correct!");
            return true;
        }
        if (!isPrime & answer.equalsIgnoreCase("no")) {
            System.out.println("Correct!");
            return true;
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        }
        System.out.println("Let's try again, " + Cli.playerName + "!");
        return false;
    }
}
