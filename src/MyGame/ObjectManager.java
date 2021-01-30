package MyGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager  implements ActionListener {
	MainCar main;
      ArrayList<OtherCars> others = new ArrayList<OtherCars>();
     
      Random random = new Random();
      public ObjectManager(MainCar main) {
     
   	this.main=main;
   	   
      }
      void AddCars() {
   	   others.add(new OtherCars(random.nextInt(ProjectManager.width),700,50,115));
      }
      void update(){
    	    	   for(int i = 0; i < others.size(); i++) {
   		  others.get(i).Update();
   		  
   	   }
   	 checkCollision();
	   purgeObject();
   		   
   	   }
  
	   
 
      
      void draw(Graphics g) {
   	   main.draw(g);
   	   for(int i = 0; i < others.size(); i++) {
    		  others.get(i).draw(g);
    		   
    }}
      void purgeObject() {
   	 
    	   for(int i = 0; i < others.size(); i++) {
      		  if(others.get(i).isActive==false) {
      			others.remove(i) ; 
      		  }
      		  
      	   } 
   	   
      }



	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AddCars();
	}
	public void checkCollision(){
	
			
     	   
    	   for(int i = 0; i < others.size(); i++) {
    		   if(others.get(i).collisionBox.intersects(main.collisionBox)) {
   				main.isActive=false;
   				others.get(i).isActive=false;
   				
   			}
        	   } 

      		  
      	   
    	   
    	   
    	   
    
        	  
       	   for(int i = 0; i < others.size(); i++) {
         		  if(others.get(i).isActive==false) {
         			others.remove(i) ; 
         		  }
         		  
         	   } 
      	   
	}	
}

