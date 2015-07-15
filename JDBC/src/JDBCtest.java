import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * @author AurielKiss
 *executeUpdate() -> database UPDATE statements (for insert,update,delete )
 *executeQuery() -> database QUERY statements (for getting the data from database )
 *execute() -> anything that comes in (any kind of operations)
 */

public class JDBCtest {

	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306";
		String user ="root";
		String password = "aure";
		
		System.out.println("Connecting database...");
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected!");
			
			Statement stt = con.createStatement();
			
			//create and select db
			stt.executeUpdate("CREATE DATABASE IF NOT EXISTS testovanie");
			System.out.println("DB created!");
			stt.executeUpdate("USE testovanie");
			System.out.println("DB use!");
			
			//Create out table
			stt.executeUpdate("DROP TABLE IF EXISTS REGISTRATION");
			System.out.println("DB drop!");
			stt.executeUpdate("CREATE TABLE REGISTRATION " +
	                   "(id int(11) NOT NULL AUTO_INCREMENT, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))");
			System.out.println("DB table created!");
			
			// Add some entries
			stt.executeUpdate("INSERT INTO REGISTRATION(first, last) VALUES"+
			"('Joe','Bloggs'),('Mary','Bloggs'),('Jill','Hill')");
			
			System.out.println("DB entries inserted!");
			
			System.out.println("------------------------------");
			
			System.out.println("Reading from database ...\n");
			//Get people with surname Bloggs
			
			ResultSet res = stt.executeQuery("SELECT * FROM REGISTRATION WHERE last = 'Bloggs'");
			
			while (res.next()){
				System.out.println(res.getString("first")+" "+res.getString("last"));
			}
			System.out.println("");
			//Same as the last query, but with a prep'd statement
			PreparedStatement prep = con.prepareStatement("SELECT * FROM REGISTRATION WHERE last = ?");
			prep.setString(1, "Bloggs");
			res = prep.executeQuery();
			
			while (res.next()){
				System.out.println(res.getString("first")+" "+res.getString("last"));
			}

			//Free resources
			res.close();
			stt.close();
			prep.close();
			con.close();

		}
		
		catch(Exception e){
			System.out.println("ERROR "+e);
		}
		
	}

}
