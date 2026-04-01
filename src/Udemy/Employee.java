package Udemy;

public class Employee {
    
    public String name;

    
    private double salary;

    
    String department;


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }


    public double getSalary() {
        return salary;
    }

  
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Shyam";
        emp.department = "IT";
        emp.setSalary(50000);

        emp.displayDetails();

        
        System.out.println("Salary (via getter): " + emp.getSalary());
    }
}