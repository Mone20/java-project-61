package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;


public class Engine {

    private static final String[] AVAILABLE_GAMES =
            new String[]{"Greet", "Even", "Calc", "GCD", "Progression", "Prime"};

    /**
     * Run the program.
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        printGameList();
        String gameNumber = scanner.nextLine();
        System.out.println("Your choice: " + gameNumber + "\n");
        String name;
        boolean result;
        String[] questions = new String[Constants.MAX_QUESTION_NUMBER];
        String[] answers = new String[Constants.MAX_QUESTION_NUMBER];
        String description;
        switch (Integer.parseInt(gameNumber)) {
            case Constants.EXIT_ORDER:
                System.exit(0);
                return;
            case Constants.GREET_ORDER:
                Cli.greetUser();
                return;
            case Constants.EVEN_ORDER:
                name = Cli.greetUser();
                Even.fillQuestionsAndAnswers(questions, answers);
                description = Even.getDescription();
                break;
            case Constants.CALC_ORDER:
                name = Cli.greetUser();
                Calculator.fillQuestionsAndAnswers(questions, answers);
                description = Calculator.getDescription();
                break;
            case Constants.GCD_ORDER:
                name = Cli.greetUser();
                GCD.fillQuestionsAndAnswers(questions, answers);
                description = GCD.getDescription();
                break;
            case Constants.PROGRESSION_ORDER:
                name = Cli.greetUser();
                Progression.fillQuestionsAndAnswers(questions, answers);
                description = Progression.getDescription();
                break;
            case Constants.PRIME_ORDER:
                name = Cli.greetUser();
                Prime.fillQuestionsAndAnswers(questions, answers);
                description = Prime.getDescription();
                break;
            default:
                System.out.printf("There is no game with number %s, please enter a correct number", gameNumber);
                return;
        }

        result = start(description, questions, answers);
        if (!result) {
            System.out.printf("Let's try again, %s!\n", name);
            return;
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    /**
     * Start the chosen game.
     *
     * @param description game description.
     * @param questions   array of generated questions.
     * @param answers     array of correct answers.
     * @return {@code true} if all the answers were correct, otherwise {@code false}
     */
    public static boolean start(String description, String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question: " + questions[i]);
            String actualAnswer = scanner.nextLine();
            String expectedAnswer = answers[i];
            System.out.println("Your answer: " + actualAnswer);
            boolean isCorrectAnswer = expectedAnswer.equals(actualAnswer);
            if (!isCorrectAnswer) {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n", actualAnswer, expectedAnswer);
                return false;
            }
            System.out.println("Correct!");
        }
        return true;
    }

    /**
     * Prints a message with the game list.
     */
    private static void printGameList() {
        for (int i = 0; i < AVAILABLE_GAMES.length; i++) {
            System.out.println(i + 1 + " - " + AVAILABLE_GAMES[i]);
        }
        System.out.println(0 + " - " + "Exit");
    }
}
