package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Introduction {
    //@BeforeMethod//uns before every testt
    @BeforeTest//org.testng.annotations,runs before  tset
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @Test//org.testng.annotations
    public void test1() {
        System.out.println("Test1");

    }

    @Test//org.testng.annotations
    public void Test2() {
        System.out.println("Test2");
    }

    @AfterTest//Runs after every test
    public void AfterTest() {
        System.out.println("AfterTest");

    }

}





