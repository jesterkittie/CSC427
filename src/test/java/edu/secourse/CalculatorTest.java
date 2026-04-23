package edu.secourse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }


    @Test
    void multiply() {
        assertAll(
                () -> assertEquals(1, Calculator.multiply(1.0, 1.0)),
                () -> assertEquals(0, Calculator.multiply(2.0, 0.0)),
                () -> assertEquals(-6, Calculator.multiply(2.0, -3.0)),
                () -> assertEquals(-0, Calculator.multiply(-3.0, 0.0))
        );
    }

    @Test
    void sqrt() {
        assertAll(
                () -> assertEquals(1, Calculator.sqrt(1)),
                () -> assertEquals(8, Calculator.sqrt(64)),
                () -> assertEquals(12.50, Calculator.sqrt(156.25))
        );
    }

    @Test
    void addInt() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(5, Calculator.add(2, 3)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    void multiplyInt() {
        assertAll(
                () -> assertEquals(1, Calculator.multiply(1, 1)),
                () -> assertEquals(0, Calculator.multiply(2, 0)),
                () -> assertEquals(-6, Calculator.multiply(2, -3)),
                () -> assertEquals(0, Calculator.multiply(-3, 0))
        );
    }

    @Test
    void divide() {
        assertAll(
                () -> assertEquals(2.0, Calculator.divide(4, 2)),
                () -> assertEquals(-2.0, Calculator.divide(4, -2)),
                () -> assertEquals(0.5, Calculator.divide(1, 2))
        );
    }
}
