package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.APIFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*The values of humidity and temperature is always changing !
To avoid failure of tests must compare the values from the site:  https://openweathermap.org/
*/
@Listeners(Utilities.Listeners.class)
public class APITests extends CommonOps
{
    @Test(description = "Get temperature in the city")
    @Description("Get temperature in Jerusalem in Celsius and verify it")
    public void test01_GetTemperature()
    {
        APIFlows.getCityTemperature("main.temp");
        System.out.println("Temperature in Jerusalem is: "+APIFlows.getCityTemperature("main.temp"));
        Verifications.text(APIFlows.getCityTemperature("main.temp"),"30.19");
    }

    @Test(description = "Get humidity in the city")
    @Description("Get humidity Jerusalem in % and verify it")
    public void test02_GetHumidity()
    {
        APIFlows.getCityHumidity("main.humidity");
        System.out.println("Humidity in Jerusalem is: "+APIFlows.getCityTemperature("main.humidity"));
        Verifications.text(APIFlows.getCityTemperature("main.humidity"),"58");
    }
}

