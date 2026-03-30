package Oops;

public class Person {
	
	
	String name;
	int age;
	
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
	}
	
	
	public static void main(String args[]) {
		Person p = new Person();
		p.name="Shyam";
		p.age=27;
		p.display();
	}
}
