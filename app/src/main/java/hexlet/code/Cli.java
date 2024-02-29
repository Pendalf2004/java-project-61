package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String hello() {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var playerName = nameInput.next();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}

