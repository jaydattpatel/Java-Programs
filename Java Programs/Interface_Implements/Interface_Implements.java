/*
author: Jaydatt Patel

Interface: The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritances in Java using Interface. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A relationship.

Implements: In Java, the implements keyword is used to implement an interface. An interface is a special type of class which implements a complete abstraction and only contains abstract methods. To access the interface methods, the interface must be “implemented” by another class with the implements keyword and the methods need to be implemented in the class which is inheriting the properties of the interface. Since an interface is not having the implementation of the methods, a class can implement any number of interfaces at a time.

*/
class Interface_Implements_fun {
    
    interface One { 
        public void methodOne(); 
    } 

   
    interface Two { 
        public void methodTwo(); 
    } 

    // Interface extending both the defined interfaces  
    interface Three extends One, Two { 
        public void methodThree(); 
    } 

    // Defining the four interface 
    interface Four { 
        public void methodFour(); 
    } 

    // Implementing the two interfaces 
    static class A implements One, Two { 
        public void methodOne() { System.out.println("Class:A, Method-1"); } 
        public void methodTwo() { System.out.println("Class:A, Method-2");} 
    } 

    static class B implements Three { 
        public void methodOne() { System.out.println("Class:B, Method-1");} 
        public void methodTwo() { System.out.println("Class:B, Method-2");} 
        public void methodThree() { System.out.println("Class:B, Method-3");} 
    } 

    static class C extends B implements Four { 
        public void methodOne() { System.out.println("Class:C, Method-1");} 
        public void methodTwo() { System.out.println("Class:C, Method-2");} 
        public void methodThree() { System.out.println("Class:C, Method-3");}         
        public void methodFour() { System.out.println("Class:C, Method-4");} 
    } 
    
    public static void main(String args[])
    {
        
        A cA = new A();
        B cB = new B();
        C cC = new C();

        cA.methodOne();        
        cA.methodTwo();        

        cB.methodOne();        
        cB.methodTwo();
        cB.methodThree();

        cC.methodOne();        
        cC.methodTwo();
        cC.methodThree();
        cC.methodFour();

    }
    
}
