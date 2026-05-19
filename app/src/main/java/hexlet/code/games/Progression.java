package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final String HIDDEN_ELEMENT = "..";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_START_NUMBER = 20;
    private static final int MAX_STEP = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    private Progression() {
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][Engine.ROUND_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = RANDOM.nextInt(MAX_START_NUMBER) + 1;
            int step = RANDOM.nextInt(MAX_STEP) + 1;
            int hiddenIndex = RANDOM.nextInt(PROGRESSION_LENGTH);
            String[] progression = makeProgression(start, step, PROGRESSION_LENGTH);

            rounds[i][Engine.ANSWER_INDEX] = progression[hiddenIndex];
            progression[hiddenIndex] = HIDDEN_ELEMENT;
            rounds[i][Engine.QUESTION_INDEX] = String.join(" ", progression);
        }

        Engine.run(RULES, rounds);
    }

    private static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < progression.length; i++) {
            int currentElement = start + i * step;
            progression[i] = String.valueOf(currentElement);
        }

        return progression;
    }
}
