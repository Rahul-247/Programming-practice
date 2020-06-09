import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class Add_data {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_data window = new Add_data();
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
	public Add_data() {
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
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(32, 46, 56, 16);
		frame.getContentPane().add(lblBrand);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(32, 88, 56, 16);
		frame.getContentPane().add(lblModel);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(32, 128, 56, 16);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblNewLabel = new JLabel("QTY");
		lblNewLabel.setBounds(32, 167, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(117, 43, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(117, 85, 116, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(117, 125, 116, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(117, 164, 116, 22);
		frame.getContentPane().add(textField_3);
		
		JButton btnSaveData = new JButton("Save Data");
		btnSaveData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement pStatement;
				try {
					DBConnection dbConnection = new DBConnection();
					Connection connection = dbConnection.getConnection();
					
					String queryString = "insert into entry values('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"')";
					pStatement = connection.prepareStatement(queryString);
					int res = pStatement.executeUpdate();
					JOptionPane.showMessageDialog(null,"Inserted Successfully");
					
					connection.close();
					pStatement.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSaveData.setBounds(310, 215, 97, 25);
		frame.getContentPane().add(btnSaveData);
		
		JButton btnDabsboard = new JButton("Dabsboard");
		btnDabsboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Dashboard dbDashboard = new Dashboard();
				dbDashboard.main(null);
			}
		});
		btnDabsboard.setBounds(32, 215, 97, 25);
		frame.getContentPane().add(btnDabsboard);
	}
}
