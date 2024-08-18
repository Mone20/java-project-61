package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;

import java.util.Random;

public final class GCD {

    public static final int NUMBER_BOUND = 100;

    public static void run() {
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData);
    }

    private static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String[][] generateGameData() {
        Random random = Constants.RANDOM;
        String[][] gameData = new String[Constants.MAX_QUESTION_NUMBER][2];
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int num1 = random.nextInt(NUMBER_BOUND);
            int num2 = random.nextInt(NUMBER_BOUND);
            gameData[i][0] = num1 + " " + num2;
            gameData[i][1] = Integer.toString(findGCD(num1, num2));
        }

        return gameData;
    }


    private static int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}
