/*
author: Jaydatt Patel
A java package is a group of similar types of classes, interfaces and sub-packages.
Package in java can be categorized in two form, built-in package and user-defined package.
There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
Here, we will have the detailed learning of creating and using user-defined packages.
syntax for declare package : package [package_name]

There are three ways to access the package from outside the package.
1) import package.*;
2) import package.classname;
3) fully qualified name.

1) Using packagename.* : If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.The import keyword is used to make the classes and interface of another package accessible to the current package.

2) Using packagename.classname : If you import package.classname then only declared class of this package will be accessible.

3) Using fully qualified name : If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface. It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.

*/

import Pack1.*; //import all class
import Pack2.C; //import class C only
import Pack2.D; //import class D only
// for Pack3 class we will use Pack3.[classname] in main program asv fully qualified name


public class PackMain {
    
    public static void main(String args[])
    {
        System.out.println("-------------A--------------");
        A PK1_A = new A();
        PK1_A.fun();
        System.out.println("In main A.x = "+PK1_A.x);

        System.out.println("-------------B--------------");
        B PK1_B = new B();
        PK1_B.fun();

        System.out.println("-------------C--------------");
        C PK2_C = new C();
        PK2_C.fun();        

        System.out.println("-------------D--------------");
        D PK2_D = new D();
        PK2_D.fun();

        System.out.println("-------------E--------------");
        Pack3.E PK3_E = new Pack3.E();
        PK3_E.fun();        

        System.out.println("-------------F--------------");
        Pack3.F PK3_F = new Pack3.F();
        PK3_F.fun();
    }
    
}
