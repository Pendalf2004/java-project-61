package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        String[][] tasks = new String[Engine.getTaskArrayMaxIndex()][2];
        for (int i = 0; i < Engine.getTaskArrayMaxIndex(); i++) {
            var question = Utils.getRndNum();
            tasks[i][0] = String.valueOf(question);
            tasks[i][1] = isEven(question) ? "yes" :  "no";
        }
        Engine.game(TASK, tasks);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
