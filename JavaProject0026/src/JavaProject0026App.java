import java.util.*;
public class JavaProject0026App {
    private static Object input;
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextFloat();
        
        System.out.print("Enter y: ");
        double y = input.nextFloat();
        
        Complex z1 = new Complex(x, y);
        
        System.out.format("z1 = %s\n", z1); // System.out.format("z1 = %s\n", z1.toString());
        
        System.out.println("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
    
}
