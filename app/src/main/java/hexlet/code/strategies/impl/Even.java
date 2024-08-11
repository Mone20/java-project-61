package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public final class Even extends AbstractGame {

    @Override
    public String getName() {
        return "Even";
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }


    @Override
    protected Question generateQuestion() {
        int question = getRandom().nextInt(getNumberBound());
        return new Question(Integer.toString(question), (question % 2 == 0) ? "yes" : "no");
    }
}
