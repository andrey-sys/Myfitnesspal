package SanityTests;

import Extensions.APIActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.APIStudentsFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*Before starting execution, read the Students List Documentation */
@Listeners(Utilities.Listeners.class)
public class APIStudentsTests extends CommonOps
{
    @Test(description = "Verify new student on the List")
    @Description("Verify adding of new student (Andrew)")
    public void test01_VerifyNewStudent()
    {
        APIStudentsFlows.createNewStudent();
        Verifications.text(APIStudentsFlows.getIDStudent("[100].firstName"), "Andrew");
        Verifications.verifyStatusCode(200);
    }

    @Test(description = "Update courses of the student")
    @Description("Update 3 courses to this student")
    public void test02_AddCourseToStudent()
    {
        APIStudentsFlows.UpdateStudent();
        Verifications.text(APIStudentsFlows.getIDStudent("[100].courses[2]"), "Docker");
        Verifications.verifyStatusCode(200);
    }
    @Test(description = "Delete new Student")
    @Description("Delete new student with id = 101")
    public void  test03_deleteStudent()
    {
        APIActions.deleteStudent(getData("DELETEofURI"));
        Verifications.verifyStatusCode(204);
    }
    @Test(description = "Verify First Name")
    @Description("Find student from list by id and verify his name (id = 50, Yoshio Kato)")
    public void  test04_findStudentByName()
    {
        Verifications.text(APIStudentsFlows.getFirstNameStudent("[49].firstName"),"Yoshio");
        Verifications.verifyStatusCode(200);
    }
    @Test(description = "Verify Last Name")
    @Description("Find student from list by id and verify his last name(id = 13, Zachary Vance)")
    public void  test05_findStudentByLastName()
    {
        Verifications.text(APIStudentsFlows.getFirstNameStudent("[12].lastName"),"Vance");
        Verifications.verifyStatusCode(200);
    }
}
