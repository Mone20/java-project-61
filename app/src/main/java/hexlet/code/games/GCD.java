package hexlet.code.games;

import hexlet.code.Constants;

import java.util.Random;

public final class GCD  {

    public static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void fillQuestionsAndAnswers(String[] questions, String[] answers) {
        Random random = Constants.RANDOM;
        for (int i = 0; i < Constants.MAX_QUESTION_NUMBER; i++) {
            int num1 = random.nextInt(Constants.NUMBER_BOUND);
            int num2 = random.nextInt(Constants.NUMBER_BOUND);
            questions[i] = num1 + " " + num2;
            answers[i] = Integer.toString(findGCD(num1, num2));
        }
    }


    private static int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}
