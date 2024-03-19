package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int NUMBER_OF_TASKS = 3;
    private static String correctAnswer;
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
