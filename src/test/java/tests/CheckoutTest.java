package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class CheckoutTest {

    @Test
    public void checkoutTest1() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(15000);
        System.out.println("Hello, this is checkout test #1");
    }

    @Test
    public void checkoutTest2(){
        System.out.println("Hello, this is checkout test #2");
    }

    @Test
    public void checkoutTest3(){
        System.out.println("Hello, this is checkout test #3");
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }

}
