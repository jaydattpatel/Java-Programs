/*
author: Jaydatt Patel
Nested Class
*/
class outer_class {

    int o1 = 10;
    static int o2 = 20;

    class inner
    {
        int i1 = 100;
        static int i2 = 200;
        void inner_display()
        {
            System.out.println("In inner access non-static o1 of outer: " + o1);            
            System.out.println("In inner access static o2 of outer: " + o2);
        }
    }

    static class inner_static
    {
        int i21 = 1000;
        static int i22 = 2000;
        void inner_static_display()
        {
            System.out.println("In inner_static can not access non-static o1 of outer");            
            System.out.println("In inner_static access static o2: " + o2);
        }
    }
    void inner_display()
    {
        inner in_1 = new inner();
        in_1.inner_display();        
    }
    void outer_display()
        {
            System.out.println("In outer can not access non-static i1 of inner");            
            System.out.println("In outer access static i2 of inner : "+ inner.i2);
            System.out.println("In outer can not access non-static i21 of inner_static");            
            System.out.println("In outer access static i22 of inner_static : "+ inner_static.i22);
        }
}


public class Nested_class{

    public static void main(String args[])
    {
        outer_class outer = new outer_class();
        System.out.println("------1------");
        System.out.println("In main non static inner class can not create"); 
        //error : outer_class.inner in = new outer_class.inner(); 
        System.out.println("In main static inner class create");         
        outer_class.inner_static in_static = new outer_class.inner_static();

        System.out.println("------2------");  
        System.out.println("In main access in_static.i2 : " + in_static.i21);         
        System.out.println("In main access in_static.i22 : " + in_static.i22);
        System.out.println("In main in_static.inner_static_display():");  
        in_static.inner_static_display();       
      

        System.out.println("------3------");            
        System.out.println("In main access o1: " + outer.o1);          
        System.out.println("In main access o2: " + outer.o2);

        System.out.println("------4------");
        outer.inner_display();

        System.out.println("------5------");
        outer.outer_display();

        System.out.println("------6------");            
        System.out.println("In main can not access non-static i1 of inner");            
        System.out.println("In main can not access static i2 of inner");
        System.out.println("In main can not access non-static i21 of inner_static");            
        System.out.println("In main can not access static i22 of inner_static");
    }
    
}
