package hexlet.code.strategies;

import hexlet.code.strategies.impl.Calculator;
import hexlet.code.strategies.impl.Even;
import hexlet.code.strategies.impl.Exit;
import hexlet.code.strategies.impl.Greet;
import hexlet.code.strategies.impl.GCD;
import hexlet.code.strategies.impl.Progression;
import hexlet.code.strategies.impl.Prime;

import java.util.LinkedHashMap;
import java.util.Map;

public final class GameFactory {
    private final Map<Integer, Game> availableGames = new LinkedHashMap<>();

    public GameFactory() {
        addGameInList(new Greet());
        addGameInList(new Even());
        addGameInList(new Calculator());
        addGameInList(new GCD());
        addGameInList(new Progression());
        addGameInList(new Prime());
        addGameInList(new Exit());
    }

    private void addGameInList(Game game) {
        availableGames.put(game.getOrder(), game);
    }

    public Game getGameByNumber(int number) {
        return availableGames.get(number);
    }

    public void printGameList() {
        for (Map.Entry<Integer, Game> entry : availableGames.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
    }

}
