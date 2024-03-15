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
2.addFirst(obj) : Insert object at start position.
3.addLast(obj) : Insert object at end position.
4.add(index,obj) : Insert object at index position.
5.addAll(Collection c) : This method adds all the elements in the given collection to this collection.
6.clear() :	This method removes all of the elements from this collection.
7.contains(Object o) : This method returns true if the collection contains the specified element.
8.containsAll(Collection c) : This method returns true if the collection contains all of the elements in the 6given collection.
9.equals(Object o) : This method compares the specified object with this collection for equality.
10.remove(obj) : remove object from collection with exception handing.
11.removeFirst() : remove first object from collection with exception handing.
12.removeLast() : remove last object from collection with exception handing.
13.removeAll() : remove all objects from collection with exception handing.
14.removeIf(x->(exp)) : This method is used to remove all the elements of this collection that satisfy the given predicate.
15.hashCode() : This method is used to return the hash code value for this collection.
16.isEmpty() : This method returns true if this collection contains no elements.
17.iterator() : This method returns an iterator over the elements in this collection.
18.max() : This method is used to return the maximum value present in the collection.
19.parallelStream() : This method returns a parallel Stream with this collection as its source.
20.retainAll(Collection c) : This method is used to retain only the elements in this collection that are contained in the specified collection.
21.size() :	This method is used to return the number of elements in the collection.
22.spliterator() : This method is used to create a Spliterator over the elements in this collection.
23.stream() : This method is used to return a sequential Stream with this collection as its source.
24.toArray() : This method is used to return an array containing all of the elements in this collection.

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

class Student{
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
class Collection_List_LinkedList_with_Comparator {
   
    public static void main(String args[]){  

      
        List<Student> Linked_list = new LinkedList<Student>();

        System.out.println("Linked_list.isEmpty(): "+Linked_list.isEmpty());

        Student st1 = new Student(101,"Amit","BBA"); 
        Student st2 = new Student(102,"Rahul","BCA"); 
        Student st3 = new Student(103,"Ravi","BCOM");
        Student st4 = new Student(104,"Mayur","MCA"); 
        Student st5 = new Student(105,"Jignesh","MBA"); 
        Student st6 = new Student(106,"Sagar","MCOM");

        Linked_list.add(st1);        
        Linked_list.add(st2);
        Linked_list.add(st3);        
        Linked_list.addFirst(st4); // insert at start position
        Linked_list.addLast(st5); //insert at end position
        Linked_list.add(3, st6); // insert at index position

        int size = Linked_list.size();
        System.out.println("List size : " + size);
                
        System.out.println("After Add: ");
        //Traversing Linked_list 
        for(Student s : Linked_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Collections.sort(Linked_list, new SortbyID());
        System.out.println("\nSorted by ID:");
        for(Student s : Linked_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Collections.sort(Linked_list, new SortbyName());
        System.out.println("\nSorted by Name:");
        for(Student s : Linked_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Linked_list.removeFirst();        
        Linked_list.removeLast();        
        Linked_list.remove(2);

        System.out.println("After Remove: ");
        for(Student s : Linked_list){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Linked_list.clear(); //remove all elements 


    }  
}  

