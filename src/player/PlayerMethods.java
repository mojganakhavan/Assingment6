package player;
//import player.ViewPlayer;
//import java.awt.EventQueue;

//mport javax.swing.JFrame;

import jaco.mp3.player.MP3Player;

//import javax.swing.JButton;
import javax.swing.JFileChooser;

//import java.awt.event.ActionListener;
import java.io.File;
//import java.awt.event.ActionEvent;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;

public class PlayerMethods /*implements PlayerInterface*/{

	//private JFrame frame;
	private JFileChooser fileChooser = new JFileChooser();
	private MP3Player mp3Player=new MP3Player();
	//private JTextField textField;
	private String path= "";
	private int returnVal=0;
	//private File file;
	//private ViewPlayer vp= new ViewPlayer();
	
	public int getReturnVal(){
		return returnVal;
	}
	
	public void setReturnVal(int n){
		this.returnVal= n;
	}

	/**
	 * @return the mp3Player
	 */
	public MP3Player getMp3Player() {
		return mp3Player;
	}

	/**
	 * @param mp3Player the mp3Player to set
	 */
	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the fileChooser
	 */
	public JFileChooser getFileChooser() {
		return fileChooser;
	}

	

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
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
	}*/

	/**
	 * Create the application.
	 */ 
	public PlayerMethods() {
		//vp.initialize();
		//System.out.println("hejhej333");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*private void initialize() {
		vp.setFrame( new JFrame());
		frame=vp.getframe();
				frame.setBounds(100, 100, 450, 300);
		vp.getframe().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vp.getframe().getContentPane().setLayout(null);
		//MP3Player mp3Player=new MP3Player();
		//MP3Player mp3Player=new MP3Player(new File("/Users/Mojgan/Downloads//Arash - boro boro.mp3"));
		// Create a file chooser
	//	final JFileChooser fileChooser = new JFileChooser();
		vp.openbutton();
		this.play();
		this.pause();
		this.stop();
		
		
		
		
		
		/*JButton btnNewButton_1 = new JButton("Open");
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
		
		*/
		
	//	System.out.println("hej****"+path);
		
		
	/*	JButton btnPlay = new JButton("Play");
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
		*/
		
		
		
		/*
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
	
		*/
	//}

	public void open(){
		
		//showOpenDialog(JavaEditor.this);
		System.out.println("returnVAl pm.open  "+returnVal);
	
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			
			System.out.println("returnVAl pm.open2  "+returnVal);
			File file = fileChooser.getSelectedFile();
			System.out.println("returnVAl pm.open3  "+file.getAbsolutePath());
			path = file.getAbsolutePath();
	////if mp3 open file *********************************************
			if (path.contains(".mp3")){
			System.out.println("if mp3  "+path);
			/*JLabel lblNewLabel_1 = new JLabel("path");
			lblNewLabel_1.setBounds(149, 26, 220, 29);
			vp.getframe().getContentPane().add(lblNewLabel_1);
			lblNewLabel_1.setText(path);*/
			//mp3Player=new MP3Player(new File(path));
			mp3Player.addToPlayList(file);
			mp3Player.play();
			}
		
				
			
		}
		if (returnVal == JFileChooser.ERROR_OPTION) {
			System.out.println("fel!");
		}
		
		
	}
		
/*		
	public void openbutton(){
		JButton btnNewButton_1 = new JButton("Open");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnVal = fileChooser.showOpenDialog(btnNewButton_1);
				open();
			
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
		/*	}
		});
		
		
		btnNewButton_1.setBounds(32, 74, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
	}
	*/
	
	
	//////////////////////////////
	public void play(){
	/*JButton btnPlay = new JButton("Play");
	btnPlay.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {*/
			
	        mp3Player.play();
/*		}
	});
	btnPlay.setBounds(32, 102, 117, 29);
	vp.getframe().getContentPane().add(btnPlay);*/
	}
	//////////////////////////////
	public void pause(){
	/*JButton btnNewButton = new JButton("Pause");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {*/
			mp3Player.pause();	
			
	/*	}
	});
	btnNewButton.setBounds(32, 131, 117, 29);
	vp.getframe().getContentPane().add(btnNewButton);*/
	}
	
	
	////////////////////////////////////
	public void stop(){
	/*JButton btnStop = new JButton("Stop");
	btnStop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {*/
			mp3Player.stop();
	/*	}
	});
	btnStop.setBounds(32, 172, 117, 29);
	vp.getframe().getContentPane().add(btnStop);
	
	JLabel lblNewLabel = new JLabel("music");
	lblNewLabel.setBounds(52, 26, 51, 16);
	vp.getframe().getContentPane().add(lblNewLabel);*/
	}
}


