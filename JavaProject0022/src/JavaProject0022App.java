import javax.swing.*;

public class JavaProject0022App {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame app = new JFrame();
        app.setTitle("Interesting Lines");
        app.add(panel);
        app.setSize(400,400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    
}
