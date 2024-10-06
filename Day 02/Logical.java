public class Logical {
    public static void main(String[] args){
        int a= 4,b=6,c=2;
        System.out.println(a>c&& (b==5)); // return false
        System.out.println(a>c || (b==5));// return true; atleast one condition should be ture
        System.out.println(!(a>c || (b==5)));//  return false
        

    }
    
}
