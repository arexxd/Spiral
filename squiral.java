import java.awt.*;
import java.applet.Applet;

public class squiral extends Applet {
 
 public void paint(Graphics g) {
 
  DrawTurtle t = new DrawTurtle(this);
  t.home();
  t.penDown();
  t.right(90);
  hike(t, 24, 10, 90);
  }
   public void hike(DrawTurtle turtleman, int level, int d, int a)
   {
    if(level > 1)
      hike(turtleman, level - 1, d + 5, a);
    turtleman.right(a);
    if(level == 1)
    {
      turtleman.forward(d/2);
    }
    else{
      turtleman.forward(d);
    }
   }
}