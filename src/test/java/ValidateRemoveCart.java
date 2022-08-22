import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateRemoveCart extends BaseClass{
    @Parameters({"priceZero","wait"})
    @Test
    private void removeCart(String priceZero, int wait) {

        try {
            pom.RemoveCart.deleteElements(driver).get(0).click();
            pom.RemoveCart.deleteElements(driver).get(1).click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            pom.RemoveCart.deleteElements(driver).get(0).click();
            pom.RemoveCart.deleteElements(driver).get(1).click();
        }
        waits.ApplyWaits.explicitWait(driver,pom.RemoveCart.deleteWait(driver));
        String totalPrice = assertions.ApplyAssertions.totalPrice(driver).getText();

        Assert.assertEquals(totalPrice, priceZero);
    }
}
