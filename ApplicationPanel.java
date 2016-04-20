package project_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

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
		frame.setBounds(100, 100, 800, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaption);
		comboBox.setBounds(12, 75, 150, 35);
		comboBox.addItem(data.viewMatchDataMLS());
		//comboBox.addItem(data.viewMatchDataNFL());
		frame.getContentPane().add(comboBox);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBackground(SystemColor.inactiveCaption);
		btnSelect.setBounds(174, 75, 150, 35);
		frame.getContentPane().add(btnSelect);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(12, 139, 758, 376);
		frame.getContentPane().add(textPane);
		
		JLabel lblCategory = new JLabel("Sports Category");
		lblCategory.setBounds(12, 27, 150, 35);
		frame.getContentPane().add(lblCategory);
		
		JTextArea txtSearchTeam = new JTextArea();
		txtSearchTeam.setBounds(620, 75, 150, 35);
		frame.getContentPane().add(txtSearchTeam);
		
		JButton btnSearchTeam = new JButton("Search Team");
		btnSearchTeam.setBackground(SystemColor.inactiveCaption);
		btnSearchTeam.setBounds(458, 75, 150, 35);
		frame.getContentPane().add(btnSearchTeam);
	}
}
