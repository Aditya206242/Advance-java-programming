import java.util.Scanner;

class TryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a ,b,c;
        a= sc.nextInt();
        System.out.println("Enter the second number: ");
        b =sc.nextInt();
        
        try{
            c=a/b;
            System.out.println("c is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("AirthmeticException "+e);

        }

    }

}
    