import java.util.Scanner;

public class JavaProject0004App {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = a++;    // Postfix Increment Operator
        c = ++a;    // Prefix Increment Operator
        
        System.out.format("a = %d\n", a);
        System.out.format("b = %d\n", b);
        System.out.format("c = %d\n", c); 
        
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
