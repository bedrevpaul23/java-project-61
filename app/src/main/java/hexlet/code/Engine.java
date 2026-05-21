package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;
    public static final int ROUND_DATA_SIZE = 2;

    private Engine() {
    }

    public static void run(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] round : rounds) {
            String question = round[QUESTION_INDEX];
            String correctAnswer = round[ANSWER_INDEX];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
