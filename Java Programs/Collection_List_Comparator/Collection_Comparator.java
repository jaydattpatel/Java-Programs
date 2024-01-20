/*
author: Jaydatt Patel

A comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of the same class. 

List : class (ArrayList, Vector, LinkedList)


*/

import java.util.*; 


class Student{
        int id;        
        String name;
        Student(){}
        Student(int i,String nm){
            id = i;
            name = nm;
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
    
class Collection_Comparator {
    
   
    public static void main(String args[]){  

        List <Student> list = new ArrayList<Student>();
        //List<Student> list = new LinkedList<Student>();
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
                
        System.out.println("After Add: ");
        for(Student s : list){
            System.out.println("id: "+ s.id + ", name: "+ s.name);
        }

        Collections.sort(list, new SortbyID());
        System.out.println("\nSorted by ID:");
        for(Student s : list){
            System.out.println("id: "+ s.id + ", name: "+ s.name);
        }

        Collections.sort(list, new SortbyName());
        System.out.println("\nSorted by Name:");
        for(Student s : list){
            System.out.println("id: "+ s.id + ", name: "+ s.name);
        }

        list.clear(); //remove all elements 

    }  
}  

