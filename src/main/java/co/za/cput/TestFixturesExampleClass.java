package co.za.cput;

/**
 * Created by CRS on 2017-03-18.
 * This is a simple class example to be used to provide simple methods for unit testing
 * through junit4 and the Maven build tool.
 */
public class TestFixturesExampleClass {
    public static int addIntegers( int a, int b){return a + b;}

    public static float addFloats(float a, float b){return a + b;}

    public static  int divideIntegers(int c, int d){return (c/d);}

    public static String[] showStringArray()
    {String[] words = {"first", "second", "third"};
     return words;}

    public static Boolean guessName(String guess){return (guess == "john");}

}
