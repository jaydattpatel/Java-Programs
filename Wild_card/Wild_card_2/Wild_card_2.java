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
import java.util.ArrayList;
import java.util.List;

    class Animal {
        String name;
        Animal(String name) { 
           this.name = name;
        }
        public String toString() { 
           return name;
        }
     }
     
     class Cat extends Animal { 
        Cat(String name) {
           super(name);
        }
     }
     
     class RedCat extends Cat {
        RedCat(String name) {
           super(name);
        }
     }
     
     class Dog extends Animal {
        Dog(String name) {
           super(name);
        }
    }
public class Wild_card_2 {


    //Upper bound wildcard
   public static void deleteCat(List<? extends Cat> catList, Cat cat) {
      catList.remove(cat);
      System.out.println("Cat Removed");
   }

   //Lower bound wildcard
   public static void addCat(List<? super RedCat> catList) {
      catList.add(new RedCat("Red Cat"));
      System.out.println("Cat Added");
   }

   //Unbounded wildcard Using Object method toString()
   public static void printAll(List<?> list) {
      for (Object item : list)
         System.out.println(item + " ");
   }

   public static void main(String[] args) {

      List<Animal> animalList= new ArrayList<Animal>();
      List<RedCat> redCatList= new ArrayList<RedCat>();

      //add list of super class Animal of Cat class
      addCat(animalList);
      //add list of Cat class
      addCat(redCatList);  
      addCat(redCatList);  

      //print all animals
      printAll(animalList);
      printAll(redCatList);

      Cat cat = redCatList.get(0);
      //delete cat
      deleteCat(redCatList, cat);
      printAll(redCatList); 
   }
}
