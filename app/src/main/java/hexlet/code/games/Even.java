package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.Cli;

public class Even {
    public static boolean round() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.print("Question: ");
        int maxNum = 99;
        int a = Math.toIntExact(Math.round(Math.random() * maxNum));
        System.out.println(a);
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes") & (a % 2 == 0)) {
            System.out.println("Correct!");
            return true;
        } else if (answer.equalsIgnoreCase("no") & (a % 2 != 0)) {
            System.out.println("Correct!");
            return true;
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        }
        System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
        return false;
    }
}
