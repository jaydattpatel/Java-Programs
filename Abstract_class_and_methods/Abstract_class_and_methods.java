/*
author: Jaydatt Patel
Abstract Classes and Methods:
Data abstraction is the process of hiding certain details and showing only essential information to the user. Abstraction can be achieved with either abstract classes or interfaces.
The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */

public class Abstract_class_and_methods {

    static abstract class Base {
        abstract void fun();  // Abstract method (does not have a body) 
        public void fun2()  // Regular method
        {
             System.out.println("Base fun2() called");
        }

    }
     
    static class Derived extends Base {
        void fun()
        {
            System.out.println("Derived fun() called");
        }
    }

    public static void main(String args[])
    {
        Base b = new Derived();
        b.fun();        
        b.fun2();

    }
    
}
