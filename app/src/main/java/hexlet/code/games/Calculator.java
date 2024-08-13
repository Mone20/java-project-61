package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Constants;
import hexlet.code.Engine;

import java.util.Random;


public final class Calculator {

    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void run() {
        String name = Cli.greetUser();
        String[][] gameData = generateGameData();
        Engine.start(getDescription(), gameData, name);
    }

    private static String getDescription() {
        return "What is the result of the expression?";
    }

    private static String[][] generateGameData() {
        Random random = Constants.RANDOM;
        String[][] gameData = new String[Constants.MAX_QUESTION_NUMBER][2];
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int num1 = random.nextInt(Constants.NUMBER_BOUND);
            int num2 = random.nextInt(Constants.NUMBER_BOUND);
            char operator = getRandomOperator();
            gameData[i][0] = num1 + " " + operator + " " + num2;
            gameData[i][1] = Integer.toString(calculateAnswer(num1, num2, operator));
        }
        return gameData;
    }


    private static char getRandomOperator() {
        return OPERATORS[Constants.RANDOM.nextInt(OPERATORS.length)];
    }

    private static int calculateAnswer(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalArgumentException("Unexpected operator: " + operator);
        };
    }
}
