package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class MagicCalc {
    public static boolean round() {
        System.out.println("What is the result of the expression?");
        System.out.print("Question: ");
        int maxA = 20;
        int maxB = 10;
        int mathOp = 3;
        int a = Math.toIntExact(Math.round(Math.random() * maxA));
        int b = Math.toIntExact(Math.round(Math.random() * maxB));
        int c = 0;
        double floor = Math.floor(Math.random() * mathOp);
        if (floor == 0) {
            System.out.println(a + " + " + b);
            c = a + b;
        } else if (floor == 1) {
            System.out.println(a + " - " + b);
            c = a - b;
        } else if (floor == 2) {
            System.out.println(a + " * " + b);
            c = a * b;
        }
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (answer.equals(String.valueOf(c))) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + c + "'.");
        System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
        return false;
    }
}
