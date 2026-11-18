import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(50, 50, 200, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Line");
        f.add(new DrawShapes());
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
