class Area{

    // default constructor
    Area(){  
        System.out.println("Area of rectangle : ");
        
    }

    // paramertiaze constructor 
    Area(double l,double b){
        System.out.println("Area of rectangle is : "+(l*b));
    }
}
public class Constructor {
    public static void main(String[] args){
        Area a = new Area();
        Area a1 = new Area(3.5,2.0);
        
    }
    
}
