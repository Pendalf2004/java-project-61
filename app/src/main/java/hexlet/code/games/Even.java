package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        String[][] tasks = new String[Engine.getNumberOfTasks()][2];
        for (int i = 0; i < Engine.getNumberOfTasks(); i++) {
            tasks[i][0] = getQuestion();
            tasks[i][1] = (Integer.parseInt(tasks[i][0]) % 2 == 0) ? "yes" :  "no";
        }
        Engine.game(TASK, tasks);
    }
    public static String getQuestion() {
        int question = Utils.getRndNum();
        return String.valueOf(question);
    }
}
