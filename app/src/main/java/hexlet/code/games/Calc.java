package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String TASK = "What is the result of the expression?";
    private static final int RNDM_MATH_OPERATION = 2;
    public static void startGame() {
        String[][] tasks = new String[Engine.getNumberOfTasks()][2];
        for (int i = 0; i < Engine.getNumberOfTasks(); i++) {
            int a = Utils.getRndNum();
            int b = Utils.getRndNum();
            var mathOperation = Utils.getRndNum(RNDM_MATH_OPERATION);
            if (mathOperation == 0) {
                tasks[i][1] = String.valueOf(calculate(a, b, mathOperation));
                tasks[i][0] = a + " + " + b;
            } else if (mathOperation == 1) {
                tasks[i][1] = String.valueOf(calculate(a, b, mathOperation));
                tasks[i][0] = a + " - " + b;
            } else if (mathOperation == 2) {
                tasks[i][1] = String.valueOf(calculate(a, b, mathOperation));
                tasks[i][0] = a + " * " + b;
            }
        }
        Engine.game(TASK, tasks);
    }
    public static int calculate(int a, int b, int operatr) {
        int result;
        if (operatr == 0) {
            return a + b;
        }
        result = operatr == 1 ? a - b : a * b;
        return result;
    }
}
