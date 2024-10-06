public class FindAnnual {

    public class User{
        int id;
        String name;

        User(int id ,String name){
            this.id = id;
            this.name =name;
        }

        // getter method for Id
        public int GetId(){
            return id;
        }

        // getter method for name
        public  String GetName(){
            return name ;
        }

        
    }
    class  Employee extends User{

        private double salary;

        // constructor for employee
        public Employee(int id,String name, double salary){
            // call the super class (user) constructor
            super(id,name);
            this.salary = salary;

        }

        // method to calculate anual salary
        public double calculateAnnualSalary(){
            return salary*12;
        };



        public void setSalary(double salary){
            this.salary = salary;
        }

        //
        public double getSalary(){
            return salary;
        }

    }

    public static void main(String[] args) {
        FindAnnual findannual = new FindAnnual();
        Employee em = findannual.new Employee(2, "Aditya", 15000);

        // calculate anually salary
        double annualSalary = em.calculateAnnualSalary();

        System.out.println("Employee ID: " + em.GetId());
        System.out.println("Employee Name: " + em.GetName());
        System.out.println("Monthly Salary: " + em.getSalary());
        System.out.println("Annual Salary: " + annualSalary);

    }
    
}
