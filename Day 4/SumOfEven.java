import java.util.Scanner;

public class SumOfEven{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        int sum = 0;
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);

    }
    
}