package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class LoginTest {


    @Test ()
    public void loginTest1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
        System.out.println("This is login test #1");

        Assert.assertEquals(2,2);
    }

    @Test (dependsOnMethods = {"loginTest1"})
    public void loginTest2() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("This is login test #2");
        softAssert.assertEquals(2, -2);

        System.out.println("after failure we are gonna to run testss");

        softAssert.assertTrue(true);
        softAssert.assertAll();
    }


    @Test (dependsOnMethods = {"loginTest2"})
    public void loginTest3(){

        SoftAssert softAssert = new SoftAssert();
        System.out.println("This is login test #2");
        softAssert.assertEquals(2, -2);

        System.out.println("after failure we are gonna to run testss");

        softAssert.assertTrue(true);
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }

}
