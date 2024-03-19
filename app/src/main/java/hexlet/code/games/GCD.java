package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUM = 50;
    private static final int MIN_RANDOM_NUM = 1;
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static String correctAnswer;
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
        int a = Utils.getRndNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
        int b = Utils.getRndNum(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
        correctAnswer = String.valueOf(gcd(a, b));
        return a + " " + b;
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
