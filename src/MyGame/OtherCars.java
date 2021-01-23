package MyGame;

import java.awt.Color;
import java.awt.Graphics;

public class OtherCars extends GameObject{
	public OtherCars(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed=5;
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
    g.setColor(Color.YELLOW);
    g.fillRect(x, y, width, height);
	
}

}
