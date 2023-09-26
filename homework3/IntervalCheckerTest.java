package homework3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntervalCheckerTest {
    @Test
    public void testIsWithinIntervalWithNumberInsideInterval() {
        assertTrue(IntervalChecker.isWithinInterval(26));
        assertTrue(IntervalChecker.isWithinInterval(50));
        assertTrue(IntervalChecker.isWithinInterval(99));
    }

    @Test
    public void testIsWithinIntervalWithNumberOutsideInterval() {
        assertFalse(IntervalChecker.isWithinInterval(24));
        assertFalse(IntervalChecker.isWithinInterval(101));
        assertFalse(IntervalChecker.isWithinInterval(-1));
    }

    @Test
    public void testIsWithinIntervalWithEdgeCases() {
        assertFalse(IntervalChecker.isWithinInterval(25));
        assertFalse(IntervalChecker.isWithinInterval(100));
    }
}