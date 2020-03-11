package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {
    private ByteArrayOutputStream out;

    private final String want = "Enter three integers: \n" +
            "The largest integer is 67 by using only the conditional operator\n" +
            "The largest integer is 67 by using Math.max\n";

    @BeforeEach
    void setUp() {
        ByteArrayInputStream in = new ByteArrayInputStream("23 45 67".getBytes());
        this.out = new ByteArrayOutputStream(this.want.length() * 2);
        System.setIn(in);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void exercise3Test() {
        Exercise3.main(null);
        assertEquals(this.want, this.out.toString());
    }
}