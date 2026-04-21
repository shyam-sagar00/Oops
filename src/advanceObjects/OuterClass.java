package advanceObjects;

public class OuterClass {
    
    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }
        
        LocalInnerClass l = new LocalInnerClass();
        l.printMessage();

        // TODO: Instantiate the local inner class and call its printMessage method
    }

    public static void main(String[] args) {
  OuterClass.StaticNestedClass staticObj = new OuterClass.StaticNestedClass();
        staticObj.printMessage();

        // 2. Instantiate outer class
        OuterClass outer = new OuterClass();

        // 3. Instantiate inner class
        OuterClass.InnerClass innerObj = outer.new InnerClass();
        innerObj.printMessage();

        // 4. Call method for local inner class
        outer.displayLocalClassMessage();
    }
}
