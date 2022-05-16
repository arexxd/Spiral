import java.awt.*;
import java.applet.Applet;

public class TreeFractal extends Applet {


    public void paint(Graphics x) {
        int run;
        run =0;
        DrawTurtle y = new DrawTurtle(this);
        y.home();
        y.penDown();

        tree(y, 7, 50, 45);
    }
    public void tree(DrawTurtle y, int level, int w, int a)
    {
        y.forward(w);
        y.right(a);
        if(level>1)
        {
            tree(y, level - 1, w/2, a);
            y.back(w/2);
            y.left(a*2);
            tree(y, level - 1, w/2, a);

        }
        else if(level==1)
        {
            y.forward(w/2);
            y.back(w/2);
            y.left(a*2);
            y.forward(w/2);


        }
        y.back(w/2);
        y.right(a);

    }
}