import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
                
                case 2:
                
                System.out.println("two");
                break;
                
                default:
                System.out.println("you can one or two only ");
                break;
        }
    }
    
    
}
