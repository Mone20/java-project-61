package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public class GCD extends AbstractGame {

    @Override
    public String getName() {
        return "GCD";
    }

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected Question generateQuestion() {
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        return new Question(num1 + " " + num2, Integer.toString(findGCD(num1, num2)));
    }

    private int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}
