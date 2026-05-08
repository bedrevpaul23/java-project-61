package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public final class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final Random RANDOM = new Random();

    private Calc() {
    }

    public static void run(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            int secondNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
            String operation = OPERATIONS[RANDOM.nextInt(OPERATIONS.length)];

            questions[i] = firstNumber + " " + operation + " " + secondNumber;
            correctAnswers[i] = String.valueOf(
                    calculate(firstNumber, secondNumber, operation)
            );
        }

        Engine.run(RULES, questions, correctAnswers, scanner);
    }

    private static int calculate(int firstNumber, int secondNumber, String operation) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
