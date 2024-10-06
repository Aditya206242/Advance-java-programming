import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;
    
    private void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();

        
    
    }

    // public method to display details 
    public void showInfo(){
        getInfo();
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
}
public class GetEmployeInfo {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee();
        
       
        emp.showInfo();  
    }
    
}
