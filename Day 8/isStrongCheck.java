import java.util.Scanner;

public class isStrongCheck {

    public int facto(int n){
        int fact= 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            

        }
        return fact;
    }
    public boolean isStrong(int n){
        int digit = 0;
        int sumOFfacto=0;
        int orininal = n;
        
        while(n!=0){
            digit = n%10;
            sumOFfacto = sumOFfacto+ facto(digit);
            n = n/10;
            


        }
        if(sumOFfacto == orininal){
            return true;
        }
        else{
            return false;
        }
       
        

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        n = sc.nextInt();

        isStrongCheck obj = new isStrongCheck();

        if(obj.isStrong(n)){
            System.out.println(n +" is strong number");
            
        }
        else{
            System.out.println(n +" is not strong number");

        }
        
    }

    
}
