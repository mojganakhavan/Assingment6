
package player;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import jaco.mp3.player.MP3Player;


public class ViewPlayer {
	
	private JFrame frame;
	//private MP3Player mp3player= new MP3Player();
	private PlayerMethods pm= new PlayerMethods();
	//final JFileChooser fileChooser = new JFileChooser();
	private String path= "";
	
	
	
	
	/**
	 * @return the frame
	 */
	public JFrame getframe() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public ViewPlayer(){
		System.out.println("hejhej23");
		initialize();
		
	}
	
	public void openbutton(){
		int n;
		System.out.println("in openbutton ");
		JButton btnNewButton_1 = new JButton("Open");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				int n =pm.getFileChooser().showOpenDialog(btnNewButton_1);
				pm.setReturnVal(n);
				//System.out.println("hhgggf  "+n);
				//pm.setReturnVal(fileChooser.showOpenDialog(btnNewButton_1)); 
				//System.out.println("hejhej openbutton"+pm.getReturnVal());
				pm.open();
				System.out.println("lable "+path);
				JLabel lblNewLabel_1 = new JLabel("path");
				lblNewLabel_1.setBounds(149, 26, 220, 29);
				frame.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setText(pm.getPath());
			
	/*		int returnVal = fileChooser.showOpenDialog(btnNewButton_1);
			//showOpenDialog(JavaEditor.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				path = file.getAbsolutePath();
		////if mp3 open file *********************************************
				System.out.println(path);
				JLabel lblNewLabel_1 = new JLabel("path");
				lblNewLabel_1.setBounds(149, 26, 220, 29);
				frame.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setText(path);
				//mp3Player=new MP3Player(new File(path));
				mp3Player.addToPlayList(file);
				mp3Player.play();
 		
				}*/
			}
		});
		
		
		btnNewButton_1.setBounds(32, 74, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
	}

	public void initialize() {
		
		System.out.println("hejhej1");
		this.frame= new JFrame();
		System.out.println("hejhej");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		System.out.println("hejhej in initialize ");
		openbutton();
		playButton();
		pauseButton();
		stopButton();

		JLabel lblNewLabel = new JLabel("music");
		lblNewLabel.setBounds(52, 26, 51, 16);
		frame.getContentPane().add(lblNewLabel);
		
	}
	
	public void playButton(){
		
		System.out.println("in");
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MP3Player	mp3Player=new MP3Player(new File("/Users/Mojgan/Downloads//Arash - boro boro.mp3"));
		        pm.play();
			}
		});
		btnPlay.setBounds(32, 102, 117, 29);
		frame.getContentPane().add(btnPlay);
		}
	
	
	
	
	public void pauseButton(){
		JButton btnNewButton = new JButton("Pause");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.pause();	
				
			}
		});
		btnNewButton.setBounds(32, 131, 117, 29);
		frame.getContentPane().add(btnNewButton);
		}
	
	
	
	
	public void stopButton(){
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pm.stop();
			}
		});
		btnStop.setBounds(32, 172, 117, 29);
		frame.getContentPane().add(btnStop);
		
		
		}
	

}





/*package player;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ViewPlayer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPlayer window = new ViewPlayer();
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
/*	public ViewPlayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
*/