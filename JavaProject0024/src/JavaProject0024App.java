import java.util.*;

public class JavaProject0024App {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Solving equation a*x+b=0.\n");
        
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
