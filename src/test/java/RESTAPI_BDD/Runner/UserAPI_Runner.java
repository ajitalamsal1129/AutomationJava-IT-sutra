package RESTAPI_BDD.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features ="src/test/java/RESTAPI_BDD/Feature",
            glue = "RESTAPI_BDD.StepDef",
            tags={}
    )

public class UserAPI_Runner {
}







