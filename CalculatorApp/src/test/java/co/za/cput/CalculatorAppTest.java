package co.za.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class CalculatorAppTest {
    @Test
    public void testNonNullness() throws Exception {
        CalculatorApp calculator = new CalculatorApp();
        Assert.assertNotNull(calculator);
    }
}
