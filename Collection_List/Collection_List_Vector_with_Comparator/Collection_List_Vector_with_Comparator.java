/*
author: Jaydatt Patel

Collection: 
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.Java Collection means a single unit of objects. 

Java Collection framework provides many interfaces :
    List : class (ArrayList, Vector, LinkedList)
    Set : class (HashSet, LinkedHashSet,TreeSet)
    Map : class (HashMap, LinkedHashMap,TreeMap)
    Queue : class (LinkedList, PriorityQueue)
    Deque : class (ArrayDeque,Deque)
    
Methods of the Collection Interface : 

1.add(Object) :	This method is used to add an object to the collection.
2.addAll(Collection c) : This method adds all the elements in the given collection to this collection.
3.clear() :	This method removes all of the elements from this collection.
4.contains(Object o) : This method returns true if the collection contains the specified element.
5.containsAll(Collection c) : This method returns true if the collection contains all of the elements in the 6given collection.
7.equals(Object o) : This method compares the specified object with this collection for equality.
8.hashCode() : This method is used to return the hash code value for this collection.
9.isEmpty() : This method returns true if this collection contains no elements.
10.iterator() : This method returns an iterator over the elements in this collection.
11.max() : 
 	This method is used to return the maximum value present in the collection.
12.parallelStream() : This method returns a parallel Stream with this collection as its source.
13.remove(Object o) : This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.
14.removeAll(Collection c) : This method is used to remove all the objects mentioned in the given collection from the collection.
15.removeIf(Predicate filter) : This method is used to remove all the elements of this collection that satisfy the given predicate.
16.retainAll(Collection c) : This method is used to retain only the elements in this collection that are contained in the specified collection.
17.size() :	This method is used to return the number of elements in the collection.
18.spliterator() : This method is used to create a Spliterator over the elements in this collection.
19.stream() : This method is used to return a sequential Stream with this collection as its source.
20.toArray() : This method is used to return an array containing all of the elements in this collection.

Iterator interface:
Iterator interface provides the facility of iterating the elements in a forward direction only.
Methods in the Iterator interface:
1. public boolean hasNext(): It returns true if the iterator has more elements otherwise it returns false.
2. public Object next(): It returns the element and moves the cursor pointer to the next element.
3. public void remove(): It removes the last elements returned by the iterator. It is less used.

*/

import java.util.*;

class Course{
        String course;
        Course(){
            course = "Invalid";
        }
        Course(String s){
            course = s;
        }
    }

class Student {
        int id;        
        String name;
        Course Degree = new Course(); 
        Student(){}
        Student(int i,String nm,String Course){
            id = i;
            name = nm;
            Degree.course = Course;
        }

    }

class SortbyID implements Comparator<Student> {

    public int compare(Student a, Student b)
        {
            return a.id - b.id;
        }
    }

class SortbyName implements Comparator<Student> {
 
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class Collection_List_Vector_with_Comparator {
   
    public static void main(String args[]){  

        List<Student> vec_list = new Vector<Student>();

        System.out.println("vec_list.isEmpty(): "+vec_list.isEmpty());

        Student st1 = new Student(101,"Amit","BBA"); 
        Student st2 = new Student(102,"Rahul","BCA"); 
        Student st3 = new Student(103,"Ravi","BCOM");
        Student st4 = new Student(104,"Mayur","MCA"); 
        Student st5 = new Student(105,"Jignesh","MBA"); 
        Student st6 = new Student(106,"Sagar","MCOM");

        vec_list.add(st1);        
        vec_list.add(st2);
        vec_list.add(st3);        
        vec_list.addFirst(st4); // insert at start position
        vec_list.addLast(st5); //insert at end position
        vec_list.add(3, st6); // insert at index position

        int size = vec_list.size();
        System.out.println("List size : " + size);
                
        System.out.println("After Add: ");
        //Traversing vec_list 
        for(Student s : vec_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Collections.sort(vec_list, new SortbyID());
        System.out.println("\nSorted by ID:");
        for(Student s : vec_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Collections.sort(vec_list, new SortbyName());
        System.out.println("\nSorted by Name:");
        for(Student s : vec_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        vec_list.removeFirst();        
        vec_list.removeLast();        
        vec_list.remove(2);
     
        System.out.println("After Remove: ");
        for(Student s : vec_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        vec_list.clear(); //remove all elements 
        

    }  
}  

