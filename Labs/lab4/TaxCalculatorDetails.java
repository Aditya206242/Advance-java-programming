// Custom Exception Classes
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator Class
class TaxCalculator {
    public double calculateTax(String empName, double empSal, boolean isIndian)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        
        // Throw exception if employee is not Indian
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        // Throw exception if employee name is null or empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        // Business logic for tax calculation
        double taxAmount = 0;
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal > 30000 && empSal <= 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000 && empSal <= 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }

        return taxAmount;
    }
}

// Main class: CalculatorSimulator
public class TaxCalculatorDetails {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        // Test Case 1: Ron, 34000, False (not Indian)
        try {
            System.out.println("Test Case 1");
            System.out.println("Tax amount is: " + calculator.calculateTax("Ron", 34000, false));
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 2: Tim, 1000, True (Indian)
        try {
            System.out.println("Test Case 2");
            System.out.println("Tax amount is: " + calculator.calculateTax("Tim", 1000, true));
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 3: Jack, 55000, True (Indian)
        try {
            System.out.println("Test Case 3");
            System.out.println("Tax amount is: " + calculator.calculateTax("Jack", 55000, true));
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 4: Empty name, 30000, True (Indian)
        try {
            System.out.println("Test Case 4");
            System.out.println("Tax amount is: " + calculator.calculateTax("", 30000, true));
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }
    }
}
