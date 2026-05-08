package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private Even() {
    }

    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final Random RANDOM = new Random();

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int question = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            String correctAnswer = isEven(question) ? "yes" : "no";

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
