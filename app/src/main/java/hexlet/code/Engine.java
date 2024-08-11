package hexlet.code;

import hexlet.code.strategies.Game;
import hexlet.code.strategies.GameFactory;

import java.util.Scanner;

public class Engine {

    public final void run() {
        Scanner scanner = new Scanner(System.in);

        GameFactory gameFactory = new GameFactory();
        System.out.println("Please enter the game number and press Enter.");
        gameFactory.printGameList();

        String gameNumber = scanner.nextLine();
        System.out.println("Your choice: " + gameNumber + "\n");
        Game game = gameFactory.getGameByNumber(Integer.parseInt(gameNumber));
        if (game == null) {
            System.out.printf("There is no game with number %s, please enter a correct number", gameNumber);
            return;
        }
        String name = null;
        if (!game.isStub()) {
            name = Cli.greetUser();
        }
        boolean result = game.start();
        if (!result) {
            System.out.printf("Let's try again, %s!\n", name);
            return;
        }
        if (!game.isStub()) {
            System.out.printf("Congratulations, %s!\n", name);
        }
    }
}
