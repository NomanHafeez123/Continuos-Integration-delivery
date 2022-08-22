package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RemoveCart {
    public static List<WebElement> deleteElements(WebDriver driver) {
        return driver.findElements(By.xpath("//*[local-name()='svg' and @name='Delete']"));
    }
    public static By deleteWait(WebDriver driver)
    {
        return By.xpath("//h3[contains(text(),'0 items')]");
    }
}
