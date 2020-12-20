package Helpers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TempRestAPI
{
    @Test
    public void TemperatureAndHumidityInJerusalem()
    {
        String url = "https://api.openweathermap.org/data/2.5/weather";
        String city = "Jerusalem,IL";
        String key = "cb5a0626c39fb08416481cda8ff11f67";

        RequestSpecification httpRequest;
        Response response;

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();

        response = httpRequest.get("?q=" + city + "&appid=" + key + "&units=metric");
        JsonPath jp = response.jsonPath();
        String JerusalemTemperature = jp.get("main.temp").toString();
        System.out.println("Temperature in Jerusalem is: "+JerusalemTemperature);
        String countryName = jp.get("sys.country").toString();
        assertEquals(countryName,"IL");
        String humidity = jp.get("main.humidity").toString();
        System.out.println("Humidity in Jerusalem is: "+humidity);

    }

    @Test
    public void TemperatureAndHumidityInModiin()
    {
        String url = "https://api.openweathermap.org/data/2.5/weather";
        String city = "Modiin, IL";
        String key = "cb5a0626c39fb08416481cda8ff11f67";

        RequestSpecification httpRequest;
        Response response;

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();

        response = httpRequest.get("?q=" + city + "&appid=" + key + "&units=metric");
        JsonPath jp = response.jsonPath();
        String JerusalemTemperature = jp.get("main.temp").toString();
        System.out.println("Temperature in Modiin is: "+JerusalemTemperature);
        String countryName = jp.get("sys.country").toString();
        assertEquals(countryName,"IL");
        String humidity = jp.get("main.humidity").toString();
        System.out.println("Humidity in Modiin, IL is: "+humidity);

    }
}
