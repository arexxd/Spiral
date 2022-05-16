import java.awt.*;
import java.applet.Applet;
public class Triangle extends Applet
{
    public void paint(Graphics g)
    {
        DrawTurtle t = new DrawTurtle(this);
        t.home();
        t.penDown();
        t.right(30);
        Triangle(t, 10, 50);
    }
    public void Triangle(DrawTurtle d, int level, int x)
    {
        if(level > 1)
        {
            d.penDown();
            d.forward(x);
            double x1 = d.cx;
            double y1 = d.cy;
            double h1 = d.ch;
            d.forward(x);
            d.right(120);
            d.forward(x);
            double x2 = d.cx;
            double y2 = d.cy;
            double h2 = d.ch;
            d.forward(x);
            d.right(120);
            d.forward(x);
            double x3 = d.cx;
            double y3 = d.cy;
            double h3 = d.ch;
            d.forward(x);
            d.right(120);
            d.cx = x1;
            d.cy = y1;
            d.ch = h1;
            Triangle(d, level - 1, x/2);
            d.cx = x2;
            d.cy = y2;
            d.ch = h2;
            Triangle(d, level - 1, x/2);
            d.cx = x3;
            d.cy = y3;
            d.ch = h3;
            Triangle(d, level - 1, x/2);
        }
    }
}