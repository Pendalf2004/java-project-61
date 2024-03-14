package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_ROUNDS = 3;
    private static final int LAST_ROUND = 1;
    private static int currentRound = MAX_ROUNDS;
    private static final String TASK = "What number is missing in the progression?";
    private static final int MAX_PRGRS_ADDED_STEPS = 5;
    private static final int MIN_PRGRS_LENGTH = 5;
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 20;
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
        String result = "";
        int progrLength = Utils.getRndNum(MIN_PRGRS_LENGTH, MAX_PRGRS_ADDED_STEPS + MIN_PRGRS_LENGTH);
        int[] progression = new int[progrLength];
        progression[0] = Utils.getRndNum();
        int absElem = (int) Math.floor(Math.random() * (progrLength - 1));
        int step = Utils.getRndNum(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        if (absElem > 0) {
            result = result + progression[0];
        } else {
            result = result + "..";
        }
        for (int i = 1; i < progrLength; i++) {
            progression[i] = progression[i - 1] + step;
            if (i == absElem) {
                result = result + " ..";
            } else {
                result = result + " " + progression[i];
            }
        }
        correctAnswer = String.valueOf(progression[absElem]);
        return result;
    }
}
