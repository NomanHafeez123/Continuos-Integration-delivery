package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplyWaits {
    public static void explicitWait(WebDriver driver, By locatorObject) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObject));
    }
    public static void implicitWait(WebDriver driver, int secs){
        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }
}
