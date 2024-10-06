import java.util.Scanner;

public class CheckVoteElig {
    public static void isEligible(int n){
        if(n>=18){
            System.out.println("you are eligible for vote");
        }
        else{
            throw new ArithmeticException();
        }

    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a;
        a= sc.nextInt();
        try{
            isEligible(a);
        }
        catch(ArithmeticException e){
            System.out.println("you cannot vote");

            
        }
    }
    
}
