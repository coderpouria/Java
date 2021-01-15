public class EquationSolver {
        public static void SolveEq2(double a, double b, double c){
        double delta = b*b - 4*a*c;
        
        System.out.format("Where a = %f and b = %f and c = %f\n",a,b,c);
        System.out.print("Solution: ");
        
        if( delta>0 ){
            //two distiinced real roots
            double x1 = ( -b+Math.sqrt (delta))/(2*a);
            double x2 = ( -b-Math.sqrt (delta))/(2*a);
            
            System.out.format("x1 = %f, x2 = %f\n", x1, x2);
        } else if ( delta == 0 ){
            //a real double root
            double x = -b/(2*a);
            System.out.format("x = %f\n", x);
        } else {
            //no real roots
            System.out.println("The equation has not any roots.\n");
        }
    }
        
}
