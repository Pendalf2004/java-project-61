package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String TASK = "What is the result of the expression?";
    private static final int RNDM_MATH_OPERATION = 2;
    public static void startGame() {
        String[][] tasks = new String[Engine.getTaskArrayMaxIndex()][2];
        for (int i = 0; i < Engine.getTaskArrayMaxIndex(); i++) {
            int a = Utils.getRndNum();
            int b = Utils.getRndNum();
            char[] mathOperations = new char[]{'+', '-', '*'};
            var mathOperation = Utils.getRndNum(RNDM_MATH_OPERATION);
            tasks[i][1] = String.valueOf(calculate(a, b, mathOperations[mathOperation]));
            tasks[i][0] = a + " " + mathOperations[mathOperation] + " " + b;
        }
        Engine.game(TASK, tasks);
    }

    public static int calculate(int a, int b, char operatr) {
        return switch (operatr) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }
}
