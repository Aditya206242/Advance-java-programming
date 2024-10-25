public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        
        int[] arr = {2,33,5,4,3};
        // try to attempt element beyond the last index

        try{
            for(int i=0;i<=arr.length;i++){
                // print the element at the current index; 
                System.out.println("Element at index "+i +":" +arr[i]);

           
        }
      }
    catch (ArrayIndexOutOfBoundsException e) {
       // TODO: handle exception
       System.out.println(e.getMessage());
   }
    }
    
}
