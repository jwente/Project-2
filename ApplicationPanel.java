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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class ApplicationPanel {

	private JFrame frmNflApplication;
	private JTextField txtsearchTeam;

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
		//********************************************************************************************
		//Create an object of NFLData
		//********************************************************************************************
		NFLData data = new NFLData();
		
		//String[] array = data.getTeamList().toArray(new String[data.getTeamList().size()]);
		
		//********************************************************************************************
		//Create the JFrame for the application
		//********************************************************************************************
		frmNflApplication = new JFrame();
		frmNflApplication.getContentPane().setBackground(SystemColor.control);
		frmNflApplication.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.setTitle("NFL Application");
		frmNflApplication.setBounds(100, 100, 1000, 700);
		frmNflApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNflApplication.getContentPane().setLayout(null);
		
		//********************************************************************************************
		//Create JPanel to display NFL logo
		//********************************************************************************************
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(234, 164, 736, 476);
		frmNflApplication.getContentPane().add(MainPanel);
		MainPanel.setVisible(true);
		MainPanel.setBackground(SystemColor.control);
		MainPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(234, 164, 736, 476);
		frmNflApplication.getContentPane().add(panel);
		panel.setVisible(false);
		panel.setLayout(null);
		
		//********************************************************************************************
		//Create a JPanel to contain the text pane and label to display team icon and information  
		//********************************************************************************************
		JPanel TeamsPanel = new JPanel();
		TeamsPanel.setBounds(234, 164, 736, 476);
		TeamsPanel.setBackground(SystemColor.control);
		TeamsPanel.setVisible(false);
		frmNflApplication.getContentPane().add(TeamsPanel);
		TeamsPanel.setLayout(null);

		//********************************************************************************************
		//Create text pane to display team information
		//********************************************************************************************
		JTextPane Teams = new JTextPane();
		Teams.setEditable(false);
		Teams.setBounds(303, 164, 667, 476);
		Teams.setVisible(false);
		frmNflApplication.getContentPane().add(Teams);
		Teams.setFont(new Font("Calibri", Font.PLAIN, 20));
		Teams.setBackground(SystemColor.control);
		
		//********************************************************************************************
		//Create text pane to display team matches by week
		//********************************************************************************************
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Calibri", Font.PLAIN, 17));
		textPane.setBackground(SystemColor.control);
		textPane.setEditable(false);
		textPane.setBounds(20, 76, 950, 75);
		frmNflApplication.getContentPane().add(textPane);
		
		//********************************************************************************************
		//Create JLabel to hold the NFL logo image
		//********************************************************************************************
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(73, 0, 663, 365);
		MainPanel.add(lblNewLabel_1);
		Image img = new ImageIcon(this.getClass().getResource("/nfl.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		//********************************************************************************************
		//Create JComboBox to hold the 16 weeks of the NFL season
		//********************************************************************************************
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 20, 180, 50);
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
				textPane.setVisible(true);
				if(comboBox.getSelectedIndex() == 1)
				{
					textPane.setText(data.viewMatchWeek("Week 1"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 2)
				{
					textPane.setText(data.viewMatchWeek("Week 2"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
					MainPanel.repaint();
				}
				else if(comboBox.getSelectedIndex() == 3)
				{
					textPane.setText(data.viewMatchWeek("Week 3"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 4)
				{
					textPane.setText(data.viewMatchWeek("Week 4"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 5)
				{
					textPane.setText(data.viewMatchWeek("Week 5"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 6)
				{
					textPane.setText(data.viewMatchWeek("Week 6"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 7)
				{
					textPane.setText(data.viewMatchWeek("Week 7"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 8)
				{
					textPane.setText(data.viewMatchWeek("Week 8"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 9)
				{
					textPane.setText(data.viewMatchWeek("Week 9"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 10)
				{
					textPane.setText(data.viewMatchWeek("Week 10"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 11)
				{
					textPane.setText(data.viewMatchWeek("Week 11"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 12)
				{
					textPane.setText(data.viewMatchWeek("Week 12"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 13)
				{
					textPane.setText(data.viewMatchWeek("Week 13"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 14)
				{
					textPane.setText(data.viewMatchWeek("Week 14"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 15)
				{
					textPane.setText(data.viewMatchWeek("Week 15"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				else if(comboBox.getSelectedIndex() == 16)
				{
					textPane.setText(data.viewMatchWeek("Week 16"));
					TeamsPanel.setVisible(false);
					Teams.setVisible(false);
					panel.setVisible(false);
					MainPanel.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
			}
			
		});
		frmNflApplication.getContentPane().add(comboBox);
		
		//********************************************************************************************
		//Create button to show all the teams in the AFC 
		//********************************************************************************************
		JButton btnAFC = new JButton("AFC Teams ");
		btnAFC.setBounds(20, 164, 180, 50);
		btnAFC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				MainPanel.setVisible(false);
				panel.setVisible(false);
				TeamsPanel.setVisible(true);
				Teams.setVisible(true);
				frmNflApplication.repaint();	
				NFLData data = new NFLData();
				Teams.setText(data.searchConference("AFC"));
			}
		});
		btnAFC.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.getContentPane().add(btnAFC);
		
		//********************************************************************************************
		//Create button to show all the teams in the NFC
		//********************************************************************************************
		JButton btnNFC = new JButton("NFC Teams ");
		btnNFC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainPanel.setVisible(false);
				panel.setVisible(false);
				TeamsPanel.setVisible(true);
				Teams.setVisible(true);
				frmNflApplication.repaint();
				NFLData data = new NFLData();
				Teams.setText(data.searchConference("NFC"));
			}
		});
		btnNFC.setBounds(20, 227, 180, 50);
		btnNFC.setFont(new Font("Calibri", Font.PLAIN, 20));
		frmNflApplication.getContentPane().add(btnNFC);
		
		//********************************************************************************************
		//create JComboBox to hold all of the nfl divisions and display them when selected 
		//********************************************************************************************
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox_1.setBounds(20, 290, 180, 50);
		comboBox_1.addItem("AFC North");
		comboBox_1.addItem("AFC West");
		comboBox_1.addItem("AFC South");
		comboBox_1.addItem("AFC East");
		comboBox_1.addItem("NFC North");
		comboBox_1.addItem("NFC West");
		comboBox_1.addItem("NFC South");
		comboBox_1.addItem("NFC East");
		comboBox_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				Teams.setVisible(true);
				if(comboBox_1.getSelectedItem() == "AFC North")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("AFC", "North"));
				}
				else if(comboBox_1.getSelectedItem() == "AFC West")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("AFC", "West"));
				}
				else if(comboBox_1.getSelectedItem() == "AFC South")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("AFC", "South"));
				}
				else if(comboBox_1.getSelectedItem() == "AFC East")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("AFC", "East"));
				}
				else if(comboBox_1.getSelectedItem() == "NFC North")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("NFC", "North"));
				}
				else if(comboBox_1.getSelectedItem() == "NFC West")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("NFC", "West"));
				}
				else if(comboBox_1.getSelectedItem() == "NFC South")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("NFC", "South"));
				}
				else if(comboBox_1.getSelectedItem() == "NFC East")
				{
					MainPanel.setVisible(false);
					panel.setVisible(false);
					TeamsPanel.setVisible(true);
					Teams.setVisible(true);
					Teams.setText(data.searchDivision("NFC", "East"));
				}
			}
			
		});
		frmNflApplication.getContentPane().add(comboBox_1);
		
		//********************************************************************************************
		//
		//********************************************************************************************
		JLabel lblTeamIcon = new JLabel("");
		lblTeamIcon.setVisible(false);
		lblTeamIcon.setBounds(12, 13, 101, 101);
		panel.add(lblTeamIcon);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textPane_1.setBackground(SystemColor.control);
		textPane_1.setBounds(202, 0, 522, 476);
		textPane_1.setVisible(false);
		panel.add(textPane_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox_2.setBounds(20, 353, 180, 50);
		comboBox_2.setModel(new DefaultComboBoxModel(data.getTeamList().toArray()));
		comboBox_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				frmNflApplication.repaint();
				MainPanel.setVisible(false);
				TeamsPanel.setVisible(false);
				Teams.setVisible(false);
				panel.setVisible(true);
				textPane_1.setVisible(true);
				textPane_1.repaint();
				if(comboBox_2.getSelectedIndex() == 0)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Bills.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 1)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Dolphis.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 2)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Patriots.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 3)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Jets.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 4)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Ravens.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 5)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Bengals.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 6)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Browns.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 7)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Steelers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 8)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Texans.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 9)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Colts.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 10)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Jaguars.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 11)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Titans.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 12)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Broncons.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 13)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Chiefs.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 14)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Raiders.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 15)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Chargers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 16)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Cowboys.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 17)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Giants.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 18)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Eagles.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 19)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Redskins.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 20)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Bears.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 21)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Lions.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 22)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Packers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 23)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Vikings.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 24)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Falcons.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 25)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Panthers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 26)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Saints.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 27)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Buccaneers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 28)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Cardinals.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 29)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Rams.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 30)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/49ers.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				else if(comboBox_2.getSelectedIndex() == 31)
				{
					Image teamIcon = new ImageIcon(this.getClass().getResource("/Seahawks.png")).getImage();
					lblTeamIcon.setVisible(true);
					lblTeamIcon.setIcon(new ImageIcon(teamIcon));
				}
				lblTeamIcon.repaint();
				textPane_1.setText(data.viewTeamRoster(comboBox_2.getSelectedItem().toString()));
				
			}
		});
		frmNflApplication.getContentPane().add(comboBox_2);
		
		JButton btnTeamWins = new JButton("Team Wins");
		btnTeamWins.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				MainPanel.setVisible(false);
				TeamsPanel.setVisible(false);
				panel.setVisible(true);
				textPane_1.setVisible(true);
				textPane_1.setText(data.viewTeamWins(comboBox_2.getSelectedItem().toString()));
			}
		});
		btnTeamWins.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnTeamWins.setBounds(12, 137, 150, 50);
		panel.add(btnTeamWins);
		
		JButton btnTeamLoses = new JButton("Team Loses");
		btnTeamLoses.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainPanel.setVisible(false);
				TeamsPanel.setVisible(false);
				panel.setVisible(true);
				textPane_1.setVisible(true);
				textPane_1.setText(data.viewTeamLoses(comboBox_2.getSelectedItem().toString()));
			}
		});
		btnTeamLoses.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnTeamLoses.setBounds(12, 200, 150, 50);
		panel.add(btnTeamLoses);
		
		//********************************************************************************************
		//
		//********************************************************************************************
		txtsearchTeam = new JTextField();
		txtsearchTeam.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				txtsearchTeam.setText("");
			}
		});
		txtsearchTeam.setBounds(20, 416, 180, 30);
		txtsearchTeam.setText("Enter Team name");
		frmNflApplication.getContentPane().add(txtsearchTeam);
		txtsearchTeam.setColumns(10);
		
		//********************************************************************************************
		//Button is used for searching the data object. user enters a team name in the text field
		//and then must click search.
		//********************************************************************************************
		JButton btnsearchTeam = new JButton("Search");
		btnsearchTeam.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				MainPanel.setVisible(false);
				TeamsPanel.setVisible(true);
				panel.setVisible(false);
				textPane_1.setVisible(false);
				Teams.setVisible(true);
				frmNflApplication.repaint();
				NFLData data = new NFLData();
				Teams.setText(data.viewTeamRoster(txtsearchTeam.getText()));
			}
		});
		btnsearchTeam.setBounds(20, 459, 180, 50);
		frmNflApplication.getContentPane().add(btnsearchTeam);
	}
}
