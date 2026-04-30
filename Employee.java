interface Gross {
    double calculateGross();
}

class Employee {
    String empName = "Amit";
    int empId = 101;
}

class Salary extends Employee implements Gross {
    double basic = 30000;
    double hra = 5000;
    double da = 3000;

    public double calculateGross() {
        return basic + hra + da;
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Gross Salary: " + calculateGross());
    }

    public static void main(String[] args) {
        Salary s = new Salary();
        s.display();
    }
}
