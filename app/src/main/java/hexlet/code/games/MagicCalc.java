package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class MagicCalc {

    private static final String TASK = "What is the result of the expression?";
    private static String correctAnswer;
    private static final int RNDM_MATH_OPERATION = 2;
    private static final int NUMBER_OF_TASKS = 3;

    public static void startGame() {
        String[] questions = new String[NUMBER_OF_TASKS];
        String[] answers = new String[NUMBER_OF_TASKS];
        for (int i = 0; i <= 2; i++) {
            questions[i] = getQuestion();
            answers[i] = correctAnswer;
        }
        Engine.game(TASK, questions, answers);
    }
    public static String getQuestion() {
        int a = Utils.getRndNum();
        int b = Utils.getRndNum();
        var mathOperation = Utils.getRndNum(RNDM_MATH_OPERATION);
        if (mathOperation == 0) {
            correctAnswer = String.valueOf(a + b);
            return a + " + " + b;
        } else if (mathOperation == 1) {
            correctAnswer = String.valueOf(a - b);
            return a + " - " + b;
        } else if (mathOperation == 2) {
            correctAnswer = String.valueOf(a * b);
            return a + " * " + b;
        }
        return "";
    }
}
