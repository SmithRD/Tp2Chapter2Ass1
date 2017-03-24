package co.za.cput;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class AdditionTest {
    @Test
    public void testAddIntegers() throws Exception {
        int result = Addition.addIntegers(10, 2);
        Assert.assertEquals(12, result);
    }
}
