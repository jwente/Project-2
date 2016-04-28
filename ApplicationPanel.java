package project_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ApplicationPanel {

	private JFrame frmNflApplication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationPanel window = new ApplicationPanel();
					window.frmNflApplication.setVisible(true);
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
	private void initialize() 
	{
		frmNflApplication = new JFrame();
		frmNflApplication.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.setTitle("NFL Application");
		frmNflApplication.setBounds(100, 100, 1000, 700);
		frmNflApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNflApplication.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 13, 180, 50);
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox.addItem("Select a Week");
		comboBox.addItem("Week 1");
		comboBox.addItem("Week 2");
		comboBox.addItem("Week 3");
		comboBox.addItem("Week 4");
		comboBox.addItem("Week 5");
		comboBox.addItem("Week 6");
		comboBox.addItem("Week 7");
		comboBox.addItem("Week 8");
		comboBox.addItem("Week 9");
		comboBox.addItem("Week 10");
		comboBox.addItem("Week 11");
		comboBox.addItem("Week 12");
		comboBox.addItem("Week 13");
		comboBox.addItem("Week 14");
		comboBox.addItem("Week 15");
		comboBox.addItem("Week 16");
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				if(comboBox.getSelectedItem() != "Select a Week")
				{
					//do something here 
				}
			}
			
		});
		frmNflApplication.getContentPane().add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 76, 958, 75);
		frmNflApplication.getContentPane().add(textPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(234, 13, 200, 50);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmNflApplication.getContentPane().add(lblNewLabel);
		
		JButton btnAFC = new JButton("AFC Teams ");
		btnAFC.setBounds(12, 164, 150, 50);
		btnAFC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				frmNflApplication.repaint();
				
				NFLData data = new NFLData();
				
				JPanel TeamsPanel = new JPanel();
				TeamsPanel.setBounds(174, 164, 796, 476);
				frmNflApplication.getContentPane().add(TeamsPanel);
				TeamsPanel.setLayout(null);
				
				JTextPane Teams = new JTextPane();
				Teams.setFont(new Font("Calibri", Font.PLAIN, 20));
				Teams.setBounds(222, 0, 574, 463);
				TeamsPanel.add(Teams);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_1.setBounds(0, 0, 180, 50);
				comboBox_1.addItem("Select a Division");
				comboBox_1.addItem("AFC North");
				comboBox_1.addItem("AFC West");
				comboBox_1.addItem("AFC South");
				comboBox_1.addItem("AFC East");
				comboBox_1.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						if(comboBox_1.getSelectedItem() == "AFC North")
						{
							Teams.setText(data.searchDivision("AFC", "North"));
						}
						else if(comboBox_1.getSelectedItem() == "AFC West")
						{
							Teams.setText(data.searchDivision("AFC", "West"));
						}
						else if(comboBox_1.getSelectedItem() == "AFC South")
						{
							Teams.setText(data.searchDivision("AFC", "South"));
						}
						else if(comboBox_1.getSelectedItem() == "AFC East")
						{
							Teams.setText(data.searchDivision("AFC", "East"));
						}
					}
					
				});
				TeamsPanel.add(comboBox_1);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_2.setBounds(0, 63, 180, 50);
				comboBox_2.addItem("Select a Team");
				comboBox_2.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						
					}
					
				});
				TeamsPanel.add(comboBox_2);
				
				JComboBox comboBox_3 = new JComboBox();
				comboBox_3.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_3.setBounds(0, 126, 180, 50);
				comboBox_3.addItem("Select a Player");
				comboBox_3.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						if(comboBox_3.getSelectedItem() != "Select a Player")
						{
							Teams.setText(data.searchDivision("AFC", "South"));
						}
					}
					
				});
				TeamsPanel.add(comboBox_3);
				
				Teams.setText(data.searchConference("AFC"));
			}
		});
		btnAFC.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.getContentPane().add(btnAFC);
		
		JButton btnNFC = new JButton("NFC Teams ");
		btnNFC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frmNflApplication.repaint();
				
				JPanel TeamsPanel = new JPanel();
				TeamsPanel.setBounds(174, 164, 796, 476);
				frmNflApplication.getContentPane().add(TeamsPanel);
				TeamsPanel.setLayout(null);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_1.setBounds(0, 0, 180, 50);
				comboBox_1.addItem("Select a Division");
				comboBox_1.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						if(comboBox_1.getSelectedItem() != "Select a Division")
						{
							//do something here 
						}
					}
					
				});
				TeamsPanel.add(comboBox_1);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_2.setBounds(0, 63, 180, 50);
				comboBox_2.addItem("Select a Team");
				comboBox_2.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						if(comboBox_2.getSelectedItem() != "Select a Team")
						{
							//do something here 
						}
					}
					
				});
				TeamsPanel.add(comboBox_2);
				
				JComboBox comboBox_3 = new JComboBox();
				comboBox_3.setFont(new Font("Calibri", Font.PLAIN, 20));
				comboBox_3.setBounds(0, 126, 180, 50);
				comboBox_3.addItem("Select a Player");
				comboBox_3.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						if(comboBox_3.getSelectedItem() != "Select a Player")
						{
							//do something here 
						}
					}
					
				});
				TeamsPanel.add(comboBox_3);
				
				JTextPane Teams = new JTextPane();
				Teams.setFont(new Font("Calibri", Font.PLAIN, 20));
				Teams.setBounds(222, 0, 574, 463);
				TeamsPanel.add(Teams);
				
				NFLData data = new NFLData();
				
				Teams.setText(data.searchConference("NFC"));
			}
		});
		btnNFC.setBounds(12, 227, 150, 50);
		btnNFC.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.getContentPane().add(btnNFC);
	}
}
