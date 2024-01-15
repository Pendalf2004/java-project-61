package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.*;

public class Even {
    public static boolean evenRound() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.print("Question: ");
        int a = Math.toIntExact(Math.round(Math.random() * 99));
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
        System.out.println("Let's try again, " + Cli.playerName + "!");
        return false;
    }
}
