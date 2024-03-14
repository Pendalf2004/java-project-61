package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUM = 50;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int MAX_ROUNDS = 3;
    private static final int LAST_ROUND = 1;
    private static int currentRound = MAX_ROUNDS;
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static String correctAnswer;

    public static void startGame() {
        var correctlyAnswered = true;
        while (correctlyAnswered && currentRound >= LAST_ROUND) {
            if (currentRound == MAX_ROUNDS) {
                correctlyAnswered = Engine.newRound(TASK, getQuestion(), correctAnswer, "Correct!");
                currentRound -= 1;
            } else {
                correctlyAnswered = Engine.newRound(getQuestion(), correctAnswer, "Correct!");
                currentRound -= 1;
            }
            if (correctlyAnswered && (currentRound < LAST_ROUND)) {
                System.out.println("Congratulations, " + Engine.getPlayerName() + "!");
            }
        }
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
