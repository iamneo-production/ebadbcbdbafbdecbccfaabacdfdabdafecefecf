package Assignment1;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1Test{

    public static void main(String[] args) {
        // Set the path to the geckodriver executable (Download from https://github.com/mozilla/geckodriver/releases)
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");

        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to "http://iamneo.ai"
        driver.get("http://iamneo.ai");

        // Navigate to "https://www.facebook.com"
        driver.navigate().to("https://www.facebook.com");

        // Navigate back to "http://iamneo.ai"
        driver.navigate().back();

        // Print the URL of the current page
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
