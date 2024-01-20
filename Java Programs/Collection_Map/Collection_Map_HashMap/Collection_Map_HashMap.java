
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
0.putAll(collection map<k,v>) : Add all pair values from collection map list.
1.put(key,val) : This method is used to add key and value to the collection.
2.putIfAbsent(key,val) : This method add element if not present in collection.
3.clear() :	This method removes all of the elements from this collection.
4.remove(key) or remove(key,val): This method is used to remove the given key from the collection. 
5.size() :	This method is used to return the number of elements in the collection.
6.isEmpty() : This method returns true if this collection contains no elements.
7.entryset() : This method is used in Map Interface in Java to create a set out of the same elements contained in the map. 
8.obj.getKey() : return Key of Map object
9.obj.getvalue() : return value of Map object
10.keySet() : return all keys in set from Map collection. 
10.values() : return all values in collection from Map collection. 
11.containsKey(key) : This method returns true if the collection contains the specified key.
12.containsValue(val) : This method returns true if the collection contains the specified value.
13.equals(Object o) : This method compares the specified object with this collection for equality.
14.replace(key, new val) : replace old value with new value.
15.replace(key, old val, new val) : replace old value with new value.

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
    
class Collection_Map_HashMap {
    public static void main(String args[]){  

        Map<Integer,Student> map_hash = new HashMap<Integer,Student>();

        System.out.println("------map_hash.isEmpty(): "+map_hash.isEmpty());

        Student st1 = new Student(101,"Amit","BBA"); 
        Student st2 = new Student(102,"Rahul","BCA"); 
        Student st3 = new Student(103,"Ravi","BCOM");
        Student st4 = new Student(104,"Mayur","MCA"); 
        Student st5 = new Student(105,"Jignesh","MBA"); 
        Student st6 = new Student(106,"Sagar","MCOM");        

        map_hash.put(st1.id, st1);        
        map_hash.put(st2.id, st2);
        map_hash.put(st3.id, st3);   
        map_hash.putIfAbsent(st4.id, st4);    
        map_hash.put(st5.id, st5);   
        map_hash.put(st6.id, st6);   

        int size = map_hash.size();
        System.out.println("---------List size : " + size);
                
        System.out.println("--------After Add: ");

        for (Map.Entry<Integer,Student> obj : map_hash.entrySet()) { 
            System.out.println(obj.getKey() + ":"+ obj.getValue().name +", "+ obj.getValue().Degree.course); 
        } 

        //get Set of keys
        Set<Integer> keys = new HashSet<Integer>();
        keys = map_hash.keySet(); 

        System.out.println("---------All Keys: ");
        for(Integer i : keys){
            System.out.print(i+", ");
        }
        
        //get collection of values
        Collection<Student> values = new HashSet<Student>();
        values = map_hash.values(); 

        System.out.println("\n--------All Values: ");
        for(Student i : values){
            System.out.println(i.id+", "+i.name+", "+i.Degree.course);
        }

        System.out.println("map_hash.containsKey(101) : "+map_hash.containsKey(101));        
        System.out.println("map_hash.containsValue(st5) : "+map_hash.containsValue(st5));

        map_hash.remove(103);        
        map_hash.remove(104,st4);

        Student st7 = new Student(106,"Bhavesh","LLB");        
        Student st8 = new Student(108,"Pratik","LLB");

        map_hash.replace(106, st7); // replace value by match with key.
        map_hash.replace(102, st2, st8); // replace value by match with key.
        
        System.out.println("---------After Remove: ");
        for (Map.Entry<Integer,Student> obj : map_hash.entrySet()) { 
            System.out.println(obj.getKey() + ":"+ obj.getValue().name +", "+ obj.getValue().Degree.course); 
        } 

        map_hash.clear(); //remove all elements 
    

    }  
}
