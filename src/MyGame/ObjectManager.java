package MyGame;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	MainCar main;
      ArrayList<OtherCars> others = new ArrayList<OtherCars>();
     
      Random random = new Random();
      public ObjectManager(MainCar main) {
     
   	this.main=main;
   	   
      }
     
      
      void update(){
   	   for(int i = 0; i < others.size(); i++) {
   		  others.get(i).Update();
   		   
   	   }
   	   
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
   	   
      }}

