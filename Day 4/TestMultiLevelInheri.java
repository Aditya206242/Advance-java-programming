
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

class BullDog extends Dod{
    void runs(){
        System.out.println("Bull dog run fast");
    }
}
public class TestMultiLevelInheri {
    public static void main(String[] args){
        BullDog d = new BullDog();
        d.eats();
        d.barks();
        d.runs();
    }
    
}
