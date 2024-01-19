package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GCD {
    public static boolean round() {
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.print("Question: ");
        int a = (int) (Math.random() * 49 + 1);
        int b = (int) (Math.random() * 49 + 1);
        System.out.println(a + " " + b);
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == gsd(a, b)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + gsd(a, b) + "'.");
        System.out.println("Let's try again, " + Cli.playerName + "!");
        return false;
    }

    private static int gsd(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if ((a % i == 0) & (b % i == 0)) {
                return i;
            }
        }
        return 1;
    }

}
