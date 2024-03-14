package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class MagicCalc {

    private static final String TASK = "What is the result of the expression?";
    private static final int MAX_ROUNDS = 3;
    private static final int LAST_ROUND = 1;
    private static int currentRound = MAX_ROUNDS;
    private static String correctAnswer;
    public static final int RNDM_MATH_OPERATION = 2;

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
        int a = Utils.getRndNum();
        int b = Utils.getRndNum();
        var mathOperation = Utils.getRndNum(RNDM_MATH_OPERATION);
        System.out.println("Rndm mah - " + mathOperation);
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
