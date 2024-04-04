package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUM = 50;
    private static final int MIN_RANDOM_NUM = 1;
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    public static void startGame() {
        String[][] tasks = new String[Engine.getNumberOfTasks()][2];
        for (int i = 0; i < Engine.getNumberOfTasks(); i++) {
            int firstNum = Utils.getRndNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            int secondNum = Utils.getRndNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            tasks[i][0] = firstNum + " " + secondNum;
            tasks[i][1] = String.valueOf(gcd(firstNum, secondNum));
        }
        Engine.game(TASK, tasks);
    }
    private static int gcd(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if ((a % i == 0) & (b % i == 0)) {
                return i;
            }
        }
        return 1;
    }
}
