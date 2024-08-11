package hexlet.code.strategies.impl;

import hexlet.code.Cli;
import hexlet.code.model.Question;
import hexlet.code.strategies.Game;


public final class Greet implements Game {
    @Override
    public boolean start() {
        Cli.greetUser();
        return true;
    }

    @Override
    public String getName() {
        return "Greet";
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
        return 1;
    }
}
