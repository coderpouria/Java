public class EquationSolver {
    //Solve a*x + b = 0;
    public static void SolveEq1(double a, double b){
        double x = -b/a;
        System.out.print("Solving equation: ");
        System.out.format("%f * x + %f = 0\n",a ,b);
        System.out.format("Results: \nx = %f\n", x);
    }
}
