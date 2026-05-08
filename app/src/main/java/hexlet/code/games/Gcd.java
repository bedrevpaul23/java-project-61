package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final Random RANDOM = new Random();

    private Gcd() {
    }

    public static void run(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;

            questions[i] = firstNumber + " " + secondNumber;
            correctAnswers[i] = String.valueOf(findGcd(firstNumber, secondNumber));
        }

        Engine.run(RULES, questions, correctAnswers, scanner);
    }

    private static int findGcd(int firstNumber, int secondNumber) {
        int a = firstNumber;
        int b = secondNumber;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
