package hexlet.code;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {
    @Test
    void appRunsWithoutErrors() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void greetGameRunsWithoutErrors() {
        String input = "1\nPavel\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void evenGameRunsWithoutErrors() {
        String input = "2\nPavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void calcGameRunsWithoutErrors() {
        String input = "3\nPavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void gcdGameRunsWithoutErrors() {
        String input = "4\nPavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void progressionGameRunsWithoutErrors() {
        String input = "5\nPavel\nmaybe\n";
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
    void engineRunsSuccessfulGameWithoutErrors() {
        String input = "Pavel\n1\n2\n3\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        String[] questions = {"one", "two", "three"};
        String[] correctAnswers = {"1", "2", "3"};

        assertDoesNotThrow(() -> Engine.run("Test rules", questions, correctAnswers, scanner));
    }

    @Test
    void primeGameRunsWithoutErrors() {
        String input = "6\nPavel\nmaybe\n";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

}
