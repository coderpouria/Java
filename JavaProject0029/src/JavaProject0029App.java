import java.awt.Component;
import javax.swing.*;

public class JavaProject0029App {
    private static Component parent;
    public static void main(String[] args) {
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();

        Object[] message = {
            "What's your name?", field1,
            "How old are you?", field2,
            "Enter your height", field3,
            "Enter your weight", field4,
        };

        int option = JOptionPane.showConfirmDialog(parent, message, "BMI", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION)
            {
                String name = field1.getText();
                String old = field2.getText();
                String heigh = field3.getText();
                String weigh = field4.getText();
                int age = Integer.parseInt(old);
                double height = Integer.parseInt(heigh);
                double weight = Integer.parseInt(weigh);
                double bmi = weight / height / height *10000;
                JOptionPane.showMessageDialog(null, "My name is "+ name + ".\nI am "+ age + " y.o.\n"
                + "I am "+ height +"CM.\n"+ "I am "+ weight +"KG.\n"+ "BMI is "+ bmi +".");
            } else {
            System.exit(0);
            }
    }
}
