import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class View_Chart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Chart window = new View_Chart();
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
	public View_Chart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 937, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 45, 895, 471);
		frame.getContentPane().add(panel);
		
		JButton btnLoadChart = new JButton("Load Chart");
		btnLoadChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement pStatement;
				try {
					DBConnection dbConnection = new DBConnection();
					Connection connection = dbConnection.getConnection();
					
					String queryString = "select brand, price from entry";
					JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, queryString);
					JFreeChart chart = ChartFactory.createBarChart("Report", "Price", "Model",dataset, PlotOrientation.VERTICAL, false, false, false);
					CategoryPlot catPlot = chart.getCategoryPlot();
					catPlot.setRangeGridlinePaint(Color.BLACK);
					ChartPanel chartpanel = new ChartPanel(chart);
					panel.removeAll();
					panel.add(chartpanel, BorderLayout.CENTER);
					panel.validate();
					connection.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLoadChart.setBounds(30, 13, 97, 25);
		frame.getContentPane().add(btnLoadChart);
		
		JButton btnDasbboard = new JButton("Dasbboard");
		btnDasbboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Dashboard dbDashboard = new Dashboard();
				dbDashboard.main(null);
				
			}
		});
		btnDasbboard.setBounds(311, 13, 97, 25);
		frame.getContentPane().add(btnDasbboard);
		
		
	}
}
