package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.Game;

public final class Exit implements Game {
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
    public boolean isStub() {
        return true;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
