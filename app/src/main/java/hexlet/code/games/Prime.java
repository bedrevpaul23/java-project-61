package hexlet.code.games;

import  hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Scanner;

public final class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final SecureRandom RANDOM = new SecureRandom();

    private Prime() {
    }

    public static void run(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;

            questions[i] = String.valueOf(number);
            correctAnswers[i] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(RULES, questions, correctAnswers, scanner);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
