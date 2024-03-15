/*
author : Jaydatt Patel

In order to access static members, it is necessary to qualify references with the class they
came from. The static import feature of Java 5 facilitates the java programmer to access any statmember of a class directly. There is no need to qualify it by the class name. 

for example :
    double r = Math.cos(Math.PI * theta); 

Instead, the program imports the members, either individually: 
    import static java.lang.Math.PI; 

Once the static members have been imported, they may be used without qualification:
    double r = cos(PI * theta); 
 */

import static java.lang.System.*;

class Static_Import{
    public static void main(String args[]){
        out.println("Hello");
    }
}