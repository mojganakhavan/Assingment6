package Main;


/**
 *@author Mojgan
 *Main class
 */
import java.awt.EventQueue;

import player.ViewPlayer;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPlayer window = new ViewPlayer();
					window.getframe().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
