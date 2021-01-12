import java.util.*;

public class JavaProject0015App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficients of equation: a*x + b =0");
        
        System.out.print("Enter a: ");
        double a = input.nextFloat();
        System.out.print("Enter b: ");
        double b = input.nextFloat();
        
        EquationSolver.SolveEq1(a, b);
        
        System.out.println("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
}