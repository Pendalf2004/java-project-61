package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class MagicCalc {

    private static final String TASK = "What is the result of the expression?";
    private static String correctAnswer;
    public static final int RNDM_MATH_OPERATION = 2;

    public static void startGame() {
        String[] questions = new String[3];
        String[] answers = new String[3];
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
