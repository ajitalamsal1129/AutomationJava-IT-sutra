package APi;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

import static io.restassured.RestAssured.given;

public class Create {
    @Test
    public void Weather(){
        Response response= given()
        .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\name\":\"Ajita\",\"job\":\"QA\"}")
                .when()
                .post("https://reqres.in/api/users");

        System.out.println("POST Response\n"+response.asString());
        //tests
        response.then().body("id", Matchers.any(String.class));
        //parsing the json
        System.out.println("Name::" +response.jsonPath().getString("name"));

        response.then().body("name",Matchers.is("Ajita"));
        assertEquals(response.getStatusCode(),201);//created code...
        //incase of multiple id in weather
        System.out.println("Array Main::" +response.jsonPath().getString("weather.main"));


    }

}
