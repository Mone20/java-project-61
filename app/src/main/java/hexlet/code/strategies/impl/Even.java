package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public class Even extends AbstractGame {
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
        int question = random.nextInt(100);
        return new Question(Integer.toString(question), (question % 2 == 0) ? "yes" : "no");
    }
}
