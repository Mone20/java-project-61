package hexlet.code;

import java.util.Scanner;


public class Engine {

    /**
     * Run generated questions nd verify each answer.
     *
     * @param description game description.
     * @param gameData    array with question and answers.
     */
    public static void start(String description, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        String name = greetUser(scanner);
        for (String[] gameItem : gameData) {
            System.out.println("Question: " + gameItem[0]);
            String actualAnswer = scanner.nextLine();
            String expectedAnswer = gameItem[1];
            System.out.println("Your answer: " + actualAnswer);
            boolean isCorrectAnswer = expectedAnswer.equals(actualAnswer);
            if (!isCorrectAnswer) {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n", actualAnswer, expectedAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        System.out.printf("Congratulations, %s!\n", name);
    }


    public static String greetUser(Scanner scanner) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        return name;
    }

}
