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
                while (Even.evenRound() & correctAnswers < 3) {
                    correctAnswers += 1;
                }
                face();
            case 3:
                Cli.hello();
                while (MagicCalc.magicCalcRound() & correctAnswers < 3) {
                    correctAnswers += 1;
                }
                face();
            case 0:
                break;
            default:
                face();
        }
        return;
    }


}
