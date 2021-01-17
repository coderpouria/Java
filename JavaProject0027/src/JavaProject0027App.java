import java.util.*;
public class JavaProject0027App {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String name = input.nextLine();
    
    System.out.print("Please enter your age: ");
    int age = input.nextInt();    
    
    System.out.print("Please enter your height: ");
    double height = input.nextFloat();
    
    System.out.print("Please enter your weight: ");
    double weight = input.nextFloat();
    
    // Calculate the BMI and assign it into the bmi variable
    double bmi = weight / height / height *10000;
    
    // Print name, age, height, weight, and BMI
    System.out.format("My name is %s\n", name);
    System.out.format("I am %s years old\n", age);
    System.out.format("My height is %s meters\n", height);
    System.out.format("My weight is %s kilograms\n", weight);
    System.out.format("My BMI is %4.2f", bmi);
    
    System.out.println("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
    
}
