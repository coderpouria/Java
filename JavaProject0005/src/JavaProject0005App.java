import java.util.*;
public class JavaProject0005App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        String type = (n % 2 == 0) ? "even" : "odd";
        
        System.out.format("The number %d is an %s number.\n", n, type);
        
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
