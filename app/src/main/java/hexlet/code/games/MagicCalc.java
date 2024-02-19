package hexlet.code.games;

import hexlet.code.Engine;

public class MagicCalc {

    private static String task = "What is the result of the expression?";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }
    public static final int RNDM_MATH_OPERATION = 3;
    public static String getQuestion() {
        int a = Math.toIntExact(Math.round(Math.random() * Engine.getMaxRandomNumber()));
        int b = Math.toIntExact(Math.round(Math.random() * Engine.getMaxRandomNumber()));
        //int c = 0;
        double floor = Math.floor(Math.random() * RNDM_MATH_OPERATION);
        if (floor == 0) {
            correctAnswer = String.valueOf(a + b);
            return  a + " + " + b;
        } else if (floor == 1) {
            correctAnswer = String.valueOf(a - b);
            return a + " - " + b;
        } else if (floor == 2) {
            correctAnswer = String.valueOf(a * b);
            return a + " * " + b;
        }
        return "";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
