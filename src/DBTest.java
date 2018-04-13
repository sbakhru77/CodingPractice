import java.sql.*;

public class DBTest {

	public static void main(String[] args) {
		DBAPI dbAPIObj = new DBAPI();

		try{
			dbAPIObj.getConnection();
			
			//String insQry = "insert into student values(6,'Gehani','gehani@gmail.com')";
			String updQry = "Update student set email='rohan@gmail.com' where id=3";
			dbAPIObj.dbUpdate(updQry);
			
			String selQry = "select * from student";
			ResultSet rs = dbAPIObj.dbQuery(selQry);
			
			while(rs.next()){
				int idVal = rs.getInt("Id");
				String nameVal = rs.getString("Name");
				String emailVal  = rs.getString("email");
				
				System.out.println("id = "+idVal+" name = "+nameVal+" email= "+emailVal);
			}
			
			rs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
