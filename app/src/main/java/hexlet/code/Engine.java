package hexlet.code;

import java.util.Scanner;


public class Engine {

    /**
     * Run generated questions nd verify each answer.
     *
     * @param description game description.
     * @param gameData    array with question and answers.
     * @param name        name of the player.
     */
    public static void start(String description, String[][] gameData, String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        for (String[] gameItem : gameData) {
            System.out.println("Question: " + gameItem[0]);
            String actualAnswer = scanner.nextLine();
            String expectedAnswer = gameItem[1];
            System.out.println("Your answer: " + actualAnswer);
            boolean isCorrectAnswer = expectedAnswer.equals(actualAnswer);
            if (!isCorrectAnswer) {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n", actualAnswer, expectedAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

}
