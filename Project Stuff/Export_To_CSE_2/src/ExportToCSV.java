import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class ExportToCSV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PrintWriter printWriter = new PrintWriter(new File("D:\\Data2.csv"));
			StringBuilder sBuilder = new StringBuilder();
			
			DBConnection dbConnection = new DBConnection();
			Connection connection = dbConnection.getConnection();
			
			String queryString = "Select * from city";
			
			ResultSet rSet = null;
			PreparedStatement pStatement = connection.prepareStatement(queryString);
			
			rSet = pStatement.executeQuery();
			while(rSet.next()) {
				sBuilder.append(rSet.getString("ID"));
				sBuilder.append(",");
				sBuilder.append(rSet.getString("Name"));
				sBuilder.append(",");
				sBuilder.append(rSet.getString("CountryCode"));
				sBuilder.append(",");
				sBuilder.append(rSet.getString("District"));
				sBuilder.append(",");
				sBuilder.append(rSet.getString("Population"));
				sBuilder.append("\r\n");
			}
			printWriter.write(sBuilder.toString());
			rSet.close();
			connection.close();
			printWriter.close();
			System.out.println("Finished");
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
