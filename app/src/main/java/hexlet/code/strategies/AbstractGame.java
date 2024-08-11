package hexlet.code.strategies;

import hexlet.code.model.Question;

import java.util.Random;
import java.util.Scanner;

/**
 * An abstract base class that provides a template for different types of games.
 * Implements the {@link Game} interface and includes methods for generating and validating questions.
 */
public abstract class AbstractGame implements Game {
    /**
     * Game order in the start list.
     */
    protected final int order;

    /**
     * Maximum number of questions in the game.
     */
    private final int maxQuestionNumber = 3;

    /**
     * The upper bound for the random number generation.
     */
    private final int numberBound = 100;

    /**
     * Random number generator used for question creation.
     */
    private final Random random = new Random();

    protected AbstractGame(int order) {
        this.order = order;
    }

    /**
     * Returns the instance of the random number generator.
     *
     * @return the {@link Random} instance used by this game.
     */
    protected Random getRandom() {
        return random;
    }

    /**
     * The upper bound for the random number generation.
     *
     * @return the upper bound for the random number generation.
     */
    protected int getNumberBound() {
        return numberBound;
    }

    /**
     * Starts the game, prompts the user for answers, and evaluates them.
     *
     * @return {@code true} if the player answers all questions correctly, {@code false} otherwise.
     */
    @Override
    public boolean start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getDescription());
        for (Question question : getQuestions()) {
            System.out.println("Question: " + question.getQuestionText());
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

    /**
     * Prints a message indicating that the user's answer was incorrect.
     *
     * @param actualAnswer   the answer provided by the user.
     * @param expectedAnswer the correct answer.
     */
    private void printIncorrectMessage(String actualAnswer, String expectedAnswer) {
        System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n",
                actualAnswer,
                expectedAnswer);
    }

    /**
     * Generates a list of questions for the game.
     *
     * @return an array of {@link Question} objects.
     */
    @Override
    public Question[] getQuestions() {
        Question[] questions = new Question[maxQuestionNumber];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestion();
        }
        return questions;
    }

    /**
     * Generates a single question for the game.
     * This method must be implemented by any subclass.
     *
     * @return a {@link Question} object.
     */
    protected abstract Question generateQuestion();

    /**
     * Indicates whether the game object is a stub (placeholder).
     *
     * @return {@code false}, indicating that this is not a stub.
     */
    @Override
    public boolean isStub() {
        return false;
    }

    @Override
    public int getOrder() {
        return order;
    }

}
