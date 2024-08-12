package hexlet.code.games;

import hexlet.code.Constants;

import java.util.Random;


public final class Calculator {

    private static final char[] OPERATORS = {'+', '-', '*'};


    public static String getDescription() {
        return "What is the result of the expression?";
    }

    public static void fillQuestionsAndAnswers(String[] questions, String[] answers) {
        Random random = Constants.RANDOM;
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int num1 = random.nextInt(Constants.NUMBER_BOUND);
            int num2 = random.nextInt(Constants.NUMBER_BOUND);
            char operator = getRandomOperator();
            questions[i] = num1 + " " + operator + " " + num2;
            answers[i] = Integer.toString(calculateAnswer(num1, num2, operator));
        }
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
