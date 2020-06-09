import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class dbConnection {
	
	public Connection getConnection() {
		Connection connect = null;
		System.out.println("DB Connection Called");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","1230");
			
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		return connect;
	}
}
