package selenium_webdriver;
import org.testng.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelExecutionClass1 {
    @Test
    public void setup1() throws InterruptedException {
        Thread.sleep(2000);
        //Assert.assertEquals("a","b");
        System.out.println("Printing from test case 1");
    }

    @Test
    public void setup2()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 2");
    }

    @Test
    public void setup4()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 4");
    }
    @Test
    public void setup5()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 5");
    }

    @Test
    public void setup6()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 6");
    }

    @Test
    public void setup7()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 7");
    }

    @Test
    public void setup8()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Printing from test case 8");
    }





    /* Print out current executor thread info after each Test method run.*/
    @AfterMethod
    public void afterMethod(ITestResult result) {
        long threadId = Thread.currentThread().getId();
        TestNGParallelUtil.printTestInfo(result, threadId, "After run");
    }


}
