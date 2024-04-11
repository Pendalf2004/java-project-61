package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.MagicCalc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner gameChoseInput = new Scanner(System.in);
        var chosenOption = gameChoseInput.next();
        switch (chosenOption) {
            case "1":
                var tmpVar = Cli.playerGreeting();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                MagicCalc.startGame();
                break;
            case "4":
                GCD.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                System.out.println("Please make a valid chose next time.");
                return;
        }
        Scanner closingSystemIn = new Scanner(System.in);
        closingSystemIn.close();
    }
}
