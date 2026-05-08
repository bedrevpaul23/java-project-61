package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Scanner;

public final class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final String HIDDEN_ELEMENT = "..";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_START_NUMBER = 20;
    private static final int MAX_STEP = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    private Progression() {
    }

    public static void run(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = RANDOM.nextInt(MAX_START_NUMBER) + 1;
            int step = RANDOM.nextInt(MAX_STEP) + 1;
            int hiddenPosition = RANDOM.nextInt(PROGRESSION_LENGTH);
            int[] progression = generateProgression(start, step);

            questions[i] = buildQuestion(progression, hiddenPosition);
            correctAnswers[i] = String.valueOf(progression[hiddenPosition]);
        }

        Engine.run(RULES, questions, correctAnswers, scanner);
    }

    private static int[] generateProgression(int start, int step) {
        int[] progression = new int[PROGRESSION_LENGTH];

        for (int i = 0; i < progression.length; i++) {
            progression[i] = start + i * step;
        }

        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenPosition) {
        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progression.length; i++) {
            if (i > 0) {
                question.append(" ");
            }

            if (i == hiddenPosition) {
                question.append(HIDDEN_ELEMENT);
            } else {
                question.append(progression[i]);
            }
        }

        return question.toString();
    }
}
