import java.util.ArrayList;
public class Arraylistdec{
    public static void main(String[] args) {
      //  List<String> al = new ArrayList<String>();
      ArrayList<String> al=new ArrayList<String>();
      al.add("Red");
      al.add("queen");
      al.add("blue");
      System.out.println(al);

      ArrayList<String> al1 = new ArrayList<String>();
      al1.add("ravi");
      al1.add("manju");
      al1.add("rahul");
       al.addAll(al1);// al me add ho jayega last me al1;
      System.out.println(al);

      al1.add("riju");
      al.addAll(0,al1); // shure me add hoga sab
      System.out.println(al);




      // remove function 
      al.remove(1); //remove first index element 
      System.out.println(al);
      System.out.println(al.isEmpty());

      // remove all method 
      al.removeAll(al1);
      System.out.println(al.isEmpty());
      System.out.println(al); // remove al1 element from al
     // al.clear();
      System.out.println(al);// it will delete all the element from al so print 



      // isEmpty method  true or false;
      System.out.println(al.isEmpty());


      // set method (override the  value)
     al.set(1,"Aditya"); // it will replace 1 index value of aditya (not shifting like add method)
     System.out.println(al);


     // get method 


     // retainAll method (to print common element (intersection ))
     ArrayList<String> al2= new ArrayList<String>();
     al2.add("mannu");
     al2.add("bannu");
     al2.add("Aditya");
     al.retainAll(al2); // jo al2 or al dono me hai bo al me bachega sirf 
     System.out.println(al);



     
     
     
     // contains method  (checking element is present or not)
     
     ArrayList<String>al3 = new ArrayList<String>();
     al3.add("Nitu");
     al3.add("Rahul");
     al3.add("Kavita");
     al3.add("Soham");
     System.out.println(al3.contains("Soham")); // check Soham is present or not
     al.addAll(al3);
     System.out.println(al);


     // containsAll method (it will take collection); check sare element contain kar raha hia
     System.out.println(al.containsAll(al3));  // ture return dega al (al contain kar raha hoga sare element al3)

     



     


      


     


    }
}