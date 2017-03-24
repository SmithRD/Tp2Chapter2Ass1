package co.za.cput;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

/**
 *
 */
public class TestFixturesExampleClassTest {
    @Test                                 //1.1
    public void testFloatingPoint() throws Exception {
        float result = TestFixturesExampleClass.addFloats(10.3f,6.4f);
        Assert.assertEquals(16.7,result,0.01);
    }

    @Test                                  //1.2
    public void testInteger() throws Exception {
        int result = TestFixturesExampleClass.addIntegers(20, 30);
        Assert.assertEquals("incorrect",50,result);
    }

    @Test                                  //1.3
    public void testObjectEquality() throws Exception {
       App result = new App(6);
       App expected = result;
       Assert.assertEquals(expected,result);
    }

    @Test                                  //1.4
    public void testObjectIdentity() throws Exception {
        App object1 = new App(5);
        App object2 = new App(5);
        Assert.assertSame(object1,object1);
    }

    @Test                                  //1.5
    public void testTruth() throws Exception {
        Assert.assertTrue(TestFixturesExampleClass.guessName("john"));
    }

    @Test //1.6
    public void testFalse() throws Exception {
        Assert.assertFalse(TestFixturesExampleClass.guessName("peter"));
    }

    @Test                                  //1.7
    public void testNullness() throws Exception {
        App result = null;
        Assert.assertNull(result);
    }

    @Test                                  //1.8
    public void testNonNullness() throws Exception {
        App result = new App(5);
        Assert.assertNotNull(result);
    }

    @Test                                 //1.9
    public void testFailing() {
        try {
            int result = TestFixturesExampleClass.divideIntegers(10, 0);
            fail("Exception not thrown");
            Assert.assertEquals(10, result);

        } catch (Exception e) {
            System.out.println("Exception: Cannot divide by Zero");
        }

    }

    @Test(expected = Exception.class)    //1.10
    public void testExceptions() throws Exception{
            int result = TestFixturesExampleClass.divideIntegers(10, 0);
            Assert.assertEquals(10, result);
    }

    @Test(timeout = 100)                    //1.11
    public void testTimeouts() throws Exception{
        float result = TestFixturesExampleClass.addFloats(10.3f,6.4f);
        Assert.assertEquals(16.7,result,0.01);
    }

    @Ignore                                //1.12
    public void testDisabling() throws Exception{
        int result = TestFixturesExampleClass.addIntegers(20, 30);
        Assert.assertEquals("incorrect",50,result);
    }

    @Test                                  //1.13
    public void testArraysContent() throws Exception{
        String result[] = TestFixturesExampleClass.showStringArray();
        String expected[] = {"first", "second", "third"};
        Assert.assertArrayEquals(expected,result);
    }




    }