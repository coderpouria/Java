import javax.swing.*;

public class JavaProject0023App {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame app = new JFrame();
        app.setTitle("Shapes");
        app.add(panel);
        app.setSize(400,400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    
}
