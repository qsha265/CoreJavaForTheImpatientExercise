package chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    private ByteArrayOutputStream out;

    private final String want = "Enter an Integer: Input integer in binary: 1001011100011\n" +
            "Input integer in octal: 11343\n" +
            "Input integer in hexadecimal: 12e3\n" +
            "Hexadecimal floating-pint number: 0x1.0f170834f27fap-9\n";

    @BeforeEach
    void setupInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("4835".getBytes());
        this.out = new ByteArrayOutputStream(this.want.length() * 2);
        System.setIn(in);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void exercise1Test() {
        Exercise1.main(null);
        assertEquals(this.want, this.out.toString());
    }
}