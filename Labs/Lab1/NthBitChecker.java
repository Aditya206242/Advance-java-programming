import java.util.Scanner;

public class NthBitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit position (n): ");
        int n = sc.nextInt();

       
        String result = ((num & (1 << n)) != 0) ? "Set (1)" : "Not set (0)";

      
        System.out.println("The " + n + "th bit of the number " + num + " is: " + result);
    }
}
