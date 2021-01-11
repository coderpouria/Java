import java.util.Scanner;

public class JavaProject0001 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.format("The number is %d.\n", n);
        System.out.format("The number is %8d.\n", n);
        System.out.format("The number is %08d.\n", n);
        System.out.format("The number is %08d.\n", n);
        System.out.format("The number is %,d.\n", n);
        System.out.format("The number is %,8d.\n", n);
        System.out.format("The number is %0,8d.\n\n", n);
        
        double pi = Math.PI;
        System.out.format("pi = %f\n", pi);
        System.out.format("pi = %.2f\n", pi);
        System.out.format("pi = %8.4f\n", pi);
        System.out.format("pi = %8.2f\n", pi);
        System.out.format("pi = %-8.4f\n", pi);
        System.out.format("pi = %-8.2f\n", pi);
        
        System.out.println("\nPress enter to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}
