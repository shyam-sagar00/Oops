package advanceObjects;

public class Employee {
    

    public String name; 
    private double salary; 
    String department; 

     public void setSalary(double salary){
        if(salary>0){
        this.salary=salary;
        }
    }    
    public double getSalary(){
        return salary;
    }    
    
    public void displayDetails() {
	       	Employee emp = new Employee();
	        System.out.println("Name: "+name+"\n"+"Salary: "+salary+"\n"+"Department: "+department);
	    }
}
