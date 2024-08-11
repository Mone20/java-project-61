package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;


public class Calculator extends AbstractGame {

    private final char[] operators = {'+', '-', '*'};

    @Override
    public String getName() {
        return "Calc";
    }

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }

    @Override
    protected Question generateQuestion() {
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        char operator = getRandomOperator();
        return new Question(num1 + " " + operator + " " + num2,
                Integer.toString(calculateAnswer(num1, num2, operator)));

    }

    private char getRandomOperator() {
        return operators[random.nextInt(operators.length)];
    }

    private int calculateAnswer(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalArgumentException("Unexpected operator: " + operator);
        };
    }
}
