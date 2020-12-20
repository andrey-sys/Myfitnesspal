package WorkFlows;

import Extensions.APIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class APIStudentsFlows extends CommonOps
{

    @Step("Add New Student to List")
    public static void createNewStudent()
    {
        List<String> courses = new ArrayList<String>();
        courses.add(0, getData("course1"));
        courses.add(1, getData("course2"));
        courses.add(2, getData("course3"));
        APIActions.putProperty("firstName", getData("firstName"));
        APIActions.putProperty("lastName", getData("lastName"));
        APIActions.putProperty("email", getData("email"));
        APIActions.putProperty("programme", getData("programme"));
        APIActions.putListProperty("courses", courses);
        APIActions.postProperty(getData("POSTDataOfURI"));

    }

    @Step("Add Courses of the Student")
    public static void UpdateStudent()
    {
        List<String> courses = new ArrayList<String>();
        courses.add(0, getData("course4"));
        courses.add(1, getData("course5"));
        courses.add(2, getData("course6"));

        APIActions.putProperty("firstName", getData("firstName"));
        APIActions.putProperty("lastName", getData("lastName"));
        APIActions.putProperty("email", getData("email"));
        APIActions.putProperty("programme", getData("programme"));
        APIActions.putListProperty("courses", courses);
        APIActions.putUpdateProperty(getData("PUTUpdateURI"));
    }

    @Step("Get ID of student")
    public static String getIDStudent(String jPath)
    {
        response = APIActions.getProperty("/student/list");
        return APIActions.extractFromJSON(response, jPath);
    }

    @Step("Get First Name of student")
    public static String getFirstNameStudent(String jPath)
    {
        response = APIActions.getProperty("/student/list");
        return APIActions.extractFromJSON(response, jPath);
    }

    @Step("Get Second Name of student")
    public static String getSecondNameStudent(String jPath)
    {
        response = APIActions.getProperty("/student/list");
        return APIActions.extractFromJSON(response, jPath);
    }


}
