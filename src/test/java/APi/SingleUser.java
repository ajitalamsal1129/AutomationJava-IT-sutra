package APi;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static org.testng.AssertJUnit.assertEquals;

public class SingleUser {
    @Test
    public void APTTest(){
        Response response=get("https://reqres.in/api/users/2");
        response.then().body("data.first_name", Matchers.is("Janet"));
        assertEquals(200,response.getStatusCode());
    }
}
