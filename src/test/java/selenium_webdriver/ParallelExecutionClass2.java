package selenium_webdriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelExecutionClass2 {
    @Test
    public void setup3()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 3 - copy");
    }

    /* Print out current executor thread info after each Test method run.*/
    @AfterMethod
    public void afterMethod(ITestResult result) {
        long threadId = Thread.currentThread().getId();
        TestNGParallelUtil.printTestInfo(result, threadId, "After run");
    }


}
