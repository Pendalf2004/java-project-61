package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String playerName;
    public static void hello() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.playerName = input.next();
        System.out.println("Hello, " + Cli.playerName + "!");
    }

    public static int optionChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}

