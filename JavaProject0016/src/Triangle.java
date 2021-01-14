public class Triangle {
    private double a;
    private double b;
    
    public Triangle(double a1, double b1){
        set_a(a1);
        set_b(b1);
    }
    
    public double get_a(){
        return a;
    }
    public final void set_a(double value){
        a = Math.abs(value);
    }
    
    public double get_b(){
    return b;
    }
    public final void set_b(double value){
        b = Math.abs(value);//قدر مطلق
    }
    
    public double get_c(){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }
    
    public double get_Area(){
        return (a*b)/2;
    }
    
    public double get_theta(){
        return Math.atan2(b, a)* 180/Math.PI;
    }
    
    public double get_phi(){
        return Math.atan2(a, b)* 180/Math.PI;
    }
    
    public void PrintInfo(){
        //System.out.println("Triangle: ");
        System.out.format("a = %f\t b = %f\t c = %f\t S = %f\t theta = %f\t phi = %f\n", a, b, get_c(), get_Area(), get_theta(), get_phi());
    }
}
