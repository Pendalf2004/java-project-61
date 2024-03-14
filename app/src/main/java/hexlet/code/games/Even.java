package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_ROUNDS = 3;
    private static final int LAST_ROUND = 1;
    private static int currentRound = MAX_ROUNDS;
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        int question = Utils.getRndNum();
        if (question % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return String.valueOf(question);
    }
}
