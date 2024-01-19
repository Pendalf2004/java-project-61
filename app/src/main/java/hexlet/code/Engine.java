package hexlet.code;

import hexlet.code.games.*;

public class Engine {

    public static void face() {
        int correctAnswers = 0;
        switch (Cli.optionChoice()) {
            case 1:
                Cli.hello();
                break;
            case 2:
                Cli.hello();
                while (correctAnswers < 3) {
                    if (Even.round()) {
                        correctAnswers++;
                    } else {
                        break;
                    }
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "! ");
                }
                break;
            case 3:
                Cli.hello();
                while (correctAnswers < 3) {
                    if (MagicCalc.round()) {
                        correctAnswers++;
                    } else {
                        break;
                    }
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "! ");
                }
                break;
            case 4:
                Cli.hello();
                while (correctAnswers < 3) {
                    if (GCD.round()) {
                        correctAnswers++;
                    } else {
                        break;
                    }
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "! ");
                }
                break;
            case 5:
                Cli.hello();
                while (correctAnswers < 3) {
                    if (Progression.round()) {
                        correctAnswers++;
                    } else {
                        break;
                    }
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "! ");
                }
                break;
            case 6:
                Cli.hello();
                while (correctAnswers < 3) {
                    if (Prime.round()) {
                        correctAnswers++;
                    } else {
                        break;
                    }
                }
                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + Cli.playerName + "! ");
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
