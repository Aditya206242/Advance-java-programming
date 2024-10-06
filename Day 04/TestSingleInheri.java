class Animal{
    // method
    
    void eats(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    
    void barks(){
        System.out.println("dogs barks ");
    }
}
public class TestSingleInheri {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eats();
        d.barks();
    }
    
}
