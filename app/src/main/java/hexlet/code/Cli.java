package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final String[] AVAILABLE_GAMES =
            new String[]{"Greet", "Even", "Calc", "GCD", "Progression", "Prime"};

    public static String greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        return name;
    }


    /**
     * Prints a message with the game list.
     */
    public static void printGameList() {
        for (int i = 0; i < AVAILABLE_GAMES.length; i++) {
            System.out.println(i + 1 + " - " + AVAILABLE_GAMES[i]);
        }
        System.out.println(0 + " - " + "Exit");
    }
}
