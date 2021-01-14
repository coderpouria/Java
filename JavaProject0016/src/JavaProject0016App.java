import java.util.*;

public class JavaProject0016App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = input.nextFloat();
        
        System.out.print("Enter b: ");
        double b = input.nextFloat();
        
        System.out.println("Triangle:");
        Triangle T1 = new Triangle(a, b);
        T1.PrintInfo();

        System.out.println("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }

}
