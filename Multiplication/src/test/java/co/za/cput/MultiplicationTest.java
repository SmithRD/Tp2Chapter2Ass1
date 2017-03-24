package co.za.cput;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 */
public class MultiplicationTest {
    @Test
    public void testMultiplyIntegers() throws Exception {
        int result = Multiplication.multiplyIntegers(10, 6);
        Assert.assertEquals(60, result);
    }
}
