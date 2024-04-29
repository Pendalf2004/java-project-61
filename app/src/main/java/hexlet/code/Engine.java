package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int TASK_ARRAY_MAX_INDEX = 3;
    private static final int FIRST_ROUND_INDEX = 0;
    public static void game(String task, String[][] tasks) {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var playerName = nameInput.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(task);
        for (int currentRound = FIRST_ROUND_INDEX; currentRound <= TASK_ARRAY_MAX_INDEX - 1; currentRound++) {
            var question = tasks[currentRound][0];
            var answer = tasks[currentRound][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner answerInput = new Scanner(System.in);
            var userAnswer = answerInput.next();
            if (!userAnswer.equalsIgnoreCase(answer)) {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
            if (currentRound == TASK_ARRAY_MAX_INDEX - 1) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
    public static int getTaskArrayMaxIndex() {
        return TASK_ARRAY_MAX_INDEX;
    }
}
