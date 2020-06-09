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
public class DBConnection {
	
	public Connection getConnection() {
		Connection connection = null;
		System.out.println("Connection Called");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","1230");
			
		}catch(SQLException e) {
			System.err.println(e);
		}catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		
		return connection;
	}

}
