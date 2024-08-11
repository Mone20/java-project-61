package hexlet.code.strategies.impl;

import hexlet.code.model.Question;
import hexlet.code.strategies.AbstractGame;

public class Progression extends AbstractGame {

    private final int maxLength = 10;
    private final int minLength = 5;

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
        int length = random.nextInt(maxLength - minLength) + minLength;
        int start = random.nextInt(20);
        int step = random.nextInt(10) + 1;

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
