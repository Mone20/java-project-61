package hexlet.code.games;

import hexlet.code.Constants;

import java.util.Random;

public final class Progression {

    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;

    private static final int START_BOUND = 20;

    private static final int STEP_BOUND = 10;

    public static String getDescription() {
        return "What number is missing in the progression?";
    }


    public static void fillQuestionsAndAnswers(String[] questions, String[] answers) {
        Random random = Constants.RANDOM;
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
            String[] progression = generateProgression(length);
            int missingIndex = random.nextInt(length);
            String missingNumber = progression[missingIndex];
            progression[missingIndex] = "..";
            questions[i] = String.join(" ", progression);
            answers[i] = missingNumber;
        }
    }

    private static String[] generateProgression(int length) {
        Random random = Constants.RANDOM;
        int start = random.nextInt(START_BOUND);
        int step = random.nextInt(STEP_BOUND) + 1;

        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }
        return progression;
    }
}
