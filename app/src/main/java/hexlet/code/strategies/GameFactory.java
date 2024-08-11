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

public class GameFactory {
    private final Map<Integer, Game> availableGames = new LinkedHashMap<>();

    public GameFactory() {
        availableGames.put(1, new Greet());
        availableGames.put(2, new Even());
        availableGames.put(3, new Calculator());
        availableGames.put(4, new GCD());
        availableGames.put(5, new Progression());
        availableGames.put(6, new Prime());
        availableGames.put(0, new Exit());
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
