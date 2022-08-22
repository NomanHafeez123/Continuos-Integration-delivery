import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateShoppingBag extends BaseClass{
    @Parameters({"items","price"})
    @Test (priority = 1)
private void goToShopping(String items, String price){
    pom.ShoppingBag.cartElements(driver).click();

    waits.ApplyWaits.explicitWait(driver,pom.ShoppingBag.shoppingBagWait(driver));

    pom.ShoppingBag.shoppingBag(driver).click();

        String noOfItems = assertions.ApplyAssertions.noOfItems(driver).getText();
        String totalPrice = assertions.ApplyAssertions.totalPrice(driver).getText();

        Assert.assertEquals(noOfItems, items);
        Assert.assertEquals(totalPrice, price);
}
}
