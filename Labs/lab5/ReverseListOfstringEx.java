import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListOfstringEx {

    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        
        stringList.add("Geeta");
        stringList.add("Ramcharitmanas");
        stringList.add("Rich Dad Poor Dad");
        stringList.add("Wings of Fire");

        System.out.println("List before Reverse: "+stringList);
        System.err.println();
        Collections.reverse(stringList);
        System.out.println("List after Reverse: "+stringList);


    }
    
}
