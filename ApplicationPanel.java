package project_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ApplicationPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationPanel window = new ApplicationPanel();
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
	public ApplicationPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ReadMatchData data = new ReadMatchData();
		
		frame = new JFrame();
		frame.setTitle("Sports Application");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 13, 150, 35);
		comboBox.addItem(data.viewMatchDataMLS());
		comboBox.addItem(data.viewMatchDataNFL());
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(219, 13, 150, 35);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 61, 357, 281);
		frame.getContentPane().add(textPane);
	}
}
