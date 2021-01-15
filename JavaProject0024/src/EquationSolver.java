public class EquationSolver {
    public static void SolveEq1(double a, double b){
        double x = -b/a;
        System.out.format("Where a = %f and b = %f.\n",a,b);
        System.out.print("Solution: ");
        System.out.format("x = %f\n", x);
    }
}
