package selenium_webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver;
        /*System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();*/


        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");

        driver = new FirefoxDriver();

        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);


        // Use this to visit any page
        //driver.get("file:///Users/admin/Documents/Omar/WebDevelopment/add-content.html");
        //driver.get("file:///Users/omeneses/Documents/automation/automation_workshop_3/WebDevelopment/add-content.html");
        //driver.get("file:///Users/admin/Documents/Omar/automation/automation_workshop_3/WebDevelopment/add-content.html");

        // Alternatively the same thing can be done like this
        // driver.navigate().to("file:///Users/admin/Documents/Omar/WebDevelopment/add-content.html");
        //driver.navigate().forward();
        //driver.navigate().back();

        /*// Type something on an input element by its id
        Thread.sleep(3000);
        WebElement myInput = driver.findElement(By.id("type"));
        myInput.sendKeys("Hello People");


        // Find the text of an element by its id
        WebElement myTextElement = driver.findElement(By.id("translate"));
        System.out.println("The button text is: " +myTextElement.getText());


        // Select an option of a Selector element by its id
        Select select = new Select(driver.findElement(By.tagName("select")));
        Thread.sleep(2000);
        select.selectByVisibleText("London");
        Thread.sleep(2000);
        select.selectByVisibleText("Paris");
        Thread.sleep(2000);
        select.selectByVisibleText("New York");
        Thread.sleep(2000);


        //Verify Dropdown does not support multiple selection
        assertFalse(select.isMultiple());
        //Verify Dropdown has 3 options for selection
        assertEquals(3, select.getOptions().size());


        // Click on any element by its id
        driver.findElement(By.id("translate")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(2000);


        // Moving between windows
        String parent = driver.getWindowHandle();
        System.out.println("The parent title is: " +driver.getTitle());
        driver.findElement(By.name("google")).click();
        Thread.sleep(2000);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("The number of windows is: " +allWindows.size());
        for(String child:allWindows){
            if (!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
                driver.findElement(By.name("q")).sendKeys("Huge Inc");
                System.out.println("The child page title is: " +driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        System.out.println("The current page title is: " +driver.getTitle());

        // Popup Dialogs
        Thread.sleep(2000);
        driver.findElement(By.id("alerta")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("The alert text button is: "+alert.getText());
        alert.dismiss();
        //alert.accept();
        Thread.sleep(2000);
        System.out.println("The page title is: " +driver.getTitle());*/


        //Right-click

        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        //To maximize the browser
        driver.manage().window().maximize();
        //Create an object 'action' of an Actions class
        Actions action = new Actions(driver);
        By locator = By.cssSelector(".context-menu-one");
        //Wait for the element. Used Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement rightClickElement=driver.findElement(locator);
        //contextClick() method to do right click on the element
        action.contextClick(rightClickElement).build().perform();
        Thread.sleep(4000);
        action.contextClick(rightClickElement)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        Alert alert = driver.switchTo().alert();
        assertThat(alert.getText(), is(equalTo("clicked: delete")));
        Thread.sleep(4000);

         //Close the browser
        driver.quit();
    }
}
