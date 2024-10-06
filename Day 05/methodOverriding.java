class Printer{
    void print(int a){
        System.out.println(a);
    }

    void print(String n){
        System.out.println(n);
        
    }

    void print(int a,int b){
        System.out.println(a+b);
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(5);
        p.print("Aditya");
        p.print(4, 8);
    }

    
}
