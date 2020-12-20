/*
package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps
{
    @Step("Get login values by sending query")
    public static List<String> getValues(String query)
    {
        List<String> loginValues = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            loginValues.add(rs.getString(1));
            loginValues.add(rs.getString(2));

        } catch (Exception e) //SQLException e
        {
            System.out.println("Error Occurred While Printing Table Data, See Details: " + e); // e.printStackTrace();
        }
        return loginValues;

    }
}
*/
