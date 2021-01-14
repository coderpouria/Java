import javax.swing.*;

public class JavaProject0019App {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println(ans);
        String message = String.format("Hi %s!\nWelcome to Java programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
