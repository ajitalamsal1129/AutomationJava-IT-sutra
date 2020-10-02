package APi;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class GetWeather {
    @Test
    public void Weather() {
        Response response = get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=439d4b804bc8187953eb36d2a8c26a02\n" +
                "\n");
        System.out.println(response.asString());
        System.out.println("Temporature::" + response.jsonPath().getString("main.temp"));
        System.out.println("Humidity::" + response.jsonPath().getString("main.humidity"));

        //incase of multiple id in weather
        System.out.println("Array weather::" +response.jsonPath().getString("weather[0].main"));






    }
}


