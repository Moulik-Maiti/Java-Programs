
interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

class Salary extends Employee implements Gross {
    double basicSalary;
    double allowance;

    Salary(String name, int empId, double basicSalary, double allowance) {
        super(name, empId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    @Override
    public double calculateGross() {
        return basicSalary + allowance;
    }

    void displaySalarySlip() {
        displayEmployeeInfo();
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowance: $" + allowance);
        System.out.println("Gross Salary: $" + calculateGross());
    }
}
 public class Main {
    public static void main(String[] args) {
        Salary empSalary = new Salary("Moulik Maiti", 101, 50000.0, 5000.0);
        
        System.out.println("--- Employee Salary Details ---");
        empSalary.displaySalarySlip();
    }
}
