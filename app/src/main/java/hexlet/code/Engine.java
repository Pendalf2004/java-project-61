package hexlet.code;

import hexlet.code.games.*;

public class Engine {

    public static void face() {
        int correctAnswers = 1;
        switch (Cli.optionChoice()) {
            case 1:
                Cli.hello();
                break;
            case 2:
                Cli.hello();
                while (Even.round() & correctAnswers < 3) {
                    correctAnswers += 1;
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "!");
                }
                break;
            case 3:
                Cli.hello();
                while (MagicCalc.round() & correctAnswers < 3) {
                    correctAnswers += 1;
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "!");
                }
                break;
            case 4:
                Cli.hello();
                while (GCD.round() & correctAnswers < 3) {
                    correctAnswers += 1;
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "!");
                }
                break;
            case 0:
                return;
            default:
                return;
        }
        face();
    }


}
