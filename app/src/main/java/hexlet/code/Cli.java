package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String playerName;

    public static String getPlayerName() {
        return playerName;
    }
    public static void hello() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
    }
}

