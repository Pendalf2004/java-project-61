package hexlet.code;

import java.util.Scanner;

public class App {
    private static String userAnswer;
    private static int chosenGame;
    static final int maxRounds = 3;
    static final int lastRound = 1;
    public static void main(String[] args) {
        chosenGame = getGameChose();
        if (chosenGame > 1) {
            Cli.hello();
            rounds(maxRounds);
        } else if (chosenGame == 1) {
            Cli.hello();
        }
    }
    public static String getUserAnswer() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.next();
        return userAnswer;
    }
    public static int getGameChose() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void rounds(int currentRound) {
        Engine.newRound(chosenGame);
        if (currentRound == maxRounds) {
            System.out.println(Engine.getTask());
        }
        System.out.print("Question: ");
        System.out.println(Engine.getQuestion());
        System.out.print("Your answer: ");
        if (Engine.getAnswer().equalsIgnoreCase(getUserAnswer())) {
            System.out.println("Correct!");
            if (currentRound == lastRound) {
                System.out.println("Congratulations, " + Cli.getPlayerName() + "! ");
                return;
            }
            rounds(currentRound - 1);
        } else {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + Engine.getAnswer() + "'.");
            System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
            return;
        }
    }
}
