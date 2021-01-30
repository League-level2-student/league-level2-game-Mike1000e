package MyGame;

import java.awt.Rectangle;

public class GameObject {
	int x;
	 int y;
	 int width;
	 int height;
	 int speed = 0;
	 boolean isActive = true;
	 Rectangle collisionBox;
	public GameObject(int x, int y, int width, int height) {
	this.x=x;
	this.y=y;
	this.height=height;
	this.width=width;
		
	collisionBox= new Rectangle(x,y,width,height);
	}
	void Update() {
		
		
		
		collisionBox.setBounds(x, y, width, height);
	}
}
