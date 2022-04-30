import java.util.HashMap;

windows
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar CLASSNAME.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CLASSNAME

public class Demo {

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]

    public static int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        // bruce force method

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = nums[i];
                    output[1] = nums[j];
                    return output;
                }
            }
        }
        return output;
    }
}