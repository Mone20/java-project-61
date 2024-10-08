package hexlet.code.strategies.impl;

import hexlet.code.Cli;
import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;


public final class Greet extends AbstractGame {

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
    protected Question generateQuestion() {
        return null;
    }


    @Override
    public boolean isStub() {
        return true;
    }

}
