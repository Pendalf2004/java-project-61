package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_TASKS = 3;
    private static final int FIRST_ROUND_INDEX = 0;
    public static void game(String task, String[][] tasks) {
        var playerName = Cli.playerGreeting();
        System.out.println(task);
        var numberOfTasks = tasks.length - 1;
        var currentRound = FIRST_ROUND_INDEX;
        while (currentRound <= numberOfTasks) {
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
            currentRound += 1;
            System.out.println("Correct!");
            if (currentRound > numberOfTasks) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
    public static int getNumberOfTasks() {
        return NUMBER_OF_TASKS;
    }
}
