package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        String[][] tasks = new String[Engine.getTaskArrayMaxIndex()][2];
        for (int i = 0; i < Engine.getTaskArrayMaxIndex(); i++) {
            tasks[i][0] = String.valueOf(Utils.getRndNum());
            tasks[i][1] = isPrime(Integer.parseInt(tasks[i][0])) ? "yes" : "no";
        }
        Engine.game(TASK, tasks);
    }
    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
