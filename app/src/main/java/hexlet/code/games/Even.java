package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        int question = Utils.getRndNum();
        if (question % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return String.valueOf(question);
    }
}
