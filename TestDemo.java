import org.junit.*;
import static org.junit.Assert.*;
//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar CLASSNAME.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CLASSNAME

public class TestDemo
{

    @Test
    public void TestTwoSum()
    {
        int[] input = {2, 7, 11, 15};
        int target = 9;

        int expected[] = {2,7};

        int output[] = Demo.twoSum(input, target);
        assertArrayEquals(expected, output);

    }
}