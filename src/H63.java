import java.awt.*;
import java.applet.*;


public class H63 extends Applet {

    int maxint;
    int negative;

    public void init () {
        maxint = 2147483647;
        negative = maxint + 1;
    }

    public void paint(Graphics g) {

        g.drawString("De Negatieve int: " + negative, 20, 20);
    }
}