package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final SecureRandom RANDOM = new SecureRandom();

    private Even() {
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][Engine.ROUND_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;

            rounds[i][Engine.QUESTION_INDEX] = String.valueOf(number);
            rounds[i][Engine.ANSWER_INDEX] = isEven(number) ? "yes" : "no";
        }

        Engine.run(RULES, rounds);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
