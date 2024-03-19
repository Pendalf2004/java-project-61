package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String correctAnswer;
    public static void startGame() {
        int numberOfTasks = 3;
        String[] questions = new String[numberOfTasks];
        String[] answers = new String[numberOfTasks];
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
