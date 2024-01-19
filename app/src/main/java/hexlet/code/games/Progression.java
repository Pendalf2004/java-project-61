package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Progression {

    public static boolean round() {
        int inc = (int) Math.ceil(Math.random() * 9 + 1);
        int progrLength = (int) Math.ceil(Math.random() * 5 + 5);
        int[] progression = new int[progrLength];
        progression[0] = (int) Math.ceil(Math.random() * 30);
        int absElem = (int) Math.floor(Math.random() * (progrLength - 1));
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        if (absElem > 0) {
            System.out.print(progression[0]);
        } else {
            System.out.print("..");
        }
        for (int i = 1; i < progrLength; i++) {
            progression[i] = progression[i - 1] + inc;
            if (i == absElem) {
                System.out.print(" ..");
            } else {
                System.out.print(" " + progression[i]);
            }
        }
        System.out.print("\nYour answer: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == progression[absElem]) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + answer + "'  is wrong answer ;(. Correct answer was '" + progression[absElem] + "'.");
        System.out.println("Let's try again, " + Cli.playerName + "!");
        return false;

    }
}
