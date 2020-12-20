package WorkFlows;

import Extensions.APIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class APIFlows extends CommonOps
{
    @Step("Get temperature in Jerusalem in Celsius")
    public static String getCityTemperature(String jPath)
    {
        response = APIActions.getProperty("?q=" + getData("city") + "&appid=cb5a0626c39fb08416481cda8ff11f67&units=metric");
        return APIActions.extractFromJSON(response, jPath);
    }

    @Step("Get humidity in Jerusalem in %")
    public static String getCityHumidity(String jPath)
    {
        response = APIActions.getProperty("?q=" + getData("city") + "&appid=cb5a0626c39fb08416481cda8ff11f67&units=metric");
        return APIActions.extractFromJSON(response, jPath);
    }
}
