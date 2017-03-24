package co.za.cput;
import org.junit.Assert;
import org.junit.Test;

import javax.security.auth.Subject;

/**
 *
 */
public class SubtractionTest {
    @Test
    public void testSubtractIntegers() throws Exception {
        int result = Subtraction.subtractIntegers(10, 6);
        Assert.assertEquals(4, result);
    }

}
