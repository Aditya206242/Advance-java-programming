import java.util.Scanner;

public class SumOfdigit {
     public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        int sum = 0;
        n = sc.nextInt();
        while(n!=0){
            int digit = n%10;
            
            sum = sum+digit;
            n = n/10;
            
        }
        System.out.println(sum);
    }
    
}
