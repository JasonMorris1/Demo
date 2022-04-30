import org.junit.*;
import static org.junit.Assert.*;


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