package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        Cli.printGameList();
        String gameNumber = scanner.nextLine();
        System.out.println("Your choice: " + gameNumber + "\n");
        switch (Integer.parseInt(gameNumber)) {
            case Constants.EXIT_ORDER:
                System.exit(0);
                return;
            case Constants.GREET_ORDER:
                Cli.greetUser();
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
}
