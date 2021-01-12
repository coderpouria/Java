import java.util.Scanner;

public class JavaProject0013App {
    public static void main(String[] args) {
        for (int i=0; i<10 ; i++){
            System.out.format("%d\t%d\n", i, i*i);
        }
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
