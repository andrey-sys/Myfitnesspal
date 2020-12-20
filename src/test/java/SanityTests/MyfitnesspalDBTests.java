/*Your account number is: 440314

Your new database is now ready to use.

To connect to your database use these details

Server: sql2.freemysqlhosting.net
Name: sql2357567
Username: sql2357567
Password: iM4*zA3*
Port number: 3306

 phpMyAdmin is now available to administer your database.
 phpMyAdmin will allow you to create, edit and remove tables and to back up and import your data.
 Follow this link http://www.phpmyadmin.co and use the database details above to get started with your new database.

 Stop working because of free version has expired.
 */

package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class MyfitnesspalDBTests extends CommonOps
{
    @Test(description = "Verify Login to myfitnesspal with Database")
    @Description("Test description: verify the login with name and password taken from database")
    public void test01_LoginWithDB()
    {
//        WebFlows.loginWithDB();  or login of @BeforeClass
        Verifications.testElement(myHomePage.txt_myUserName, "andrewscottt");
    }
}
