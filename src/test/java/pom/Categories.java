package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Categories {
    public static WebElement women(WebDriver driver)
    {
        return driver.findElement(By.linkText("Shop Women"));
    }
    public static By scrollWomenWait(WebDriver driver)
    {
        return By.xpath("//h3[contains(text(),'Born Primitive')]");
    }
    public static By selectWomenWait(WebDriver driver)
    {
        return By.xpath("//button[contains(text(),'Add to cart')]");
    }
    public static WebElement selectWomen(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[contains(text(),'The Cadence Shorts')]"));
    }
    public static WebElement selectSize(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[contains(text(),'XS')]"));
    }
    public static WebElement selectCart(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
    }
    public static WebElement selectShoeSize(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[contains(text(),'30 REGULAR')]"));
    }
    public static By cartNumber(WebDriver driver)
    {
        return By.xpath("//span[@class='genie--c-cHhEfr' and contains(text(),'1')]");
    }
    public static WebElement men(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@href='/men/overview']"));
    }
    public static By scrollMenWait(WebDriver driver)
    {
        return By.xpath("//h3[contains(text(),'River Island')]");
    }
    public static By selectMenWait(WebDriver driver)
    {
        return By.xpath("//button[contains(text(),'Add to cart')]");
    }
    public static WebElement selectMen(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[contains(text(),'Slim Fit Check Jogger Trousers')]"));
    }

}
