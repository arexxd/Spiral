/* File: ExampleT1.java
   U.Wolz 1999
   For Assignment 3, CMSC 230, The College of New Jersey. All rights reserved.
   This code may be used if properly acknowledged.
*/
import java.awt.*;
import java.applet.Applet;

public class SimpleStart extends Applet {
 
 public void paint(Graphics g) {
 
   
   /* this is spiral
 DrawTurtle t = new DrawTurtle(this);
 t.home();
 t.penDown();
 spiral(t,5000,50,5);
  */
   
   
/*
 DrawTurtle t = new DrawTurtle(this);
 t.home();
 t.penDown();
 squirrel(t,20,90,90);
 */
   /*
 DrawTurtle rish = new DrawTurtle(this);
 rish.home();
 rish.penDown();
 fractal(rish, 8, 150, 40);
  */
   
     DrawTurtle Sierpy = new DrawTurtle(this);
 Sierpy.home();
 Sierpy.penDown();
 sierTriangle(Sierpy, 8, 500, 120);
 
 
 
  }
 

 
 
 
 
 public void spiral(DrawTurtle timmy, int level, double d, int a){
 if(level > 2)
   spiral (timmy, level -1, d- 0.01, a);
 
 timmy.forward(d);
 timmy.left(a);
 }
 
 
 public void squirrel(DrawTurtle timmy, int level, double d, int a){
 if(level > 2)
   squirrel (timmy, level -1, d- 5, a);
 
 timmy.forward(d);
 timmy.left(a);
 }
 
 public void fractal(DrawTurtle rish, int branches, double d, int angle){
        if (branches > 1){
           
            rish.forward(d);
            double x = rish.getX();
            double y = rish.getY();
            double a = rish.getH();
           
            rish.right(angle);
           
            fractal(rish, branches - 1, d * .6, angle);;
     
           
            rish.cx = x;
            rish.cy = y;
            rish.ch = a;

            rish.left(angle);
            fractal(rish, branches - 1, d * .6, angle);
        }
       
    }
 