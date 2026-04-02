package Udemy;

public class OuterClass {
	static class StaticNestedClass {
        void printMessage() {
            System.out.println("Message from Static Nested Class");
        }
    }

    
    class InnerClass {
        void printMessage() {
            System.out.println("Message from Inner Class");
        }
    }

    
    void displayLocalClassMessage() {
     
        class LocalInnerClass {
            void printMessage() {
                System.out.println("Message from Local Inner Class");
            }
        }

  
        LocalInnerClass local = new LocalInnerClass();
        local.printMessage();
    }

    public static void main(String[] args) {

     
        OuterClass.StaticNestedClass staticObj = new OuterClass.StaticNestedClass();
        staticObj.printMessage();

       
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerObj = outer.new InnerClass();
        innerObj.printMessage();

      
        outer.displayLocalClassMessage();
    }
}