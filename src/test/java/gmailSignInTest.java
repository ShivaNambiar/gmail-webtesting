import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adirosshi on 4/29/2016.
 */
public class gmailSignInTest {
    WebDriver driver;


    @Test(groups={"fast"})
    public void signIn()
    {
        String browserName = System.getenv("browser");

        if(browserName !=null && browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\shiva\\Testing\\Testing\\Selenium\\ChromeDriver/chromeDriver.exe");
            driver= new ChromeDriver();
        }
        else
        driver = new FirefoxDriver();
  //      WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText("Inbox")));
        driver.get("http://www.gmail.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Gmail","checking title of homepage");
        System.out.println("fast1");
    }
    @Test(groups = {"fast"})
    public void fastTest()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://wwww.yahoomail.com");
        System.out.println("fast2");
    }


    @Test(groups = {"slow"})
    public void slowTest()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.bloomberg.com");
        System.out.println("sloooooooow");
    }
}
