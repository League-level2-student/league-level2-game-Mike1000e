package MyGame;

import java.awt.Color;
import java.awt.Graphics;

public class MainCar extends GameObject{

	public MainCar(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void mainUp(){
		y+=speed;
		
		
		
	}
public void mainDown(){
		y-=speed;
		
		
		
	}
public void mainLeft(){
	x-=speed;
	
	
	
}
public void mainRight(){
	
	x+=speed;
	
	
}
void draw(Graphics g) {
	 g.setColor(Color.BLACK);
     g.fillRect(x,y,width,height);
	
	
}
}
