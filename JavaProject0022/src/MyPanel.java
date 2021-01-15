import java.awt.*;
import javax.swing.*;
public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int n = 25;
        int w = getWidth();
        int h = getHeight();
        //int sx = w/n;
        //int sy = h/n;
        int i,j;
        for( i = 0; i <= n; i++){
            j = n - i;
            //g.drawLine(i*sx, 0, 0, j*sy);
            
            g.setColor(Color.red);
            g.drawLine(i*w/n, 0, 0, j*h/n);
            
            g.setColor(Color.blue);
            g.drawLine(i*w/n, h, w, j*h/n);

        }
    }
}
