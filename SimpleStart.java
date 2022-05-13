/* File: ExampleT1.java
   U.Wolz 1999
   For Assignment 3, CMSC 230, The College of New Jersey. All rights reserved.
   This code may be used if properly acknowledged.
*/
import java.awt.*;
import java.applet.Applet;

public class SimpleStart extends Applet {
 
 public void paint(Graphics g) {
 
  DrawTurtle t = new DrawTurtle(this);
  t.home();
  
  //squiral
  
t.Squiral(0, 24, 10);
  /*
  int forward = 10;
  for (int i=0; i<23; i++)
  {
  t.left(90);
  t.forward(forward);
  forward += 10;
  }
  t.left(90);
  t.forward(forward/2);
  
  */
  
  //tree fractal
    
  }
  
   
  
}