package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Constants;
import hexlet.code.Engine;

public final class Prime {

    public static void run() {
        String name = Cli.greetUser();
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData, name);
    }

    public static String[][] generateGameData() {
        String[][] gameData = new String[Constants.MAX_QUESTION_NUMBER][2];
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int question = generateQuestion();
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = generateAnswer(question);
        }

        return gameData;
    }

    public static String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static int generateQuestion() {
        return Constants.RANDOM.nextInt(Constants.NUMBER_BOUND);
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
