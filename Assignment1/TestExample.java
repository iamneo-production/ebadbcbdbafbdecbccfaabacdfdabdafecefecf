import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox browser
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testNavigation() {
        // Navigate to iamneo.ai
        driver.get("http://iamneo.ai");

        // Navigate to Facebook
        driver.navigate().to("https://www.facebook.com");

        // Navigate back to iamneo.ai
        driver.navigate().back();

        // Print the URL of the current page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}


