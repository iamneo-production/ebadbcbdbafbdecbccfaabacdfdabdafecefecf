import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment1Test {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox browser
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testNavigateToIamNeo() {
        // Navigate to iamneo.ai
        driver.get("http://iamneo.ai");
    }

    @Test(priority = 2)
    public void testNavigateToFacebook() {
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 3)
    public void testNavigateBackToIamNeo() {
        // Navigate back to iamneo.ai
        driver.navigate().back();
    }

    @Test(priority = 4)
    public void testPrintCurrentUrl() {
        // Print the URL of the current page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }

    @Test(priority = 5)
    public void testNavigateForward() {
        // Navigate forward
        driver.navigate().forward();
    }

    @Test(priority = 6)
    public void testReloadPage() {
        // Reload the page
        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
