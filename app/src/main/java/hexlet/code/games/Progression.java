package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int MAX_PRGRS_ADDED_STEPS = 5;
    private static final int MIN_PRGRS_LENGTH = 5;
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 20;
    public static void startGame() {
        String[][] tasks = new String[Engine.getNumberOfTasks()][2];
        for (int i = 0; i < Engine.getNumberOfTasks(); i++) {
            int[] progression = getProgression();
            int absElem = (int) Math.floor(Math.random() * (progression.length - 1));
            tasks[i][1] = String.valueOf(progression[absElem]);
            progression[absElem] = -1;
            tasks[i][0] = Arrays.toString(progression).replaceAll("\\[|\\]|,", "").replace("-1", "..");
        }
        Engine.game(TASK, tasks);
    }
    public static int[] getProgression() {
        int progrLength = Utils.getRndNum(MIN_PRGRS_LENGTH, MAX_PRGRS_ADDED_STEPS + MIN_PRGRS_LENGTH);
        int[] progression = new int[progrLength];
        progression[0] = Utils.getRndNum();
        int step = Utils.getRndNum(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        for (int i = 1; i < progrLength; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
