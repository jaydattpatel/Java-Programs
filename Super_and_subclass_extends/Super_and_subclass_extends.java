/*
author: Jaydatt Patel

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

extends: In Java, the extends keyword is used to indicate that the class which is being defined is derived from the super(base) class using inheritance. So basically, extends keyword is used to extend the functionality of the parent class to the subclass. In Java, multiple inheritances are not allowed due to ambiguity. Therefore, a class can extend only one class to avoid ambiguity.

super: super key word is used to access variable or function or construction of base/super class. When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass. The super keyword cannot be used in a static context, such as in a static method or a static variable initializer. If a method is not overridden in the subclass, then calling it without the super keyword will invoke the parent class’s implementation.

*/

import java.util.ArrayList;
import java.util.List;

class Super_Sub_class {

  static class Animal 
   {
      static int totalAnimal;
      String type;

      Animal(String name) 
         { 
            this.type = name;
         }
      public String toString() 
         { 
            return type;
         }
   }

   static class Cat extends Animal 
   { 
      static int totalCat;
      String Name;

      Cat(String name) 
         {
            super("Cat");
            this.Name = name;
            totalCat++;
         }
   }

   static class Dog extends Animal 
   {
      static int totalDog;
      String Name;

      Dog(String name) 
         {
            super("Dog");
            this.Name = name;
            totalDog++;
         }
   }

static void addAnimal(List<? extends Animal> cat_dog_list, List<Animal> Animal_list)
   {
      for(Animal sub_anm : cat_dog_list)
      {

         if (Animal_list.isEmpty())
            {
               Animal_list.add(new Animal(sub_anm.type));
               Animal.totalAnimal++;
               continue;
            }
         
         boolean flag = false;
         for(Animal anm_list : Animal_list)
            {
               if(anm_list.type == sub_anm.type)
               {
                  flag = true;
                  break;
               }
            }

         if(!flag)
            {
               Animal_list.add(new Animal(sub_anm.type));
               Animal.totalAnimal++;
               break;
            }
      }
      
   }

   static void addCat(List<Cat> cat,String name)
      {
         Cat c = new Cat(name);
         cat.add(c);
      }

   static void addDog(List<Dog> dog,String name)
      {
         Dog d = new Dog(name);
         dog.add(d);
      }

   static void printAnimal(List<Animal> Anm)
      {
         for(Animal x : Anm)
               System.out.println(x.type);
      }

   static void printCat(List<? extends Cat> cat)
      {
         for(Cat x : cat)
               System.out.println(x.type+": "+x.Name );
               
      }
      
   static void printDog(List<? extends Dog> dog)
      {
         for(Dog x : dog)
               System.out.println(x.type+": "+x.Name);
      }

   public static void main(String[] args) {

      List<Animal> anm_list = new ArrayList<Animal>();     
      List<Cat> cat_list = new ArrayList<Cat>();      
      List<Dog> dog_list = new ArrayList<Dog>(); 

      addCat(cat_list,"Red Cat");      
      addCat(cat_list,"Green Cat");      
      addCat(cat_list,"Blue Cat");

      addDog(dog_list, "Black Dog");      
      addDog(dog_list, "White Dog");      
      addDog(dog_list, "Brown Dog");


      addAnimal(cat_list, anm_list);      
      addAnimal(dog_list, anm_list);

      System.out.println("------printAnimal(Animal) : "+ Animal.totalAnimal);
      printAnimal(anm_list);
      System.out.println("------printCat(Cat) : "+ Cat.totalCat);
      printCat(cat_list);      
      System.out.println("------printDog(Dog) : "+ Dog.totalDog);
      printDog(dog_list);

 
   }
}

