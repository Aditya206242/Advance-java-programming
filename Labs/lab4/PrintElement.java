import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintElement {
    public static void main(String[] args) {
        
        ArrayList<Integer>arr = new ArrayList<>();

        // initiaze the array form 1 to 100
        for(int i=0;i<100;i++){
            arr.add(i+1);
        };

        // pirnt the element 
        for(Integer element : arr){
            System.out.print(element+" ");
        }


    }
    
}
