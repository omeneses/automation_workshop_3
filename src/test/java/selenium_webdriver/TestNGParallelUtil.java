package selenium_webdriver;

import org.testng.ITestResult;

public class TestNGParallelUtil {
    /* Print out the running test related info. */
    public static void printTestInfo(ITestResult result, long threadId, String prefix)
    {
        String testName = result.getTestContext().getName();
        String testClasName = result.getTestClass().getName();
        String testMethod = result.getMethod().getMethodName();

        System.out.println(prefix + " test method : " + testMethod + " , thread id : " + threadId + " , testName : " + testName + " , testClasName : " + testClasName);
    }
}
