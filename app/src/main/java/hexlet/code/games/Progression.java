package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int MAX_PRGRS_ADDED_STEPS = 5;
    private static final int MIN_PRGRS_LENGTH = 5;
    private static String correctAnswer;
    public static String getTask() {
        return TASK;
    }
    public static String getQuestion() {
        String result = "";
        int progrLength = (int) Math.ceil(Math.random() * MAX_PRGRS_ADDED_STEPS + MIN_PRGRS_LENGTH);
        int[] progression = new int[progrLength];
        progression[0] = (int) Math.ceil(Math.random() * Engine.getMaxRandomNumber());
        int absElem = (int) Math.floor(Math.random() * (progrLength - 1));
        int step = (int) Math.ceil(Math.random() * Engine.getMaxRandomNumber() + 1);
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

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
