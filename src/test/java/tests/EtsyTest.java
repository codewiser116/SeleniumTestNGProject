package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class EtsyTest {

    @Test
    public void testEtsy1(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.etsy.com/");
        System.out.println("hello, this is etsy test1");
        Assert.assertEquals(5,5);
    }

    @Test
    public void testEtsy2(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.etsy.com/");
        System.out.println("hello, this is etsy test2");
        Assert.assertTrue(true);
    }



}
