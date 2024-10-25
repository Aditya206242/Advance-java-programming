import java.util.Scanner;

public class SumofAllEvenNum {

    // create a funtion to check prime 
    boolean isPrime(int n){
        
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    int printSumOfAllEvenNum(int[] arr){
        
        int size = arr.length;
        int sum = 0;
        
        for(int i=0;i<size;i++){
            if(isPrime(arr[i])){
                sum = sum+arr[i];
            }
        }
        return sum;

        
        

    }
    public static void main(String[] args) {
        
        System.out.println("enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the element of the array: ");

        // way to initiliaze arr
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
           arr[i]=  sc.nextInt();
        }

        // create a instance of the class to call the non static methods
        SumofAllEvenNum obj = new SumofAllEvenNum();

        // calll the function
        int sumOfprime =obj.printSumOfAllEvenNum(arr);
        System.out.println("sum of prime number is : "+sumOfprime);

        sc.close();


    }

    
}
