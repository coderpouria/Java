import java.util.*;
public class JavaProject0031App {
    public static void main(String args[ ]){
		System.out.println("Program to show smallest number");
                Scanner input = new Scanner(System.in);
                
                System.out.println("Enter an integer number:");
                int a = input.nextInt();
                
                System.out.println("Enter an integer number:");
                int b = input.nextInt();
                
                System.out.println("Enter an integer number:");
                int c = input.nextInt();
                
                System.out.println("Enter an integer number:");
                int d = input.nextInt();
		/* Conditional statement */
		if(a < b) {
			if(a < c) {
				if(a < d)
					System.out.println("Smallest Number is: "+a);
				else
					System.out.println("Smallest Number is: "+d);
			}
			else {
				if(c < d)
					System.out.println("Smallest Number is: "+c);
				else
					System.out.println("Smallest Number is: "+d);
			}
		}
		else {
			if(b < c) {
				if(b < d)
					System.out.println("Smallest Number is: "+b);
				else
					System.out.println("Smallest Number is: "+d);
			}
			else {
				if(c < d)
					System.out.println("Smallest Number is: "+c);
				else
					System.out.println("Smallest Number is: "+d);
			}
		}
	}
}
