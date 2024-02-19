package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.MagicCalc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    static final int LAST_ROUND = 1;
    static final int MAX_ROUNDS = 3;
    private static final int MAX_RANDOM_NUMBER = 50;
    private static String userAnswer;
    private static int chosenGame;
    private static String question;
    private static String answer;
    private static String task;
    public static int getMaxRandomNumber() {
        return MAX_RANDOM_NUMBER;
    }
    public static String getTask() {
        return task;
    }
    public static String getQuestion() {
        return question;
    }
    public static String getAnswer() {
        return answer;
    }

    public static void rounds() {
        rounds(MAX_ROUNDS);
    }
    public static void rounds(int currentRound) {
        Engine.newRound(chosenGame);
        if (currentRound == MAX_ROUNDS) {
            System.out.println(Engine.getTask());
        }
        System.out.print("Question: ");
        System.out.println(Engine.getQuestion());
        System.out.print("Your answer: ");
        if (Engine.getAnswer().equalsIgnoreCase(getUserAnswer())) {
            System.out.println("Correct!");
            if (currentRound == LAST_ROUND) {
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
    public static void newRound(int chosenOption) {
        switch (chosenOption) {
            case 2:
                question = Even.getQuestion();
                task = Even.getTask();
                answer = Even.getCorrectAnswer();
                break;
            case 3:
                question = MagicCalc.getQuestion();
                task = MagicCalc.getTask();
                answer = MagicCalc.getCorrectAnswer();
                break;
            case 4:
                question = GCD.getQuestion();
                task = GCD.getTask();
                answer = GCD.getCorrectAnswer();
                break;
            case 5:
                question = Progression.getQuestion();
                task = Progression.getTask();
                answer = Progression.getCorrectAnswer();
                break;
            case 6:
                question = Prime.getQuestion();
                task = Prime.getTask();
                answer = Prime.getCorrectAnswer();
                break;
            default:
                return;
        }
    }
    public static void setChosenGame(int game) {
        chosenGame = game;
    }
    public static int getChosenGame() {
        return chosenGame;
    }
    public static String getUserAnswer() {
        Scanner answerInput = new Scanner(System.in);
        userAnswer = answerInput.next();
        //answerInput.close();
        return userAnswer;
    }
}
