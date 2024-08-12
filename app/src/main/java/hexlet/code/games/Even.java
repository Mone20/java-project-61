package hexlet.code.games;

import hexlet.code.Constants;

public final class Even {

    public static String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void fillQuestionsAndAnswers(String[] questions, String[] answers) {
        for (int i = 0; i < answers.length; i++) {
            int question = generateQuestion();
            questions[i] = Integer.toString(question);
            answers[i] = generateAnswer(question);
        }
    }


    private static int generateQuestion() {
        return Constants.RANDOM.nextInt(Constants.NUMBER_BOUND);
    }

    private static String generateAnswer(int question) {
        return (question % 2 == 0) ? "yes" : "no";
    }

}
