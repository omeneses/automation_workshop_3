package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        // Use this to visit any page
        driver.get("file:///Users/admin/Documents/Omar/WebDevelopment/add-content.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("file:///Users/admin/Documents/Omar/WebDevelopment/add-content.html");



        // Find the text of an element by its id
        WebElement element2 = driver.findElement(By.id("translate"));
        System.out.println("The button text is: " +element2.getText());


        // Select an option of a Selector element by its id
        Select select = new Select(driver.findElement(By.tagName("select")));
        Thread.sleep(3000);
        select.selectByVisibleText("London");
        Thread.sleep(3000);
        select.selectByVisibleText("Paris");
        Thread.sleep(3000);


        // Click on any element by its id
        driver.findElement(By.id("translate")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("translate")).click();
        Thread.sleep(3000);


       /* // Find the text of an element by its class
        WebElement element2 = driver.findElement(By.className("gb_P"));
        System.out.println("text typed is: " +element2.getText());



        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");



        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();


        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });




        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());*/

        //Close the browser
        driver.quit();
    }
}
