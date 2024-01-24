package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    private static String task = "Find the greatest common divisor of given numbers.";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }

    public static String getQuestion() {
        int a = (int) (Math.random() * Engine.getMaxRandomNumber() + 1);
        int b = (int) (Math.random() * Engine.getMaxRandomNumber() + 1);
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

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
