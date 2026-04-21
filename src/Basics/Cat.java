package Basics;

public class Cat {
	String name="Maddy";
	int age;
	boolean isIndoorCat;
	
	
	void meow() {
		System.out.println("Meow");
	}
	
	 void printName() {
		System.out.println("Name:"+name);
	}
	 
	 
	 public static void main(String[] args) {
		Cat myCat= new Cat();
		
		myCat.meow();
		myCat.printName();
	}
	 
}
