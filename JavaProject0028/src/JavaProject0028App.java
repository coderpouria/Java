import javax.swing.*;
public class JavaProject0028App {
    public static void main(String[] args) {
        String ans = JOptionPane.showInputDialog("enter your age:");
        int age = Integer.parseInt(ans);
        
        String message;
        
        String ans2 = JOptionPane.showInputDialog("enter your height:");
        double height = Integer.parseInt(ans2);
        
        String ans3 = JOptionPane.showInputDialog("enter your weight:");
        double weight = Integer.parseInt(ans3);
        
        double bmi = weight / height / height *10000;
        JOptionPane.showMessageDialog(null, bmi);
    }
    
}
