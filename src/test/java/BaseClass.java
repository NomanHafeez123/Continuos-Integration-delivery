import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.DriversFactory;

public class BaseClass {
    static WebDriver driver;
    @Parameters({"browser","Base_URL"})
    @BeforeTest
    public static void navigation(String browser, String Base_URL) {
        /* Opening browser and navigating to URL */
        driver = DriversFactory.open(browser);
        driver.get(Base_URL);
    }
}
