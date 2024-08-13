package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Constants;
import hexlet.code.Engine;

public final class Even {

    public static void run() {
        String name = Cli.greetUser();
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData, name);
    }

    private static String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
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


    private static int generateQuestion() {
        return Constants.RANDOM.nextInt(Constants.NUMBER_BOUND);
    }

    private static String generateAnswer(int question) {
        return (question % 2 == 0) ? "yes" : "no";
    }

}
