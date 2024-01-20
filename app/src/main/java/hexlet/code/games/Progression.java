package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Progression {

    public static boolean round() {
        int maxIncStep = 9;
        int step = (int) Math.ceil(Math.random() * maxIncStep + 1);
        int prograssionAddedSteps = 5;
        int progressionMinSteps = 5;
        int progrLength = (int) Math.ceil(Math.random() * prograssionAddedSteps + progressionMinSteps);
        int[] progression = new int[progrLength];
        int maxNum = 30;
        progression[0] = (int) Math.ceil(Math.random() * maxNum);
        int absElem = (int) Math.floor(Math.random() * (progrLength - 1));
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        if (absElem > 0) {
            System.out.print(progression[0]);
        } else {
            System.out.print("..");
        }
        for (int i = 1; i < progrLength; i++) {
            progression[i] = progression[i - 1] + step;
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
        System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
        return false;

    }
}
