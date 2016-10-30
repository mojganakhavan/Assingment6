/**
 * The ViewPlayer class is creating the GUI for the
 * program.
 * ViewPlayer has got an attribute of type JFrame and one 
 * attribute of type PlayerMethods and four attribute of type 
 * JButton.
 */
package player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;


public class ViewPlayer {
	
	private JFrame frame;
	private PlayerMethods pm= new PlayerMethods();
	private JButton btnPlay = new JButton("Play");
	private JButton btnOpen = new JButton("Open");
	private JButton btnpauseButton = new JButton("Pause");
	private JButton btnStop = new JButton("Stop");
	
	
	
	
	/**
	 *@return the frame
	 */
	public JFrame getframe() {
		return frame;
	}

	/**
	 *@param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	
	/**
	 * ViewPlayer invokes initialize method that initializes all of components
	 */
	public ViewPlayer(){
		initialize();
		
	}
	
	
/**
 * initialize() initializes all of components
 */
	public void initialize() {
		framelayout();
		lableMusic();
		openbutton();
		playButton();
		pauseButton();
		stopButton();

	}
	
	
	/**
	 * 
	 *framelayout() creates a frame with particular properties
	 * 
	 */
	public void framelayout(){
		this.frame= new JFrame();
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	}
	
	
	
	/**
	 *lableMusic() creates a label with particular properties
	 */
	public void lableMusic(){
		JLabel lbMusic = new JLabel("Music:");
		lbMusic.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lbMusic.setBounds(52, 26, 51, 16);
		frame.getContentPane().add(lbMusic);
	}
	
	
	/**
	 *newLb() creates a label with particular properties
	 */
	public void newLb(){
		JLabel lblNewLabel_1 = new JLabel("path");
		lblNewLabel_1.setBounds(149, 26, 220, 29);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText(pm.getPath());
	}
	
	
	/**
	 *openbutton() creates a button named 'open' with particular properties that open the chosen music
	 */
	
	public void openbutton(){
		btnOpen.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnOpen.setBackground(Color.YELLOW);
		btnOpen.setForeground(new Color(0, 0, 0));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.setReturnVal(pm.getFileChooser().showOpenDialog(btnOpen));
				pm.open();
				newLb();
				btnPlay.setEnabled(true);
				btnStop.setEnabled(true);
				btnpauseButton.setEnabled(true);
				
			}
		});
		btnOpen.setBounds(22, 74, 92, 29);
		frame.getContentPane().add(btnOpen);
	}
	
	
	
	/**
	 *playButton() creates a button named 'play' with particular properties that plays the music
	 */
	public void playButton(){
		btnPlay.setEnabled(false);
		btnPlay.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		//btnPlay.setIcon(new ImageIcon());
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        pm.play();
			}
		});
		btnPlay.setBounds(126, 74, 92, 29);
		frame.getContentPane().add(btnPlay);
	}
	
	/**
	 *pausebutton() creates a button named 'pause' with particular properties that pauses the music
	 */
	public void pauseButton(){
		btnpauseButton.setEnabled(false);
		btnpauseButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnpauseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.pause();	
			}
		});
		btnpauseButton.setBounds(226, 74, 92, 29);
		frame.getContentPane().add(btnpauseButton);
	}
	
	
	/**
	 *stopbutton() creates a button named 'stop' with particular properties that stops the music
	 */
	public void stopButton(){
		btnStop.setEnabled(false);
		btnStop.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.stop();
			}
		});
		btnStop.setBounds(330, 74, 92, 29);
		frame.getContentPane().add(btnStop);
	}
}





