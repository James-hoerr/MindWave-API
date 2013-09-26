import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class MindwaveMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private boolean blnGetData = false;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MindwaveMenu frame = new MindwaveMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MindwaveMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 552);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHappylike = new JButton("Happy \"Like\"");
		btnHappylike.setBounds(806, 49, 136, 52);
		contentPane.add(btnHappylike);
		
		JButton btnSaddislike = new JButton("Sad \"Dislike\"");
		btnSaddislike.setBounds(806, 130, 136, 52);
		contentPane.add(btnSaddislike);
		
		JButton btnConnectToDevice = new JButton("Connect to Device");
		btnConnectToDevice.setBounds(806, 277, 136, 26);
		btnConnectToDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int connectionId = ThinkGear.GetNewConnectionId();
			}
		});
		contentPane.add(btnConnectToDevice);
		
		JButton btnStartGettingData = new JButton("Start Getting data");
		btnStartGettingData.setBounds(806, 315, 136, 26);
		btnStartGettingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blnGetData = true;
			}
		});
		contentPane.add(btnStartGettingData);
		
		JButton btnStopGettingData = new JButton("Stop Getting data");
		btnStopGettingData.setBounds(806, 353, 136, 26);
		btnStopGettingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blnGetData = false;
			}
		});
		contentPane.add(btnStopGettingData);
		
		JButton btnSaveDataTo = new JButton("Save data to File");
		btnSaveDataTo.setBounds(806, 391, 136, 26);
		contentPane.add(btnSaveDataTo);
		
		JButton btnExitProgram = new JButton("Exit Program");
		btnExitProgram.setBounds(806, 429, 136, 26);
		contentPane.add(btnExitProgram);
		
		JLabel imgView = new JLabel("");
		imgView.setIcon(new ImageIcon("C:\\Users\\d14\\Downloads\\1380033435499.gif"));
		imgView.setBounds(12, 12, 788, 489);
		contentPane.add(imgView);
	}
}
