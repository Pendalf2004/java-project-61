package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userAnswer;
    private static String playerName;
    public static boolean newRound(String task, String question, String correctAnswer, String corrAnswerMsg) {
        playerName = Cli.hello();
        System.out.println(task);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        if (!getUserAnswer().equalsIgnoreCase(correctAnswer)) {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }
        System.out.println(corrAnswerMsg);
        return true;
    }
    public static boolean newRound(String question, String correctAnswer, String corrAnswerMsg) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        if (!getUserAnswer().equalsIgnoreCase(correctAnswer)) {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }
        System.out.println(corrAnswerMsg);
        return true;
    }
    public static String getUserAnswer() {
        Scanner answerInput = new Scanner(System.in);
        userAnswer = answerInput.next();
        //answerInput.close();
        return userAnswer;
    }
    public static String getPlayerName() {
        return playerName;
    }
}
