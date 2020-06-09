import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class Table_view {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_view window = new Table_view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Table_view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 86, 398, 150);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnImportData = new JButton("Import Data");
		btnImportData.setBounds(168, 13, 120, 25);
		frame.getContentPane().add(btnImportData);

		JButton btnExportData = new JButton("Export Data");
		btnExportData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrintWriter printWriter = new PrintWriter(new File("E:\\out.csv"));
					StringBuilder sBuilder = new StringBuilder();

					Connection connection = null;
					DBConnection dbConnection = new DBConnection();
					connection = dbConnection.getConnection();

					String queryString = "Select * from entry";
					PreparedStatement pStatement = connection.prepareStatement(queryString);

					ResultSet rSet = pStatement.executeQuery();

					while (rSet.next()) {

						sBuilder.append(rSet.getString("brand"));
						sBuilder.append(",");
						sBuilder.append(rSet.getString("model"));
						sBuilder.append(",");
						sBuilder.append(rSet.getString("price"));
						sBuilder.append(",");
						sBuilder.append(rSet.getString("qty"));
						sBuilder.append("\r\n");

					}
					printWriter.write(sBuilder.toString());
					printWriter.close();
					connection.close();
					pStatement.close();
					JOptionPane.showMessageDialog(null, "Data Successfully Exported to D:/out.csv");

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}

			}
		});
		btnExportData.setBounds(300, 13, 120, 25);
		frame.getContentPane().add(btnExportData);

		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(12, 13, 97, 25);
		frame.getContentPane().add(btnDashboard);

		JButton btnNewButton = new JButton("Load Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				try {
					Connection connection = null;
					DBConnection dbConnection = new DBConnection();
					connection = dbConnection.getConnection();

					String queryString = "Select * from entry";
					PreparedStatement pStatement = connection.prepareStatement(queryString);

					ResultSet rSet = pStatement.executeQuery();
					ResultSetMetaData metaData = rSet.getMetaData();
					
					model.addColumn("Brand");
					model.addColumn("Model");
					model.addColumn("Price");
					model.addColumn("QTY");
					
					while (rSet.next()){
						model.addRow(new Object[] {rSet.getString(1),rSet.getString(2),rSet.getInt(3),rSet.getInt(4)});
					}
					

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(12, 48, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
