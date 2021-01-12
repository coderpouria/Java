import java.util.*;
public class JavaProject0012App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x;
        String ans;
        while(true){
            System.out.print("Enter a number: ");
            x = input.nextFloat();
            System.out.format("%f\t%f\t%f\t\n", x, Math.pow(x, 2), Math.pow(x, 3));
            System.out.print("Do you want to continue[Y/N]? ");
            ans = input.next();
            if (!(ans.startsWith("y") || ans.startsWith("Y"))) break;
            
        }
    }
    
}
