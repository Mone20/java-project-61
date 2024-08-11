package hexlet.code.strategies;

import hexlet.code.model.Question;

import java.util.Random;
import java.util.Scanner;

public abstract class AbstractGame implements Game {

    private final int maxQuestionNumber = 3;
    protected final Random random = new Random();
    @Override
    public boolean start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDescription());
        for (Question question : getQuestions()) {
            System.out.println("Question: " + question.getQuestion());
            String answer = scanner.nextLine();
            try {
                System.out.println("Your answer: " + answer);
                boolean isCorrectAnswer = question.getAnswer().equals(answer);
                if (!isCorrectAnswer) {
                    printIncorrectMessage(answer, question.getAnswer());
                    return false;
                }
                System.out.println("Correct!");
            } catch (RuntimeException e) {
                printIncorrectMessage(answer, question.getAnswer());
                return false;
            }
        }
        return true;
    }

    private void printIncorrectMessage(String actualAnswer, String expectedAnswer) {
        System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n",
                actualAnswer,
                expectedAnswer);
    }

    @Override
    public Question[] getQuestions() {
        Question[] questions = new Question[maxQuestionNumber];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestion();
        }
        return questions;
    }

    protected abstract Question generateQuestion();

    @Override
    public boolean isStub() {
        return false;
    }

}
