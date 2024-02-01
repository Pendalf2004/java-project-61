package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.MagicCalc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

public class Engine {
    private static final int MaxRandomNumber = 50;
    private static String question;
    private static String answer;
    private static String task;
    public static int getMaxRandomNumber() {
        return MaxRandomNumber;
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
}
