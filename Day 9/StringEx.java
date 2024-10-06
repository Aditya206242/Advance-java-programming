public class StringEx {
    public static void main(String[] args) {
         // why string is immutable 
      String s = "Aditya";
      s.concat("kumar");
      System.out.println(s); // print Aditya only

      s = s.concat(" kumar"); // now print Aditya kumar 
      System.out.println(s);
    }
    
}
