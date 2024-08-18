package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Main {
    private static final String[] AVAILABLE_GAMES =
            new String[]{"Greet", "Even", "Calc", "GCD", "Progression", "Prime"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        printGameList();
        String gameNumber = scanner.nextLine();
        System.out.println("Your choice: " + gameNumber + "\n");
        scanner.close();
        switch (Integer.parseInt(gameNumber)) {
            case Constants.EXIT_ORDER:
                System.exit(0);
                return;
            case Constants.GREET_ORDER:
                Engine.greetUser();
                return;
            case Constants.EVEN_ORDER:
                Even.run();
                break;
            case Constants.CALC_ORDER:
                Calculator.run();
                break;
            case Constants.GCD_ORDER:
                GCD.run();
                break;
            case Constants.PROGRESSION_ORDER:
                Progression.run();
                break;
            case Constants.PRIME_ORDER:
                Prime.run();
                break;
            default:
                System.out.printf("There is no game with number %s, please enter a correct number", gameNumber);
        }

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
