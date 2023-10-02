package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class SearchTest {

    @Test
    public void searchTest1(){
        System.out.println("Search test #1");
    }

    @Test
    public void searchTest2(){
        System.out.println("Search test #2");
    }

    @Test
    public void searchTest3(){
        System.out.println("Search test #3");
    }

    @Test
    public void searchTest4() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(15000);
        System.out.println("Search test #4");
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}
