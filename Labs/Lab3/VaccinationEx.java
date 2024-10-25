public class VaccinationEx {
    
    // Abstract class Vaccine inside VaccinationEx
    abstract class Vaccine {
        // Instance variables
        int age;
        String nationality;
        boolean firstDoseCompleted = false; // To track if the first dose is completed

        // Constructor to initialize age and nationality
        public Vaccine(int age, String nationality) {
            this.age = age;
            this.nationality = nationality;
        }

        // Concrete method for the first dose
        public void firstDose() {
            if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
                System.out.println("First dose administered. Please pay 250 Rs.");
                firstDoseCompleted = true; // Mark that first dose is completed
            } else {
                System.out.println("You are not eligible for the first dose.");
            }
        }

        // Concrete method for the second dose
        public void secondDose() {
            if (firstDoseCompleted) {
                System.out.println("Second dose administered successfully.");
            } else {
                System.out.println("You need to take the first dose before the second dose.");
            }
        }

        // Abstract method for booster dose
        public abstract void boosterDose();
    }

    // Subclass VaccinationSuccessful inside VaccinationEx
    class VaccinationSuccessful extends Vaccine {

        // Constructor to initialize age and nationality
        public VaccinationSuccessful(int age, String nationality) {
            super(age, nationality); // Calling the superclass constructor
        }

        // Implementing the boosterDose method
        @Override
        public void boosterDose() {
            if (firstDoseCompleted) {
                System.out.println("Booster dose administered successfully.");
            } else {
                System.out.println("You are not eligible for the booster dose. Please complete the first two doses.");
            }
        }
    }

    // Main method inside VaccinationEx
    public static void main(String[] args) {
        // Create an instance of the outer class
        VaccinationEx outer = new VaccinationEx();
        
        // Create an instance of the inner class VaccinationSuccessful with age and nationality
        VaccinationSuccessful vaccination = outer.new VaccinationSuccessful(20, "Indian");

        // Invoke the methods
        System.out.println("=== Starting Vaccination Process ===");
        
        // First dose
        vaccination.firstDose();  // Scenario 1

        // Second dose
        vaccination.secondDose(); // Scenario 2

        // Booster dose
        vaccination.boosterDose(); // Scenario 3

        System.out.println("=== Vaccination Process Completed ===");
    }
}
