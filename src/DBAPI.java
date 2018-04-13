import java.sql.*;

public class DBAPI {
	
	Connection conn = null;

    
    String userName = "root";
    String password = "sbakhru";
    String url = "jdbc:mysql://localhost/test";
	
	public void getConnection()
	{
		 try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			 conn = DriverManager.getConnection (url, userName, password);
	            System.out.println ("Database connection established");
	            

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	       
	}
	      
     
	
	int dbUpdate(String q)
	{
		int recordCount=-1;
				
        try
        {            
        	getConnection();
            Statement s = conn.createStatement ();
            recordCount=s.executeUpdate (q);
            System.out.println(recordCount+" records are updated.");
                   
            s.close ();
           // System.out.println (count + " rows were inserted");
        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            System.out.println(e);
        }
				
		return(recordCount);
		
	}
	
	ResultSet dbQuery(String q)
	{
		ResultSet rs= null;
		getConnection();
		try {
			Statement s = conn.createStatement();
			rs=s.executeQuery(q);
		//	rs=s.getResultSet();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return rs;
	}

}
