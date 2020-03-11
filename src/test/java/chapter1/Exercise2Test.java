package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {
    private ByteArrayOutputStream out;

    private final String want = "Enter an integer angle (can be both positive or negative): " +
            "The result with % will be 120\n" +
            "The result with floorMod will be 120\n";

    @BeforeEach
    void setUp() {
        ByteArrayInputStream in = new ByteArrayInputStream("120".getBytes());
        this.out = new ByteArrayOutputStream(this.want.length() * 2);
        System.setIn(in);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void exercise2Test() {
        Exercise2.main(null);
        assertEquals(this.want, this.out.toString());
    }
}