package homework1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidInput() {
        // Expected result after applying a 10% discount
        double purchaseAmount = 100.0;
        int discountAmount = 10;
        double expectedFinalAmount = 90.0;

        double finalAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(finalAmount).isEqualTo(expectedFinalAmount);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        double purchaseAmount = -100.0;
        int discountAmount = 10;

        Calculator.calculateDiscount(purchaseAmount, discountAmount);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithNegativeDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = -10;

        Calculator.calculateDiscount(purchaseAmount, discountAmount);
    }

    @Test
    public void testCalculateDiscountWithZeroDiscount() {
        // No discount, final amount should be the same as purchase amount
        double purchaseAmount = 100.0;
        int discountAmount = 0;
        double expectedFinalAmount = 100.0;

        double finalAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        assertThat(finalAmount).isEqualTo(expectedFinalAmount);
    }

}