import javax.swing.*;

public class JavaProject0020App {
    public static void main(String[] args) {
        String ans = JOptionPane.showInputDialog("Please enter an integer:");
        int n = Integer.parseInt(ans);
        String message;
        if (n % 2 == 0){
            message = "The entered number is an even number.";
        } else {
            message = "The entered number is an even number.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
    
}
