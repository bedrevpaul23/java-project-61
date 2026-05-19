package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final SecureRandom RANDOM = new SecureRandom();

    private Calc() {
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][Engine.ROUND_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            char operator = OPERATORS[RANDOM.nextInt(OPERATORS.length)];

            rounds[i][Engine.QUESTION_INDEX] = firstNumber + " " + operator + " " + secondNumber;
            rounds[i][Engine.ANSWER_INDEX] = String.valueOf(calculate(firstNumber, secondNumber, operator));
        }

        Engine.run(RULES, rounds);
    }

    private static int calculate(int firstNumber, int secondNumber, char operator) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}
