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

1.add(Obj) :	This method is used to add an object to the collection.
2.addFirst(obj) : Insert object at start position.
3.addLast(obj) : Insert object at end position.
4.push(obj) : Insert object at end position.
5.addAll(Collection c) : This method adds all the elements in the given collection to this collection.
6.clear() :	This method removes all of the elements from this collection.
7.contains(Object o) : This method returns true if the collection contains the specified element.
8.containsAll(Collection c) : This method returns true if the collection contains all of the elements in the 6given collection.
7.equals(Object o) : This method compares the specified object with this collection for equality.
8.isEmpty() : This method returns true if this collection contains no elements.
9.hashCode() : This method is used to return the hash code value for this collection.
10.peek() : return head object from collection.
11.peekFirst() : return first object from collection.
12.peekLast() : return Last object from collection.
13.pop() : remove head from collection with exception handing.
14.poll() or pollFirst(): remove first object from collection.
15.pollLast() :remove last object from collection.
16.remove(obj) : remove object from collection with exception handing.
17.removeFirst() : remove first object from collection with exception handing.
17.removeLast() : remove last object from collection with exception handing.
18.removeAll() : remove all objects from collection with exception handing.
19.removeIf(x->(exp)) : This method is used to remove all the elements of this collection that satisfy the given predicate.
20.iterator() : This method returns an iterator over the elements in this collection.
21.parallelStream() : This method returns a parallel Stream with this collection as its source.
22.retainAll(Collection c) : This method is used to retain only the elements in this collection that are contained in the specified collection.
23.size() :	This method is used to return the number of elements in the collection.
24.spliterator() : This method is used to create a Spliterator over the elements in this collection.
25.stream() : This method is used to return a sequential Stream with this collection as its source.
26.toArray() : This method is used to return an array containing all of the elements in this collection.

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
    
class Collection_Deque_ArrayDeque {
    public static void main(String args[]){  

        Deque<Student> dq_arr = new ArrayDeque<Student>();

        System.out.println("dq_arr.isEmpty(): "+dq_arr.isEmpty());

        Student st1 = new Student(101,"Amit","BBA"); 
        Student st2 = new Student(102,"Rahul","BCA"); 
        Student st3 = new Student(103,"Ravi","BCOM");
        Student st4 = new Student(104,"Mayur","MCA"); 
        Student st5 = new Student(105,"Jignesh","MBA"); 
        Student st6 = new Student(106,"Sagar","MCOM");

        dq_arr.add(st1);        
        dq_arr.add(st2);
        dq_arr.add(st3);        
        dq_arr.addFirst(st4); // insert at start position
        dq_arr.addLast(st5); //insert at end position        
        dq_arr.push(st6); //insert at end position
    

        int size = dq_arr.size();
        System.out.println("List size : " + size);
                
        System.out.println("After Add: ");
        for(Student s : dq_arr){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        Student temp = new Student();

        temp = dq_arr.peek(); // return head
        System.out.println("Head : " + temp.id + ", "+ temp.name);        
        temp = dq_arr.peekFirst(); //return first object
        System.out.println("First : " + temp.id + ", "+ temp.name);        
        temp = dq_arr.peekLast(); //return last object
        System.out.println("Last : " + temp.id + ", "+ temp.name);        


        temp = dq_arr.pop(); //remove first element
        System.out.println("pop : " + temp.id + ", "+ temp.name);   
        temp = dq_arr.poll();      // remove the head   
        System.out.println("poll : " + temp.id + ", "+ temp.name);
        temp = dq_arr.pollFirst(); //remove the first element
        System.out.println("pollFirst : " + temp.id + ", "+ temp.name);
        temp = dq_arr.pollLast(); //remove last element
        System.out.println("pollLast : " + temp.id + ", "+ temp.name);

        temp = dq_arr.removeFirst(); //remove first element
        System.out.println("removeFirst : " + temp.id + ", "+ temp.name);
        temp = dq_arr.removeLast();  //remove last element
        System.out.println("removeLast : " + temp.id + ", "+ temp.name);
        dq_arr.remove(st3);

        System.out.println("After Remove: ");
        for(Student s : dq_arr){
            System.out.println("id: "+ s.id + ", name: "+ s.name +", degree: " + s.Degree.course);
        }

        dq_arr.clear(); //remove all elements 

    }  
}
