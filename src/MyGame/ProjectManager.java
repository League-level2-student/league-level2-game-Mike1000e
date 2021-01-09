package MyGame;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProjectManager {
	String sTATE= "MENU";
	 JFrame frame;
	static JPanel panel;
	 GamePanel gamePanel;
	 public static final int height = 800;
		public static final int width = 500;	
		public static void main(String [] args) {
			ProjectManager proMan = new ProjectManager();
			proMan.setup();
			
		}
	
		public ProjectManager() {
			frame = new JFrame();
			 gamePanel = new GamePanel();
		}
		 void setup() {
			frame.add(gamePanel);
				frame.setPreferredSize(new Dimension(width,height));
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.pack();
			
			
		}
}
