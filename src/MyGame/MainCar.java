package MyGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class MainCar extends GameObject{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	public MainCar(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		 speed = 20;
		if (needImage) {
		    loadImage ("image (2).jpg");
		}
	}
	
	
public void mainLeft(){
	this.x-=speed;
	System.out.println("hi");
	super.Update();
	
}
public void mainRight(){
	
	this.x+=speed;
	
	
}
void draw(Graphics g) {
	 g.setColor(Color.BLACK);
     g.fillRect(x,y,width,height);
     if (gotImage) {
 		g.drawImage(image, x, y, width, height, null);
 	} else {
 		g.setColor(Color.BLUE);
 		g.fillRect(x, y, width, height);
 	}

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
