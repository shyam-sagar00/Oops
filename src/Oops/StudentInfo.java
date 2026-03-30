package Oops;

public class StudentInfo {
		int marks;
		String name;
		
		 void display() {
			System.out.println("Name:"+name+"  "+"Score:"+marks);
		}
		
		public static void main(String[] args) {
			StudentInfo s=new StudentInfo();
			s.name="Shyam";
			s.marks=75;
			
			s.display();
		}
}
