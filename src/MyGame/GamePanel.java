package MyGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU = 0;
	  final int GAME = 1;
	  final int END = 2;
	  int currentState = MENU;
	  Font titleFont;
	  Timer frameDraw;
	  public void paintComponent(Graphics g) {
		  if(currentState == MENU){
				drawMenuState(g);
			}else if(currentState == GAME){
				drawGameState(g);
			}else if(currentState == END){
				drawEndState(g);
			}
		  
	  }
	  public GamePanel() {
		  frameDraw = new Timer(1000/60,this);
		    frameDraw.start();
		  
	  }
	  void drawMenuState(Graphics g) {  
			 g.setColor(Color.BLUE);
			 g.fillRect(0, 0, ProjectManager.width, ProjectManager.height);;
			 titleFont = new Font("Arial", Font.PLAIN, 48);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("LEAGUE INVADERS", 20, 100);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("Press ENTER to start", 20, 300);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("Press SPACE for instructions", 20, 500);
		 }
		 void drawGameState(Graphics g) {  
			 g.setColor(Color.BLACK);
			 g.fillRect(0, 0, ProjectManager.width, ProjectManager.height);
		 }
		 void drawEndState(Graphics g)  {
			 g.setColor(Color.RED);
			 g.fillRect(0, 0, ProjectManager.width, ProjectManager.width);
		 }
	public void UpdateMenuState() {
		
		
		
	}
	
	public void UpdateEndState() {
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    UpdateMenuState();
		}else if(currentState == GAME){
		   
		}else if(currentState == END){
		    UpdateEndState();
		}
		repaint();
	}


public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	}
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	}  


}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
