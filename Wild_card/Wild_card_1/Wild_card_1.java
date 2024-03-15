/*
author: Jaydatt Patel

wild card operator : ?
The question mark (?) is known as the wildcard in generic programming. It represents an unknown type. The wildcard can be used in a variety of situations such as the type of a parameter, field, or local variable; sometimes as a return type. Unlike arrays, different instantiations of a generic type are not compatible with each other, not even explicitly. This incompatibility may be softened by the wildcard if ? is used as an actual type parameter.

Types of wildcards in Java:
Upper bound Wildcard − ? extends Type.
Lower bound Wildcard − ? super Type.
Unbounded Wildcard − ?

1. Upper Bounded Wildcards: 
These wildcards can be used when you want to relax the restrictions on a variable. For example, say you want to write a method that works on List<byte>, List<int>, List<float>, List<double>, List<long>, List<short>, List<Integer>, List <Double>, and List<Number>, you can do this using an upper bounded wildcard. This means that list being passed can be of any field or subclass of that field. If we use 
<? extends Number> then Integer and Double are subclasses of class Number.
    syntax: public static void add(List<? extends Number> obj)

2. Lower Bounded Wildcards: 
It is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound. Suppose we use <? super Integer> then Arguments can be Integer or superclass of Integer. The method printOnlyIntegerClassorSuperClass will only take Integer or its superclass objects. However, if we pass a list of types Double then we will get a compilation error. It is because only the Integer field or its superclass can be passed. Double is not the superclass of Integer.
    Syntax: List<? super A> obj

3. Unbounded wildcards: 
If a variable can be accessed using Object class method then use an unbound wildcard.
This wildcard type is specified using the wildcard character (?), for example, List. This is called a list of unknown types. These are useful in the following cases –
When writing a method that can be employed using functionality provided in Object class.
When the code is using methods in the generic class that doesn’t depend on the type parameter
    Syntax: List<?> obj

*/

import java.util.Arrays;
import java.util.List;

class Wild_card_1 {

    //Upper Bounded Wildcards
    private static void printOnlySubClassOfNumber(List<? extends Number> list)
	{
		System.out.println(list);
	}

    //Lower Bounded Wildcards
    public static void printOnlyIntegerAndSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }
    
     //Unbounded Wildcards
    public static void printAll(List<?> list)
    {
        System.out.println(list);
    }
    
	public static void main(String[] args)
	{
         
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7); // Upper Bounded Integer List
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1); // Double list
        List<String> list3 = Arrays.asList("AA", "BB", "CC"); // String list	
		
        //for Upper Bounded Wildcards: to allow only subclass
        System.out.println("Upper Bounded Wildcards:");
        printOnlySubClassOfNumber(list1);        
        printOnlySubClassOfNumber(list2);
        //Error : printOnlySubClassOfNumber(list3);
                
        //for Lower Bounded Wildcards: to allow definded class and its super class
        System.out.println("Lower Bounded Wildcards:");
        printOnlyIntegerAndSuperClass(list1);        
        //Error :printOnlyIntegerAndSuperClass(list2);
        //Error : printOnlyIntegerAndSuperClass(list3);
 
        //for Unbounded Wild Card: to allow all type of class
        System.out.println("Unbounded Wildcards:");
        printAll(list1);        
        printAll(list2);        
        printAll(list3);

	}




    
}
