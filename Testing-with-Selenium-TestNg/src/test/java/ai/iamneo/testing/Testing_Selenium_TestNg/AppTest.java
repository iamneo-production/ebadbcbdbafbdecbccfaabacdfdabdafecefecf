package ai.iamneo.testing.Testing_Selenium_TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AppTest{
    
WebDriver driver;

@BeforeTest
public void setup() {
driver = new FirefoxDriver();
driver.manage().window().maximize();
}

@Test
public void testNavigation() {
driver.navigate().to("http://iamneo.ai");
driver.navigate().to("https://www.facebook.com");
driver.navigate().back();
System.out.println("Current URL: " + driver.getCurrentUrl());
driver.navigate().forward();
driver.navigate().refresh();
}

@AfterTest
public void teardown() {
driver.quit();
}
}