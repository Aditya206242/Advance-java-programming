import java.util.Scanner;

public class CheckLeapYear {

    public boolean isLeapYear(int n){
         
        if(n%400==0){
           return true;
        }
        else if(n%4==0){
            if(n%100!=0){
                return true;
            }
        }
        return false;
       

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        CheckLeapYear obj = new CheckLeapYear();
        if(obj.isLeapYear(n)){
            System.out.println(n+" is leap year");

        }
        else{
            System.out.println(n+" is not leap  year");
        }
    }
    
}
