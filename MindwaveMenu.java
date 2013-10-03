import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class MindwaveMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	//Declares all variables for This class as well as variable to connect to the thinkgear class
	boolean blnGetData = false;
	private int intImageNumber = 0;
	public int connectionId = 0;
	public int intPic = 0;
    public static final int DATA_BATTERY     = 0; ///< Data type that can be requested from GetValue().
    public static final int DATA_POOR_SIGNAL = 1; ///< Data type that can be requested from GetValue().
    public static final int DATA_ATTENTION   = 2; ///< Data type that can be requested from GetValue().
    public static final int DATA_MEDITATION  = 3; ///< Data type that can be requested from GetValue().
    public static final int DATA_RAW         = 4; ///< Data type that can be requested from GetValue().
    public static final int DATA_DELTA       = 5; ///< Data type that can be requested from GetValue().
    public static final int DATA_THETA       = 6; ///< Data type that can be requested from GetValue().
    public static final int DATA_ALPHA1      = 7; ///< Data type that can be requested from GetValue().
    public static final int DATA_ALPHA2      = 8; ///< Data type that can be requested from GetValue().
    public static final int DATA_BETA1       = 9; ///< Data type that can be requested from GetValue().
    public static final int DATA_BETA2       = 10; ///< Data type that can be requested from GetValue().
    public static final int DATA_GAMMA1      = 11; ///< Data type that can be requested from GetValue().
    public static final int DATA_GAMMA2      = 12; ///< Data type that can be requested from GetValue().
	String[] results = new String[20];
	double alpha1;
	double alpha2;	
	double beta1;	
	double beta2;	
	double gamma1;	
	double gamma2;	
	double theta;	
	double delta;
			
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


	//Creates the Frame and sets the frame variables
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
		
		final JLabel imgView = new JLabel("");
		
		//start of the code for the happy button
		//the code should be the same as tehe sad button
		JButton btnHappylike = new JButton("Happy \"Like\"");
		btnHappylike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (blnGetData){
					for (int i = 0; i < 4; i++){
					delta = ThinkGear.GetValue(connectionId, DATA_DELTA);
					theta = ThinkGear.GetValue(connectionId, DATA_THETA);
					alpha1 = ThinkGear.GetValue(connectionId, DATA_ALPHA1);
					alpha2 = ThinkGear.GetValue(connectionId, DATA_ALPHA2);
					beta1 = ThinkGear.GetValue(connectionId, DATA_BETA1);
					beta2 = ThinkGear.GetValue(connectionId, DATA_BETA2);
					gamma1 = ThinkGear.GetValue(connectionId, DATA_GAMMA1);
					gamma2 = ThinkGear.GetValue(connectionId, DATA_GAMMA2);
					try {
							Thread.sleep(1000);
						} 
					catch (InterruptedException e1) 
						{
							e1.printStackTrace();
						}
					
					}
					intImageNumber = intImageNumber++;
				}
				else {
					JOptionPane.showMessageDialog(null,"NO CONNECTION TO DEVICE","ERROR",JOptionPane.WARNING_MESSAGE); //Shows an error if button is clicked and no connection to the device has been made

				}
			}
		});
		btnHappylike.setBounds(806, 49, 136, 52);
		contentPane.add(btnHappylike);
		//end of the code for the happy button
		
		//start of the code for the Sad button
		//the code should be the same as the happy button
		JButton btnSaddislike = new JButton("Sad \"Dislike\"");
		btnSaddislike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (blnGetData){
					for (int i = 0; i < 4; i++){
					delta = ThinkGear.GetValue(connectionId, DATA_DELTA);
					theta = ThinkGear.GetValue(connectionId, DATA_THETA);
					alpha1 = ThinkGear.GetValue(connectionId, DATA_ALPHA1);
					alpha2 = ThinkGear.GetValue(connectionId, DATA_ALPHA2);
					beta1 = ThinkGear.GetValue(connectionId, DATA_BETA1);
					beta2 = ThinkGear.GetValue(connectionId, DATA_BETA2);
					gamma1 = ThinkGear.GetValue(connectionId, DATA_GAMMA1);
					gamma2 = ThinkGear.GetValue(connectionId, DATA_GAMMA2);
					try {
							Thread.sleep(1000);
					} 
					catch (InterruptedException e1) {
							e1.printStackTrace();
					}
					
					}
					intImageNumber = intImageNumber++;
				}
				else {
					JOptionPane.showMessageDialog(null,"NO CONNECTION TO DEVICE","ERROR",JOptionPane.WARNING_MESSAGE); //Shows an error if button is clicked and no connection to the device has been made

				}
			}
		});
		btnSaddislike.setBounds(806, 130, 136, 52);
		contentPane.add(btnSaddislike);
		//end of the code for the sad button 
				
		
		
		//start of the code for the connect to the device button
		JButton btnConnectToDevice = new JButton("Connect to Device");
		btnConnectToDevice.setBounds(806, 277, 136, 26);
		btnConnectToDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				connectionId = ThinkGear.GetNewConnectionId();
			}
		});
		contentPane.add(btnConnectToDevice);
		//end of the code for the connect to the device button
		
		//start of the code for the StartGettingData button
		JButton btnStartGettingData = new JButton("Start Getting data");
		btnStartGettingData.setBounds(806, 315, 136, 26);
		btnStartGettingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blnGetData = true;
			}
		});
		contentPane.add(btnStartGettingData);
		//end of the code for the StartGettingData button
		
		//start of the code for the stopGettingData button 
		JButton btnStopGettingData = new JButton("Stop Getting data");
		btnStopGettingData.setBounds(806, 353, 136, 26);
		btnStopGettingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blnGetData = false;
				imgView.setIcon(new ImageIcon("http://studentunitypower.org/wp-content/uploads/2011/10/"+intPic+".jpg"));
				imgView.setBounds(12, 12, 788, 489);
			}
		});
		contentPane.add(btnStopGettingData);
		//end of the code for the stopGettingData button
		
		//Start of the code for the shutdown button
		JButton btnExitProgram = new JButton("Exit Program");
		btnExitProgram.setBounds(806, 429, 136, 26);
		contentPane.add(btnExitProgram);
		//end of the code for the shutdown button 
		
		//start of the code for the label that displays the image to the user
		
		
		contentPane.add(imgView);
		//end of the code for the label that displays the image to the user
	}
}
