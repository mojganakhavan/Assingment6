package Main;

import java.awt.EventQueue;

import player.PlayerMethods;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PlayerMethods pm= new PlayerMethods();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PlayerMethods window = new PlayerMethods();
						window.getframe().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}

}
