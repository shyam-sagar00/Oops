package Oops;

public class Rectangle {
	    int length, breadth;

	    int area() {
	        return length * breadth;
	    }

	    int perimeter() {
	        return 2 * (length + breadth);
	    }

	    public static void main(String[] args) {
	        Rectangle r = new Rectangle();
	        r.length = 10;
	        r.breadth = 5;

	        System.out.println("Area: " + r.area());
	        System.out.println("Perimeter: " + r.perimeter());
	    }
}
