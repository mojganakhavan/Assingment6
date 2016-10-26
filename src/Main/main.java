package Main;

import java.awt.EventQueue;

//import player.PlayerMethods;
import player.ViewPlayer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hejhej");
	        //PlayerMethods pm= new PlayerMethods();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						System.out.println("hejhej");
						ViewPlayer window = new ViewPlayer();
						System.out.println("hejhej");
						window.getframe().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
						
					}
				}
			});
		
	
	}

}
