import java.util.*;
public class JavaProject0008App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer [1 to 7]: ");
        int n = input.nextInt();
        String day = "";
        String type = "";
        switch (n){
            case 1:
                day  = "Saturday";
                break;   
            case 2:
                day = "Sunday";  
                break;                
            case 3:
                day = "Monday";
                break;               
            case 4:
                day = "Tuesday";
                break;
            case 5:
                day = "Wednesday";
                break;              
            case 6:
                day = "Tursday";
                break;                
            case 7:
                day = "Friday";
                break;        
        }
        //case grouping
        switch (n){
            case 1:
            case 3:
            case 5:
                type = "Even";
                break;   
            case 2:
            case 4:
            case 6:
                type = "Odd";
                break;                                             
        }
        if (!"".equals(day)){
            System.out.format("The day #%d in week is: %s.\n",n, day);
            if (!"".equals(type)){
                System.out.format("%s is an %s day.", day, type);
            }else {
                System.out.format("%s is not Even or Odd day.", day);
            }
        } else {
            System.out.println("You have entered an invalid number.");
        }
        
        System.out.println("\nPress enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}
