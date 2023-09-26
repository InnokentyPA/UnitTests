package homework3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EvenOddCheckerTest {
    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(EvenOddChecker.isEven(2));
        assertTrue(EvenOddChecker.isEven(4));
        assertTrue(EvenOddChecker.isEven(0));
        assertTrue(EvenOddChecker.isEven(-2));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(EvenOddChecker.isEven(1));
        assertFalse(EvenOddChecker.isEven(3));
        assertFalse(EvenOddChecker.isEven(-1));
    }
}