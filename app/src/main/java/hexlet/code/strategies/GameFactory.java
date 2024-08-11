package hexlet.code.strategies;

import hexlet.code.Constants;
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
        availableGames.put(Constants.GREET_ORDER, new Greet());
        availableGames.put(Constants.EVEN_ORDER, new Even());
        availableGames.put(Constants.CALC_ORDER, new Calculator());
        availableGames.put(Constants.GCD_ORDER, new GCD());
        availableGames.put(Constants.PROGRESSION_ORDER, new Progression());
        availableGames.put(Constants.PRIME_ORDER, new Prime());
        availableGames.put(Constants.EXIT_ORDER, new Exit());
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
