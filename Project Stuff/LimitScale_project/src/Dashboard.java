import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.channels.NonWritableChannelException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
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
		
		JButton btnAddData = new JButton("ADD Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Add_data addframeAdd_data = new Add_data();
				addframeAdd_data.main(null);
				
			}
		});
		btnAddData.setBounds(47, 50, 97, 25);
		frame.getContentPane().add(btnAddData);
		
		JButton btnViewTable = new JButton("View table");
		btnViewTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnViewTable.setBounds(253, 50, 97, 25);
		frame.getContentPane().add(btnViewTable);
		
		JButton btnViewChart = new JButton("View Chart");
		btnViewChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				View_Chart view_Chart = new View_Chart();
				view_Chart.main(null);
				
			}
		});
		btnViewChart.setBounds(153, 139, 97, 25);
		frame.getContentPane().add(btnViewChart);
	}
}
