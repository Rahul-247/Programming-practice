import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class GeneratePDF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String filename = "D:\\data.pdf";
			Document doc = new Document();
			PdfWriter.getInstance(doc, new FileOutputStream(filename));
			doc.open();
			
			DBConnection dbConnection = new DBConnection();
			Connection connection = dbConnection.getConnection();
			PreparedStatement ps = null;
			ResultSet rs;
			
			String query = "Select * from city";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			doc.add(new Paragraph("ID"+"    "
					+"Name"+"    "+"CountryCode"
					+"    "+"District"+"    "+"Population"));
			while(rs.next()) {
				
				Paragraph pgParagraph = new Paragraph(rs.getString("ID")+"    "
						+rs.getString("Name")+"    "+rs.getString("CountryCode")
						+"    "+rs.getString("District")+"    "+rs.getString("Population"));
				doc.add(pgParagraph);
				doc.add(new Paragraph(" "));
			}
			
			doc.close();
			System.out.println("Document Finished");
		}catch(Exception e) {
			System.err.println(e);
		}
		

	}

}
