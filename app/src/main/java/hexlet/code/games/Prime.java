package hexlet.code.games;

import hexlet.code.Constants;

public final class Prime {

    public static String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void fillQuestionsAndAnswers(String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++) {
            int question = generateQuestion();
            questions[i] = Integer.toString(question);
            answers[i] = generateAnswer(question);
        }
    }

    private static int generateQuestion() {
        return Constants.RANDOM.nextInt(Constants.NUMBER_BOUND);
    }

    private static String generateAnswer(int question) {
        return isPrime(question) ? "yes" : "no";
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
