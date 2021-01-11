import java.util.Scanner;
public class JavaProject0002App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        if (n == 6) {
            System.out.println("You have entered 6!");
        } else {
            System.out.println("You have not entered 6!");
        }
        
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
