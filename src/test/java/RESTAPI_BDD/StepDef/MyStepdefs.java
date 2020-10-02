package RESTAPI_BDD.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefs {
    String Url;
    Response response;
    @Given("^An API to handle user details for given user$")
    public void anAPIToHandleUserDetailsForGivenUser() {
        Url="https://reqres.in/api/users/";
    }

    @When("^User Requests for id (\\d+) in the payload$")
    public void userRequestsForIdInThePayload(int id) {
        response=get(Url+id);
    }

    @Then("^Verify the success Message as (\\d+) on http response$")
    public void verifyTheSuccessMessageAsOnHttpResponse(int arg0) {
        assertEquals(response.getStatusCode(),200);
    }

    @Then("^Verify the FirstName is \"([^\"]*)\"$")
    public void verifyTheFirstNameIs(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        response.then().body("data.first_name", Matchers.is(name));
        //throw new PendingException();
    }
}
