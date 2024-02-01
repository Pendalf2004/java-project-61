package hexlet.code.games;
import hexlet.code.Engine;
public class Prime {
    private static String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }

    public static String getQuestion() {
        boolean isPrime = true;
        int a = Math.toIntExact(Math.round(Math.random() * Engine.getMaxRandomNumber()));
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

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
