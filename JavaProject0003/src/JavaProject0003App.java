import java.util.*;
public class JavaProject0003App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer:\t");
        int n = input.nextInt();
        if (n % 2 == 0)
            System.out.format("%d is an even number.\n", n);
        else
            System.out.format("%d is an odd number.\n", n);
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
