package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case GREET_GAME -> Cli.greetUser(scanner);
            case EVEN_GAME -> Even.run(scanner);
            case CALC_GAME -> Calc.run(scanner);
            case GCD_GAME -> Gcd.run(scanner);
            case PROGRESSION_GAME -> Progression.run(scanner);
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown game");
        }
    }
}
