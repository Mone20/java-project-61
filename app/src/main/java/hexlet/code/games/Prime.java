package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public final class Prime {

    public static final int NUMBER_BOUND = 100;

    public static void run() {
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData);
    }

    private static String[][] generateGameData() {
        String[][] gameData = new String[Constants.MAX_QUESTION_NUMBER][2];
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int question = generateQuestion();
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = generateAnswer(question);
        }

        return gameData;
    }

    private static String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static int generateQuestion() {
        return Utils.generateRandomInt(0, NUMBER_BOUND);
    }

    private static String generateAnswer(int question) {
        return isPrime(question) ? "yes" : "no";
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
