package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private static final String VALID_NAME_PATTERN = "[A-Za-z]+";

    private Cli() {
    }

    public static void greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");

        String name = askName(scanner);

        System.out.println("Hello, " + name + "!");
    }

    public static String askName(Scanner scanner) {
        String name;

        do {
            System.out.print("May I have your name? ");
            name = scanner.next();

            if (!name.matches(VALID_NAME_PATTERN)) {
                System.out.println("Name must contain only English letters. Try again.");
            }
        } while (!name.matches(VALID_NAME_PATTERN));

        return name;
    }
}
