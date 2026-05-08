package hexlet.code;

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
    void unknownGameRunsWithoutErrors() {
        String input = "9\n";
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
}
