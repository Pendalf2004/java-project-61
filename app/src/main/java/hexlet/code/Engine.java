package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.MagicCalc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

public class Engine {
    public static int maxRandomNumber = 50;
    public static int getMaxRandomNumber() {
        return maxRandomNumber;
    }
    private static String userAnswer;
    public static String getUserAnswer() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.next();
        return userAnswer;
    }

    public static void startGame(int choosenOption) {
        final int maxRounds = 3;
        int currentRound = 0;

        switch (choosenOption) {
            case 1:
                App.hello();
                break;
            case 2:
                App.hello();
                while (currentRound < maxRounds) {
                    System.out.println(Even.getTask());
                    System.out.print("Question: ");
                    System.out.println(Even.getQuestion());
                    System.out.print("Your answer: ");
                    if (Engine.getUserAnswer().equalsIgnoreCase(Even.getCorrectAnswer())) {
                        System.out.println("Correct!");
                        currentRound++;
                        if (currentRound == maxRounds) {
                            System.out.println("Congratulations, " + App.getPlayerName() + "! ");
                        }
                    } else {
                        System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + Even.getCorrectAnswer() + "'.");
                        System.out.println("Let's try again, " + App.getPlayerName() + "!");
                        break;
                    }
                }
            case 3:
                App.hello();
                while (currentRound < maxRounds) {
                    System.out.println(MagicCalc.getTask());
                    System.out.print("Question: ");
                    System.out.println(MagicCalc.getQuestion());
                    System.out.print("Your answer: ");
                    if (Engine.getUserAnswer().equalsIgnoreCase(MagicCalc.getCorrectAnswer())) {
                        System.out.println("Correct!");
                        currentRound++;
                        if (currentRound == maxRounds) {
                            System.out.println("Congratulations, " + App.getPlayerName() + "! ");
                        }
                    } else {
                        System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + MagicCalc.getCorrectAnswer() + "'.");
                        System.out.println("Let's try again, " + App.getPlayerName() + "!");
                        break;
                    }
                }
            case 4:
                App.hello();
                while (currentRound < maxRounds) {
                    System.out.println(GCD.getTask());
                    System.out.print("Question: ");
                    System.out.println(GCD.getQuestion());
                    System.out.print("Your answer: ");
                    if (Engine.getUserAnswer().equalsIgnoreCase(GCD.getCorrectAnswer())) {
                        System.out.println("Correct!");
                        currentRound++;
                        if (currentRound == maxRounds) {
                            System.out.println("Congratulations, " + App.getPlayerName() + "! ");
                        }
                    } else {
                        System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + GCD.getCorrectAnswer() + "'.");
                        System.out.println("Let's try again, " + App.getPlayerName() + "!");
                        break;
                    }
                }
            case 5:
                App.hello();
                while (currentRound < maxRounds) {
                    System.out.println(Progression.getTask());
                    System.out.print("Question: ");
                    System.out.println(Progression.getQuestion());
                    System.out.print("Your answer: ");
                    if (Engine.getUserAnswer().equalsIgnoreCase(Progression.getCorrectAnswer())) {
                        System.out.println("Correct!");
                        currentRound++;
                        if (currentRound == maxRounds) {
                            System.out.println("Congratulations, " + App.getPlayerName() + "! ");
                        }
                    } else {
                        System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + Progression.getCorrectAnswer() + "'.");
                        System.out.println("Let's try again, " + App.getPlayerName() + "!");
                        break;
                    }
                }
            case 6:
                App.hello();
                while (currentRound < maxRounds) {
                    System.out.println(Prime.getTask());
                    System.out.print("Question: ");
                    System.out.println(Prime.getQuestion());
                    System.out.print("Your answer: ");
                    if (Engine.getUserAnswer().equalsIgnoreCase(Prime.getCorrectAnswer())) {
                        System.out.println("Correct!");
                        currentRound++;
                        if (currentRound == maxRounds) {
                            System.out.println("Congratulations, " + App.getPlayerName() + "! ");
                        }
                    } else {
                        System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + Prime.getCorrectAnswer() + "'.");
                        System.out.println("Let's try again, " + App.getPlayerName() + "!");
                        break;
                    }
                }
            case 0:
                return;
            default:
        }
    }


}
