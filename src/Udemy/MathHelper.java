package Udemy;

public class MathHelper {
    
    static double PI = 3.14;

   
    static int square(int num) {
        return num * num;
    }



    public static void main(String[] args) {
       
        System.out.println("Value of PI: " + MathHelper.PI);

        
        System.out.println("Square of 5: " + MathHelper.square(5));
    }
}