package TestNG;

import org.testng.annotations.Test;

public class grouping {

    @Test
    public void t1() {
        System.out.println("Running normal t1");
    }

    @Test
    public void t2() {
        System.out.println("Running normal t2");
    }

    @Test(groups = {"Regression"})
    public void r1() {
        System.out.println("Running Regression r1");
    }

    @Test(groups = {"Regression"})
    public void r2() {
        System.out.println("Running Regression r2");
    }

    @Test(groups = {"Smoke"})
    public void s1() {
        System.out.println("Running Smoke 1");
    }

    @Test(groups = {"Smoke"})
    public void s2() {
        System.out.println("Running Smoke 2");
    }


    @Test(groups={"Smoke","Regression"})
    public void s1r1() {
        System.out.println("Running Smoke or Regression");
    }

    @Test(groups={"Smoke","Regression"})
    public void s2r2() {
       System.out.println("Running Smoke or Regression");
    }

}










