import java.util.Scanner;
public class JavaProject0032App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numeric Pyramid");
        System.out.print("Enter a number:");
        int n = input.nextInt();
        /* Loop the process */
	for(int i=0; i <= n; i++) {
            /* Nested loop */
            for(int j=1; j <= i; j++){
                System.out.print(i+" ");
                System.out.println("");
            }
	}
        System.out.print("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
}