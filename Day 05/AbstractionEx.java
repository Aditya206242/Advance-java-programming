abstract class Animal{
    void eat(){
        System.out.println("Animal is eatting");
    }

   // abstracted method to implement subclass
    abstract void speaks();
}
class Cat extends Animal{
    void speaks(){
        System.out.println("cats mewos");
    }


}


public class AbstractionEx {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.speaks();
    }
   
    

    
}
