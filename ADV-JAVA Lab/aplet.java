import java.applet.Applet;
import java.awt.Graphics;

public class aplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 100, 100);
        g.drawOval(102,103,49,90);
        
    }
}
