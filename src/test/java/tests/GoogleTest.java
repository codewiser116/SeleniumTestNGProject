package tests;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class GoogleTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }

    @BeforeGroups(groups = {"googleGroup1"})
    public void beforeGroup(){
        System.out.println("This is before group method");
    }


    @Test (groups = {"googleGroup1"})
    public void testGoogle1(){
        System.out.println("this is google test 1");
    }


    @Test
    public void testGoogle2(){
        System.out.println("this is google test 2");
    }

    @Test (groups = {"googleGroup1"})
    public void testGoogle3(){
        System.out.println("this is google test 3");
    }






}
