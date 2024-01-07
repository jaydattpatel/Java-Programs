/*
author: Jaydatt Patel
finel : The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override). The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...)

The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
-variable
-method
-class
The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.

*/
public class Final_keyword {

    final static int x = 10;
    static int y = 15;

    class A {
        void fun() {System.out.println("In class A"); }
    }

    class B extends A {
       final void fun() {System.out.println("In class B"); } 
    }

    final class C extends B {
       //Error:  void fun() {System.out.println("In class C"); }   //error due to final
    }

    // Error : class D extends C {}   //error due to final

    public static void main(String args[])
    {
        //error: x = 21;  // error due to final 
        y = 25;
    }
}
