package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine.setChosenGame(getGameChose());
        if (Engine.getChosenGame().equals("1")) {
            Cli.hello();
        } else if (!Engine.getChosenGame().equals("0")) {
            Cli.hello();
            Engine.rounds();
        }
    }
    public static String getGameChose() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner gameChoseInput = new Scanner(System.in);
        var answer = gameChoseInput.next();
        //gameChoseInput.close();
        return answer;
    }
}
