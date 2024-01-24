package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    private static String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }

    public static String getQuestion() {
        int question = Math.toIntExact(Math.round(Math.random() * Engine.getMaxRandomNumber()));
        if (question % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return String.valueOf(question);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
