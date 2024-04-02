package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class MagicCalc {

    private static final String TASK = "What is the result of the expression?";
    private static String correctAnswer;
    private static final int RNDM_MATH_OPERATION = 2;
    public static void startGame() {
        String[][] tasks = new String[Engine.getNumberOfTasks()][2];
        for (int i = 0; i < Engine.getNumberOfTasks(); i++) {
            tasks[i][0] = getQuestion();
            tasks[i][1] = correctAnswer;
        }
        Engine.game(TASK, tasks);
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
