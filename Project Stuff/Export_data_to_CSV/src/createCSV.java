import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class createCSV {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try{
			PrintWriter pWriter = new PrintWriter(new File("D:\\data.csv"));
			StringBuilder sBuilder = new StringBuilder();
			
			Connection connection = null;
			dbConnection dbCon = new dbConnection();
			connection = dbCon.getConnection();
			
			ResultSet rSet = null;
			
			String queryString = "select * from city";
			PreparedStatement statement =connection.prepareStatement(queryString);
			
			rSet = statement.executeQuery();
			
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
			
			pWriter.write(sBuilder.toString());
			rSet.close();
			connection.close();
			pWriter.close();
			System.out.println("Finished");
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
