package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public final class Prime extends AbstractGame {

    public Prime() {
        super(6);
    }

    @Override
    public String getName() {
        return "Prime";
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }


    @Override
    protected Question generateQuestion() {
        int question = getRandom().nextInt(getNumberBound());
        return new Question(Integer.toString(question), isPrime(question) ? "yes" : "no");
    }

    public boolean isPrime(int number) {
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
