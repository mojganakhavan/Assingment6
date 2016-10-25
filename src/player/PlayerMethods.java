package player;

import java.awt.EventQueue;

import javax.swing.JFrame;

import jaco.mp3.player.MP3Player;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class PlayerMethods {

	private JFrame frame;
	final JFileChooser fileChooser = new JFileChooser();
	private MP3Player mp3Player=new MP3Player();
	private JTextField textField;
	private String path= "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerMethods window = new PlayerMethods();
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
	public PlayerMethods() {
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
		//MP3Player mp3Player=new MP3Player();
		//MP3Player mp3Player=new MP3Player(new File("/Users/Mojgan/Downloads//Arash - boro boro.mp3"));
		// Create a file chooser
	//	final JFileChooser fileChooser = new JFileChooser();
		
		JButton btnNewButton_1 = new JButton("New Song");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				int returnVal = fileChooser.showOpenDialog(btnNewButton_1);
						//showOpenDialog(JavaEditor.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
			 path = file.getAbsolutePath();
				
				System.out.println(path);
				JLabel lblNewLabel_1 = new JLabel("path");
				lblNewLabel_1.setBounds(149, 26, 220, 29);
				frame.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setText(path);
				//textArea.setText(fileHandler.readFile(file));
				//mp3Player=new MP3Player(new File(path));
				mp3Player.addToPlayList(file);
		        mp3Player.play();
		        
				
			}
	
	
			}
		});
		btnNewButton_1.setBounds(32, 74, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		System.out.println("hej****"+path);
		
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MP3Player	mp3Player=new MP3Player(new File("/Users/Mojgan/Downloads//Arash - boro boro.mp3"));
		        mp3Player.play();
			}
		});
		btnPlay.setBounds(32, 102, 117, 29);
		frame.getContentPane().add(btnPlay);
		
		JButton btnNewButton = new JButton("Pause");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3Player.pause();	
				
			}
		});
		btnNewButton.setBounds(32, 131, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3Player.stop();
			}
		});
		btnStop.setBounds(32, 172, 117, 29);
		frame.getContentPane().add(btnStop);
		
		JLabel lblNewLabel = new JLabel("music");
		lblNewLabel.setBounds(52, 26, 51, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lable2 = new JLabel(path);
		lable2.setBounds(207, 102, 148, 29);
		frame.getContentPane().add(lable2);
		
		
		
	
		
		
	}
}
