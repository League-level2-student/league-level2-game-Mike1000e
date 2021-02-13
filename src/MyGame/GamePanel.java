package MyGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

	final int MENU = 0;
	  final int GAME = 1;
	  final int END = 2;
	  int currentState = MENU;
	  Font titleFont;
	  Timer frameDraw;
	  Timer carSpawn;
	  Timer endGame;
	  int timer = 1500*(70/60);
	 MainCar car = new MainCar(230, 350, 50, 115);
	 
	  ObjectManager objectManager= new ObjectManager(car);
	  public static BufferedImage image;
		public static boolean needImage = true;
		public static boolean gotImage = false;	
	  public void paintComponent(Graphics g) {
		  if(currentState == MENU){
				drawMenuState(g);
			}else if(currentState == GAME){
					drawGameState(g);
					timer--;
					if(timer<=0) {
						ObjectManager.win=2;
						
						
					}
					 if(car.isActive==false) {
		           			currentState++;
		           			
		           		  }
			}else if(currentState == END){
				drawEndState(g);
			}
		  
	  }
	  public GamePanel() {
		  frameDraw = new Timer(2000/60,this);
		    frameDraw.start();
		    if (needImage) {
		        loadImage ("ACTUAL FINAL CODING TRACK.jpg");
		    }
	  }
	  void drawMenuState(Graphics g) {  
			 g.setColor(Color.BLUE);
			 g.fillRect(0, 0, ProjectManager.width, ProjectManager.height);;
			 titleFont = new Font("Arial", Font.PLAIN, 48);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("", 20, 100);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("", 20, 300);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("", 20, 500);
		 }
		 void drawGameState(Graphics g) {  
			objectManager.draw(g);
			 if (gotImage) {
					g.drawImage(image, 0, 0, ProjectManager.width, ProjectManager.height, null);
				} else {
					g.setColor(Color.BLACK);
					g.fillRect(0, 0, ProjectManager.width, ProjectManager.height);
								}
			 objectManager.draw(g);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString(timer+"", 50, 100);
		 }
		 
		
		 void drawEndState(Graphics g)  {
			 g.fillRect(0, 0, ProjectManager.width, ProjectManager.height);
			 titleFont = new Font("Arial", Font.PLAIN, 48);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("GAME OVER", 20, 100);
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 if(ObjectManager.win==2) {
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("You WON" +  "POG", 20, 300);}
			 if(ObjectManager.win==1) {
				 g.setFont(titleFont);
				 g.setColor(Color.YELLOW);
				 g.drawString("You Lost" +  "Sadge", 20, 300);}
			 titleFont = new Font("Arial", Font.PLAIN, 24);
			 g.setFont(titleFont);
			 g.setColor(Color.YELLOW);
			 g.drawString("Press ENTER to restart", 20, 500);
		 }
		 public void StartGame() {
			 carSpawn = new Timer(1000 , objectManager);
			    carSpawn.start();
			 	
			 
		 }
		 
	public void UpdateMenuState() {
		
		
	}
	public void UpdateGameState() {
		
		 objectManager.update();
		
	}
	public void UpdateEndState() {
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    UpdateMenuState();
		}else if(currentState == GAME){
		   UpdateGameState();
		}else if(currentState == END){
		    UpdateEndState();
		}
		repaint();
	}


public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    
	  }else if  (currentState == MENU) {
	        currentState = GAME;
	   

	        StartGame();
	        }else {
	        currentState++;
	    }
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    car.mainRight();
	    System.out.println("hi");
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	   car.mainLeft();
	}
	
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}


}
