// method overriding   (virtual polymorphism not real polymorphims)
class Plane{
    void fly(){
        System.out.println("The plane is flying ");
    }    
}
class CargoPlane extends Plane{
    void fly(){
        System.out.println("The cargoPlane is flying in high speed");
    }
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("Fighter Plane is flying in very high speed");
    }
}

public class PolymorCompileTime{
    public static void main(String[] args){
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        cp.fly();
        fp.fly();
    }
}