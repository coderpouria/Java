
public class Complex {
    private double Real;
    private double Imag;
    
    public Complex(double x){
        Real = 0;
        Imag = 0;
    }
    
    public Complex(double x, double y){
        Real = x;
        Imag = y;
    }
    
    public double getReal(){
        return Real;
    }
    public void setReal(double x){
        Real = x;
    }
    
    public double getImag(){
        return Imag;
    }
    public void setImag(double y){
        Imag = y;
    }
    @Override
    public String toString(){
        /* String str = String.format("%f + %fi", Real, Imag);
        return str; // OR=> return String.format("%f + %fi", Real, Imag); */
        String str;
        
        double x = Real;
        double y = Imag;
        
        if( x != 0){
            str = String.format("%f", x);
            if (y > 0){
                str = str + String.format("+%fi", y);
            } else if (y < 0) {
                str = str + String.format("%fi", y);
            }
        } else {
            if (y != 0){
                str = String.format("%fi", y);
            } else {
                str = String.format("%f", x);
            }
        }
        return str;
    }
}
