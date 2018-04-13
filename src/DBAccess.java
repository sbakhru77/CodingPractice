import java.sql.*;

public class DBAccess
{
    public static void main (String[] args)
    {
        Connection conn = null;

        try
        {
            String userName = "root";
            String password = "sbakhru";
            String url = "jdbc:mysql://localhost/test";
            
            //ConnectorJ jar file should be in the Classpath environment variable for the Database connection to establish
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
         
            System.out.println ("Database connection established");
            Statement s = conn.createStatement ();
            int count;
            int rc=s.executeUpdate ("Update student set email='abcded@gmail.com' where id=3");
            System.out.println(rc+" records are updated.");
            s.executeQuery ("SELECT * FROM student");
            ResultSet rs = s.getResultSet ();
            while (rs.next ())
            {
                int idVal = rs.getInt ("id");
                String nameVal = rs.getString (2);
                String catVal = rs.getString ("email");
                System.out.println (
                        "id = " + idVal
                        + ", name = " + nameVal
                        + ", email = " + catVal);
           //     ++count;
            }
            rs.close ();
            s.close ();

            
            //s.close ();
           // System.out.println (count + " rows were inserted");

        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            System.out.println(e);
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}
