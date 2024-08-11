package hexlet.code.strategies;

import hexlet.code.model.Question;

public interface Game {

    boolean start();

    String getName();

    String getDescription();

    Question[] getQuestions();

    boolean isStub();

    int getOrder();


}
