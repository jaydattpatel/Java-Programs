/*
author: Jaydatt Patel

The Comparable interface is used to compare an object of the same class with an instance of that class, it provides ordering of data for objects of the user-defined class. The class has to implement the java.lang.Comparable interface to compare its instance, it provides the compareTo method that takes a parameter of the object of that class. In this article, we will see how we can sort an array of pairs of different data types on the different parameters of comparison.

Using Comparable Interface :
- In this method, we are going to implement the Comparable interface from java.lang Package in the Pair class.
- The Comparable interface contains the method compareTo to decide the order of the elements.
- Override the compareTo method in the Pair class.
- Create an array of Pairs and populate the array.
- Use the Collections.sort() function to sort the List : class (ArrayList, Vector, LinkedList).

Collection: 
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.Java Collection means a single unit of objects. 

*/

import java.util.*; 


class Student implements Comparable<Student>{
        int id;        
        String name; 
        Student(){}
        Student(int i,String nm){
            id = i;
            name = nm;
        }
        
        public int compareTo(Student s){
            if(this.id == s.id){
                return 0;
            } else if(this.id > s.id){
                return 1;
            } else
                return -1;
        }

    }
    
class Collection_Comparable {
    public static void main(String args[]){  


        List <Student> list = new ArrayList<Student>();
        // List<Student> list = new LinkedList<Student>();
        //List<Student> list = new Vector<Student>();

        Student st1 = new Student(103,"Amit"); 
        Student st2 = new Student(102,"Rahul"); 
        Student st3 = new Student(105,"Ravi");
        Student st4 = new Student(101,"Mayur"); 
        Student st5 = new Student(106,"Jignesh"); 
        Student st6 = new Student(104,"Sagar");

        list.add(st1);        
        list.add(st2);
        list.add(st3);        
        list.add(st4); 
        list.add(st5);         
        list.add(st6); 
    
        int size = list.size();
        System.out.println("List size : " + size);
                

        for(Student s : list){
            System.out.println("id: "+ s.id + ", name: "+ s.name);
        }

        Collections.sort(list);

        System.out.println("\nAfter sort: ");
        for(Student s : list){
            System.out.println("id: "+ s.id + ", name: "+ s.name);
        }

        list.clear(); //remove all elements 

    }  
}
