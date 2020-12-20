package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.List;

public class APIActions extends CommonOps
{

    @Step("Get data from server")
    public static Response getProperty(String paramValues)
    {
        response = httpRequest.get(paramValues);
        // System.out.println(response.prettyPrint());
        return response;
    }

    @Step("Extract value from JSON format")
    public static String extractFromJSON(Response response, String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Put property into request parameters")
    public static void putProperty(String nameOfProperty, String valueOfProperty)
    {
        requestParams.put(nameOfProperty, valueOfProperty);
    }

    @Step("Put list of properties into request parameters")
    public static void putListProperty(String nameOfProperty, List<String> listOfProperties)
    {
        requestParams.put(nameOfProperty, listOfProperties);
    }

    @Step("Post property request")
    public static void postProperty(String URI)
    {
        httpRequest.body(requestParams.toJSONString());
        response = httpRequest.post(URI);
    }

    @Step("Put request to update property")
    public static void putUpdateProperty(String URI)
    {
        httpRequest.body(requestParams.toJSONString());
        response = httpRequest.put(URI);
    }

    @Step("Delete one URI")
    public static void deleteStudent(String URI)
    {
        httpRequest.body(requestParams.toJSONString());
        response = httpRequest.delete(URI);
    }

}
