package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Constants;
import hexlet.code.Engine;

import java.util.Random;

public final class Progression {

    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;

    private static final int START_BOUND = 20;

    private static final int STEP_BOUND = 10;

    public static void run() {
        String name = Cli.greetUser();
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData, name);
    }

    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String[][] generateGameData() {
        Random random = Constants.RANDOM;
        String[][] gameData = new String[Constants.MAX_QUESTION_NUMBER][2];
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
            int start = random.nextInt(START_BOUND);
            int step = random.nextInt(STEP_BOUND) + 1;
            String[] progression = generateProgression(start, step, length);
            int missingIndex = random.nextInt(length);
            String missingNumber = progression[missingIndex];
            progression[missingIndex] = "..";
            gameData[i][0] = String.join(" ", progression);
            gameData[i][1] = missingNumber;
        }

        return gameData;
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }
        return progression;
    }
}
