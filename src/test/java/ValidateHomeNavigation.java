import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateHomeNavigation extends BaseClass{


    @Parameters("Base_URL")
    @Test (priority = 1)
    private void home(String Base_URL)
    {

        driver.navigate().to(Base_URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("return window.stop");

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,Base_URL);

    }
    @Test (priority = 2)
    private void close(){ driver.quit(); }
}
