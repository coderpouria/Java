import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.yellow);
        g.fillRect(20, 20, 200, 150);
        
        g.setColor(Color.red);
        g.drawRect(20, 20, 200, 150);
        
        g.drawRect(250, 20, 100, 100);
        g.drawOval(250, 20, 100, 100);
        
        g.setColor(Color.green);
        g.fillOval(50, 200, 150, 150);
        
        g.setColor(Color.cyan);
        g.drawString("Welcome to Java", 50, 50);
        }
    }

