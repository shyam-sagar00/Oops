package Oops;

public class NumberCheck {
	
		boolean OddEven(int a) {
			if(a%2==0) {
				return true;
			}
			else
				return false;
		}
	
	
	
            public static void main(String[] args) {
				NumberCheck n=new NumberCheck();
				System.out.print(n.OddEven(6891238));
			}
}
