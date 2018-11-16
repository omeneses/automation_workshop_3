package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinallyTest {
    public static void main(String[] args) throws InterruptedException {
        //Drag And Drop
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        //System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");

        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));
        /*new Actions(driver).dragAndDrop(element ,target ).build().perform();
        Thread.sleep(4000);*/


        Actions builder = new Actions(driver);
        builder.clickAndHold(element).moveToElement(target).release().build().perform();
        Thread.sleep(4000);
    }
}
