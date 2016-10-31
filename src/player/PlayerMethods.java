/**
 * @author Mojgan
 * The PlayerMethods class uses an interface named playerInterface.
 * It has got one attribute of type JFileChooser and one attribute of type
 * MP3Player and two other attribute of type String and integer.
 * 
 */


package player;

import jaco.mp3.player.MP3Player;
import javax.swing.JFileChooser;
import java.io.File;


public class PlayerMethods implements PlayerInterface{

	private JFileChooser fileChooser = new JFileChooser();
	private MP3Player mp3Player=new MP3Player();
	private String path= "";
	private int returnVal=0;
	
	
	
	/**
	 *@return the returnVal
	 */
	public int getReturnVal(){
		return returnVal;
	}

	
	/**
	 *@param n the returnVal to set
	 */
	public void setReturnVal(int n){
		this.returnVal= n;
	}

	
	/**
	 *@return the mp3Player
	 */
	public MP3Player getMp3Player() {
		return mp3Player;
	}

	
	/**
	 *@param mp3Player the mp3Player to set
	 */
	public void setMp3Player(MP3Player mp3Player) {
		this.mp3Player = mp3Player;
	}

	
	/**
	 *@return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 *@param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 *@return the fileChooser
	 */
	public JFileChooser getFileChooser() {
		return fileChooser;
	}
	
	

	/**
	 *@param fileChooser the fileChooser to set
	 */
	public void setFileChooser(JFileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}


	/**
	 *open() choose a mp3 file and play it
	 */
	public void open(){
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			path = file.getAbsolutePath();
			if (path.contains(".mp3")){
			mp3Player.addToPlayList(file);
			mp3Player.play();
			}
		}
		if (returnVal == JFileChooser.ERROR_OPTION) {
			System.out.println("fel!");
		}
	}

	/**
	 *play() plays the music
	 */
	
	public void play(){
	        mp3Player.play();
	}
	
	
	/**
	 *pause() pauses the music
	 */
	public void pause(){
			mp3Player.pause();	
	}
	

	/**
	 *stop() stops the music
	 */
	public void stop(){
			mp3Player.stop();
	}
}


