package hexlet.code;

import java.util.Scanner;

public class App {
    private static final int GREET_GAME = 1;
    private static final int EVEN_GAME = 2;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case GREET_GAME -> Cli.greetUser();
            case EVEN_GAME -> Even.run();
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown game");
        }
    }
}
