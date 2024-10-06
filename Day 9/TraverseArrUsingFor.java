import java.util.ArrayList;

public class TraverseArrUsingFor {
    public static void main(String[] args) {
         ArrayList<String>al3 = new ArrayList<String>();
     al3.add("Nitu");
     al3.add("Rahul");
     al3.add("Kavita");
     al3.add("Soham");
 

     // travese using for Each loop
     // yaha al3 ke sare element ek ek karke a me aayega or print karega 
     System.out.println("traverse the element using for Each loop");
     for(String a :al3){
        System.out.print(a+" ");
     }
     System.out.println();

     // traverse the element using for loop
     System.out.println("traverse the element using for  loop");

     for(int i=0;i<al3.size();i++){
        System.out.print(al3.get(i)+" ");
     }
        
    }
    
}
