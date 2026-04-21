package advanceObjects;

public class InitializationExample {
	int instanceVariable;
    static int staticVariable;
    
    
    {
    	instanceVariable=100;
    }
    
    static {
    	staticVariable=200;
    }
    
    
    
    
    public static void main(String[] args) {
    	InitializationExample ie = new InitializationExample();
    	System.out.println("InstanceVariable:"+ie.instanceVariable);
    	System.out.println("Static Variable: " + staticVariable);
    }
}
