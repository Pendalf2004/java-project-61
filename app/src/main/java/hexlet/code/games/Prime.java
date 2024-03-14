package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    private static final int MAX_ROUNDS = 3;
    private static final int LAST_ROUND = 1;
    private static int currentRound = MAX_ROUNDS;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        boolean isPrime = true;
        var a = Utils.getRndNum();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return String.valueOf(a);
    }
}
