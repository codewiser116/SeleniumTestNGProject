package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsyCheckoutTest {

    @Test (groups = "googleGroup1")
    public void checkoutWithApplePay(){

        Assert.assertTrue(5 > 2);
    }
}
