import java.util.Scanner;

public class AnimalEx {
    public class Animal{

        void makeSound(){
            System.out.println("The animal makes sound");

        }
    }

    public class Dog extends Animal{

        //override makesound
        void makeSound(){
            System.out.println("The Dog Barks");
        }
    }
    public class  Cat extends Animal {
        
        // overide makesound
        void makeSound(){
            System.out.println("The cat is Meows");
        }    
    }

    public static void main(String[] args) {

        System.out.println("Which animla would you like to create? (Dog/Cat)" );
        Scanner sc = new Scanner(System.in);
        
        
        String animalChoice = sc.nextLine();


        // create the instance of outeer class
        AnimalEx animal = new AnimalEx();

        // using the outer class create a inner class instance
        Animal A =null;
        if(animalChoice.equalsIgnoreCase("Dog")){
            A = animal.new Dog();
        }
        else if(animalChoice.equalsIgnoreCase("Cat")){
            A = animal.new Cat();

        }
        // else{
        //     System.out.println("invalid choice Please enter the either Dog or Cat");
        // }

        if (A != null) {
            A.makeSound(); // Call the method if valid object is created
        } else {
            System.out.println("Invalid choice. Please enter either Dog or Cat.");
        }

       
        
        sc.close();
       

        

    }
    
}
