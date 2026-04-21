package advanceObjects;

public class Main {
	
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();

        
        emp.name = "Shyam";

        
        emp.department = "Engineering";

        
        emp.setSalary(50000);

 
        emp.displayDetails();

       // System.out.println("Salary using getter: " + emp.getSalary());
    }

}
