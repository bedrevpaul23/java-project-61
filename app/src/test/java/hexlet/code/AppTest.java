package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {
    @Test
    void appRunsWithoutErrors() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void unknownGameRunsWithoutErrors() {
        String input = "9\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void unknownTextChoiceRunsWithoutErrors() {
        String input = "Pavel\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void greetGameRunsWithoutErrors() {
        String input = "Pavel\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Cli::greet);
    }

    @Test
    void evenGameRunsWithoutErrors() {
        String input = "Pavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Even::run);
    }

    @Test
    void calcGameRunsWithoutErrors() {
        String input = "Pavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Calc::run);
    }

    @Test
    void gcdGameRunsWithoutErrors() {
        String input = "Pavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Gcd::run);
    }

    @Test
    void progressionGameRunsWithoutErrors() {
        String input = "Pavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Progression::run);
    }

    @Test
    void primeGameRunsWithoutErrors() {
        String input = "Pavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(Prime::run);
    }

    @Test
    void engineRunsSuccessfulGameWithoutErrors() {
        String input = "Pavel\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        String[][] rounds = {
                {"one", "1"},
                {"two", "2"},
                {"three", "3"}
        };

        assertDoesNotThrow(() -> Engine.run("Test rules", rounds));
    }
}
