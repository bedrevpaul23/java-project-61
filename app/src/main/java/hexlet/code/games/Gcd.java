package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final SecureRandom RANDOM = new SecureRandom();

    private Gcd() {
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][Engine.ROUND_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;

            rounds[i][Engine.QUESTION_INDEX] = firstNumber + " " + secondNumber;
            rounds[i][Engine.ANSWER_INDEX] = String.valueOf(findGcd(firstNumber, secondNumber));
        }

        Engine.run(RULES, rounds);
    }

    private static int findGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return Math.abs(firstNumber);
    }
}
