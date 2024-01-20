/*
author: Jaydatt Patel
Stream class Syntax:
        Stream<T> stream;
Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports various methods which can be pipelined to produce the desired result. 

There uses of Stream in Java are mentioned below:
1.Stream API is a way to express and process collections of objects.
2.Enable us to perform operations like filtering, mapping,reducing and sorting.

Here are two types of Operations in Streams:
1.Intermediate Operations
2.Terminate Operations

There are a few Intermediate Operations mentioned below:

1. map() : The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
    List number = Arrays.asList(2,3,4,5);
    List square = number.stream().map(x->x*x).collect(Collectors.toList());

2. filter() : The filter method is used to select elements as per the Predicate passed as an argument.
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    
3. sorted() : The sorted method is used to sort the stream.
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result = names.stream().sorted().collect(Collectors.toList());

4. distinct() : It returns a stream consisting of distinct elements in a stream. distinct() is the method of Stream interface. This method uses hashCode() and equals() methods to get distinct elements.
    List number = Arrays.asList(2,3,4,5);
    List unique = number.list.stream().distinct().forEach(System.out::println); 

5. Stream anyMatch() : It returns whether any elements of this stream match the provided predicate. It may not evaluate the predicate on all elements if not necessary for determining the result.
    List list = Arrays.asList(3, 6, 12, 20); 
	boolean answer = list.stream().anyMatch(n -> (n < 10));
    
6. Stream allMatch() : It returns whether all elements of this stream match the provided predicate. It may not evaluate the predicate on all elements if not necessary for determining the result. 
    List list = Arrays.asList(3, 6, 12, 20); 
	boolean answer = list.stream().anyMatch(n -> (n > 0));

Terminal Operations : Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.
There are a few Terminal Operations mentioned below:

1. collect() : The collect method is used to return the result of the intermediate operations performed on the stream.
                Collector.toSet(), Collector.toList() , Collector.Joining(String)  

    List number = Arrays.asList(2,3,4,5,3);
    Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
    String ss = number.stream().map(x->x*x).collect(Collectors.Joining(" , "));

2. forEach() : The forEach method is used to iterate through every element of the stream.
    List number = Arrays.asList(2,3,4,5);
    number.stream().map(x->x*x).forEach(y->System.out.println(y));

3. reduce() : The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.
    List number = Arrays.asList(2,3,4,5);
    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    Here ans variable is assigned 0 as the initial value and i is added to it.

4.Stream() : The Stream will return Stream of collected object from list.

 */
import java.util.*; 
import java.util.stream.*; 

public class Stream_API {
    
public static void main(String args[]) 
{ 

    System.out.println("\nInteger Stream : ");
    List<Integer> number2 = Arrays.asList(3,1,7,2); //list of integers Creation 
    Stream<Integer> intStream =  number2.stream();
    intStream.forEach(x -> System.out.print(x + " - "));

    System.out.println("\nString Stream : ");
    List<String> str = Arrays.asList("ab","cd","ef","gh"); //list of String Creation 
    str.stream().forEach(x -> System.out.print(x + " - "));

    String str_join = str.stream().filter(x -> !x.isEmpty()).collect(Collectors.joining(","));
    System.out.println("\nJoined Stream : " + str_join);

    List<Integer> number = Arrays.asList(3,1,7,2); //list of integers Creation 
    List<Integer> square = 
        number.stream().map(x -> x*x).collect(Collectors.toList()); //map method 
    System.out.println("square : " + square); 


    List<String> names =  Arrays.asList("Area","of","circle"); //list of String creation 
    List<String> result = 
        names.stream().filter(s->s.startsWith("c")).collect(Collectors.toList()); // Use of filter method 
    System.out.println("result : "+result); 


    List<String> sort = names.stream().sorted().collect(Collectors.toList()); // Use of sorted method 
    System.out.println("sorted : "+sort); 

    List<Integer> numbers = Arrays.asList(4,3,7,1,2); // list of integers creation  
    numbers.stream().map(x->x*x).forEach(y->System.out.println("y : "+y)); // Use of forEach method 
    int odd = number.stream().filter(x->x%2==1).reduce(0,(total,k)-> total+k); // Use of reduce method 
    System.out.println("Total of odd values is: "+odd); 


} 
} 