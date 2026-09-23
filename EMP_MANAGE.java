abstract class Employee {

    static String company = "VK Technologies";
    public String department;
    private double salary;
    protected String designation;
    String location;

    Employee(String department, double salary,String designation, String location) {
    this.department = department;
    this.salary = salary;
    this.designation = designation;
    this.location = location;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void displayRole();

    void displayDetails() {
        System.out.println("Company     : " + company);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + designation);
        System.out.println("Location    : " + location);
    }
}

class Developer extends Employee {
    Developer(String department, double salary,String designation, String location) {
        super(department, salary, designation, location);
    }

    void displayRole() {
        System.out.println("Role        : Software Developer");
    }
}

public class Employee_main {
    public static void main(String[] args) {
        Developer emp = new Developer("AIML Engineer",52000,"Developer","Covai");
        emp.displayDetails();
        emp.displayRole();
        emp.setSalary(74000);
        System.out.println("\nUpdated Salary : " + emp.getSalary());
    }
}