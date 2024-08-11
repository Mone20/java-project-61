package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

import java.util.Random;


public final class Calculator extends AbstractGame {

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
        Random random = getRandom();
        int num1 = random.nextInt(getNumberBound());
        int num2 = random.nextInt(getNumberBound());
        char operator = getRandomOperator();
        return new Question(num1 + " " + operator + " " + num2,
                Integer.toString(calculateAnswer(num1, num2, operator)));

    }

    private char getRandomOperator() {
        return operators[getRandom().nextInt(operators.length)];
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
