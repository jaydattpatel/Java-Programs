/*
author: Jaydatt Patel

Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.

Internally, the Varargs method is implemented by using the single dimensions arrays concept. Hence, in the Varargs method, we can differentiate arguments by using Index. A variable-length argument is specified by three periods or dots(…). 

Syntax of Varargs: 
    return_type method_name(data_type... var){}     
    return_type method_name(data_type var,data_type var, ...... , data_type... var){}   //used in last 

Error Varargs Examples: 
    Case 1: Specifying Varargs as the first parameter of the method instead of the last one: 
    void method(int... gfg, String q) // Compile time error as vararg appear before normal argument

    Case 2: Specifying two Varargs in a single method: 
    void method(String... gfg, int... q) // Compile time error as there are two varargs

For Example :
    public static void fun(int... a) {// method body} 

This syntax tells the compiler that fun( ) can be called with zero or more arguments. As a result, here, a is implicitly declared as an array of type int[].

 */

class Varargs_arguments {

    public static <T> void display(T... arr){
        System.out.print("arr ("+arr[0].getClass().getSimpleName()+") : ");
        for(T i : arr){
            System.out.print(i+", ");
        }
        System.out.println("\n");
    }

    public static <T1,T2> void show(T1 x,T2... arr){
        System.out.println("x (" +x.getClass().getSimpleName()+ ") : " + x);
        System.out.print("arr ("+arr[0].getClass().getSimpleName()+") : ");
        for(T2 i : arr){
            System.out.print(i+", ");
        }
        System.out.println("\n");

    }

    public static void main(String args[]){
        display(1,2,3,4);
        show(1,2,3,4);

        display("aa","bb","cc","dd");
        show("aa","bb","cc","dd");

        show("aa",1,2,3);

        show(1,"aa","bb","cc");

        display("aa",1,"cc",3);
    }
    
}
