package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;

    private Engine() {
    }

    public static void run(String rules,
                           String[] questions,
                           String[] correctAnswers,
                           Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.askName(scanner);

        System.out.println("Hello, " + name + "!");
        System.out.println(rules);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (!userAnswer.equals(correctAnswers[i])) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }

}
