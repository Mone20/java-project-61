package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public final class Exit extends AbstractGame {

    public Exit() {
        super(0);
    }

    @Override
    public boolean start() {
        System.exit(0);
        return true;
    }

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Question[] getQuestions() {
        return null;
    }

    @Override
    protected Question generateQuestion() {
        return null;
    }

    @Override
    public boolean isStub() {
        return true;
    }


}
