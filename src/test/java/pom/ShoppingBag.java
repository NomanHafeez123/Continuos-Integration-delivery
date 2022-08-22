package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingBag {
    public static WebElement cartElements(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[@class='genie--c-cHhEfr']"));
    }
    public static WebElement shoppingBag(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@class='sc-gsDKAQ jYKPUt sc-hmjpVf kfcidY' and contains(text(),'GO TO SHOPPING BAG')]"));
    }
    public static By shoppingBagWait(WebDriver driver)
    {
        return By.xpath("//button[@class='sc-gsDKAQ jYKPUt sc-hmjpVf kfcidY' and contains(text(),'GO TO SHOPPING BAG')]");
    }
}
