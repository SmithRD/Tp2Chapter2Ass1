package co.za.cput;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class DevisionTest {
    @Test
    public void testDivideIntegers() throws Exception {
        int result = Devision.divideIntegers(10, 2);
        Assert.assertEquals(5, result);
    }
}
