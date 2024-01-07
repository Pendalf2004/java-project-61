package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
        input.close();
    }
}