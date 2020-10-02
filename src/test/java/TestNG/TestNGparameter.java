package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameter {
    @Test
    @Parameters({"id","name"})//once we run the .xml file with parameters.it passes the code here and prints the message
    public void getIdName(int id, String name){
        System.out.println("Getting values from .xml file " + id + " " + name);
    }




}
