package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.io.IOException;

public class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;
    private static final int END_OF_STREAM = -1;

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String rawUserChoice = readUserChoice();

        int userChoice;

        try {
            userChoice = Integer.parseInt(rawUserChoice);
        } catch (NumberFormatException exception) {
            System.out.println("Unknown user choice: " + rawUserChoice);
            return;
        }

        switch (userChoice) {
            case GREET_GAME -> Cli.greet();
            case EVEN_GAME -> Even.run();
            case CALC_GAME -> Calc.run();
            case GCD_GAME -> Gcd.run();
            case PROGRESSION_GAME -> Progression.run();
            case PRIME_GAME -> Prime.run();
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown user choice: " + userChoice);
        }
    }

    private static String readUserChoice() throws IOException {
        StringBuilder userChoice = new StringBuilder();
        int currentChar;

        while ((currentChar = System.in.read()) != END_OF_STREAM && currentChar != '\n' && currentChar != '\r') {
            userChoice.append((char) currentChar);
        }

        return userChoice.toString();
    }
}
