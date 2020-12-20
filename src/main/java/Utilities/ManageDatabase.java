package Utilities;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ManageDatabase extends CommonOps
{
    public static void initConnection(String dbUrl, String username, String password)
    {
        try
        {
            con = DriverManager.getConnection(dbUrl, username, password);
            stmt = con.createStatement();

        } catch (SQLException e)
        {
            System.out.println("Error Occurred While Connecting JDBC, See Details: " + e); // e.printStackTrace();
        }
    }

    public static void closeConnection()
    {
        try
        {
            con.close();
        } catch (SQLException e)
        {
            System.out.println("Error Occurred While Closing JDBC, See Details: " + e); // e.printStackTrace();
        }
    }
}
