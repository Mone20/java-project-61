package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

import java.util.Random;

public final class Progression extends AbstractGame {

    private final int maxLength = 10;
    private final int minLength = 5;

    private final int startBound = 20;

    private final int stepBound = 10;

    public Progression() {
        super(5);
    }

    @Override
    public String getName() {
        return "Progression";
    }

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }


    @Override
    protected Question generateQuestion() {
        Random random = getRandom();
        int length = random.nextInt(maxLength - minLength) + minLength;
        int start = random.nextInt(startBound);
        int step = random.nextInt(stepBound) + 1;

        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }

        int missingIndex = random.nextInt(length);
        String missingNumber = progression[missingIndex];
        progression[missingIndex] = "..";
        return new Question(String.join(" ", progression), missingNumber);
    }
}
