class Area{
    double l;
    double b;

    Area(double l,double b){
        this.l = l;
        this.b= b;

    }
    void show(){
        System.out.println("Area is "+(l*b));
    }

}
public class This {
    public static void main(String[] args){
        Area a = new Area(2.0,3.5);;
        a.show();

    }
    
    
}
