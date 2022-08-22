package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyAssertions {
    public static WebElement noOfItems(WebDriver driver)
    {
        return driver.findElement(By.xpath("//h3[contains(text(),'items')]"));
    }
    public static WebElement totalPrice(WebDriver driver)
    {
        return driver.findElement(By.xpath("//p[@class='sc-hBUSln hEMRju' and contains(text(),'KWD')]"));

    }
}
