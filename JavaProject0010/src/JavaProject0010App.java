import java.util.*;
public class JavaProject0010App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        double x = input.nextFloat();
        int counter = 0;
        int counter_max = 3;
        while((x > 1) && (counter < counter_max)){
            System.out.format("%f\n",x);
            x /= 2 ;
            counter++;
        }
        
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}