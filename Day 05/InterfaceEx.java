interface Animal{
    
    void eat();

    void speaks();
}
class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating ");
    }

    public void speaks(){
        System.out.println("Cat mewos");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.speaks();
        c.eat();
    }
    
}
