package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final Random RANDOM = new Random();

    private Even() {
    }

    public static void run(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < questions.length; i++) {
            int question = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;

            questions[i] = String.valueOf(question);
            correctAnswers[i] = isEven(question) ? "yes" : "no";
        }

        Engine.run(RULES, questions, correctAnswers, scanner);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
