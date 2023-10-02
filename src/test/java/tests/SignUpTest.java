package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class SignUpTest {

    @Test
    public void signUpTest1(){
        System.out.println("I am sign up test #1");
    }

    @Test
    public void signUpTest2() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(15000);
        System.out.println("I am sign up test #2");
    }

    @Test
    public void signUpTest3(){
        System.out.println("I am sign up test #3");
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}
