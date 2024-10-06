   

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

class Cat extends Animal{
    void speaks(){
        System.out.println("cat mewos");
    }
}
public class TesthybridInheri {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eats();
        d.barks();
        
        Cat c = new Cat();
        c.eats();
        c.speaks();
    }
    
}
