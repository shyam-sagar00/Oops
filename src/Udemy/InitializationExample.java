package Udemy;

public class InitializationExample {
	int instanceVariable;
    static int staticVariable;

    {
        instanceVariable = 100;
    }

 
    static {
        staticVariable = 200;
    }
   
    public static void main(String[] args) {
        InitializationExample example = new InitializationExample();
        System.out.println("Instance Variable: " + example.instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
}
