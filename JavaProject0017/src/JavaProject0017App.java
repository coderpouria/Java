
public class JavaProject0017App {
    public static void main(String[] args) {
        String s = "Welcome to Java Programing!";
        System.out.format("String is: %s\n",s);
        System.out.format("Length = %d\n", s.length());
        System.out.format("Is empty: %s\n", s.isEmpty());
        System.out.format("Char at position 3: %s\n", s.charAt(3));
        System.out.format("Lower case: %s\n", s.toLowerCase());
        System.out.format("Upper case: %s\n", s.toUpperCase());
        System.out.format("First space index %d\n", s.indexOf(' '));
        System.out.format("Ends with !: %s\n", s.endsWith("!"));
        System.out.format("Ends with .: %s\n", s.endsWith("."));
        
        System.out.print("\nPress enter to continue...");
        try {
            System.in.read();
        }
        catch (Exception ex){}
    }
}
