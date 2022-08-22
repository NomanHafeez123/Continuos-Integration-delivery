import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.DriversFactory;
import waits.ApplyWaits;

public class ValidateCart extends BaseClass{

    @Parameters("Base_URL")
    @Test (priority=1)
    private void womenCategories(String Base_URL)
    {
        pom.Categories.women(driver).click();
        driver.manage().window().maximize();

        waits.ApplyWaits.explicitWait(driver,pom.Categories.scrollWomenWait(driver));

        WebElement element = pom.Categories.selectWomen(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        waits.ApplyWaits.explicitWait(driver,pom.Categories.selectWomenWait(driver));

        pom.Categories.selectSize(driver).click();
        pom.Categories.selectCart(driver).click();

        waits.ApplyWaits.explicitWait(driver,pom.Categories.cartNumber(driver));
    }
    @Parameters({"wait","Base_URL"})
    @Test (priority=2)
    private void menCategories(int wait, String Base_URL)
    {
        driver.navigate().to(Base_URL);
        pom.Categories.men(driver).click();

        waits.ApplyWaits.explicitWait(driver,pom.Categories.scrollMenWait(driver));

        WebElement element = pom.Categories.selectMen(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        waits.ApplyWaits.explicitWait(driver,pom.Categories.selectMenWait(driver));

        pom.Categories.selectShoeSize(driver).click();
        pom.Categories.selectCart(driver).click();

        waits.ApplyWaits.implicitWait(driver,wait);
    }
}
