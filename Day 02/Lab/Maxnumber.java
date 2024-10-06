import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the first number: ");
        a= sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b;
        b =sc.nextInt();
        
        int max = a<b?b:a;
        System.err.println("max is "+max);


    }
    
}
