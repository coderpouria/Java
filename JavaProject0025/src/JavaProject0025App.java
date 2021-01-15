import java.util.*;

public class JavaProject0025App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Solving equation a*x^2 + b*x + c=0.\n");
        
        System.out.print("Enter a: ");
        double a = input.nextFloat();
        
        System.out.print("Enter b: ");
        double b = input.nextFloat();
        
        System.out.print("Enter c: ");
        double c = input.nextFloat();
        
        EquationSolver.SolveEq2(a, b, c);
        
        System.out.println("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
    
}
