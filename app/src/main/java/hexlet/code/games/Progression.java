package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    private static String task = "What number is missing in the progression?";
    private static String correctAnswer;
    public static String getTask() {
        return task;
    }
    public static String getQuestion() {
        String result = "";
        int prograssionAddedSteps = 5;
        int progressionMinSteps = 5;
        int progrLength = (int) Math.ceil(Math.random() * prograssionAddedSteps + progressionMinSteps);
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
