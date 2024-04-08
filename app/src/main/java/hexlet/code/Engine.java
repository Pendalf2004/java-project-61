package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_TASKS = 3;
    private static final int MAX_ROUNDS = 0;
    private static final int LAST_ROUND = 2;
    private static String playerName;
    public static void game(String task, String[][] tasks) {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = nameInput.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(task);
        var currentRound = MAX_ROUNDS;
        var correctlyAnswered = true;
        while (correctlyAnswered && currentRound <= LAST_ROUND) {
            var question = tasks[currentRound][0];
            var answer = tasks[currentRound][1];
            correctlyAnswered = newRound(question, answer, "Correct!");
            currentRound += 1;
            if (correctlyAnswered && (currentRound > LAST_ROUND)) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
    public static boolean newRound(String question, String correctAnswer, String corrAnswerMsg) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner answerInput = new Scanner(System.in);
        var userAnswer = answerInput.next();
        if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }
        System.out.println(corrAnswerMsg);
        return true;
    }
    public static int getNumberOfTasks() {
        return NUMBER_OF_TASKS;
    }
}
