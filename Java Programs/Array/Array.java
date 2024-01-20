/*
author: Jaydatt Patel
Array Declaration and access.
Stntax:
<data_type> <variable_name>[];
<data_type>[] <variable_name>; 
<data_type> []<variable_name>; 
 */

class Array {
    //generic print function for array for Integer,Double,String
    public static <T> void print_list(T i[])
        {
            System.out.print("\nElements"+"["+i.length+"]: ");
            for(T x : i)
                System.out.print(x+", ");
        }
    
    public static class myclass{
    int id;
    String name;
    myclass(int a, String b)
    {
        id = a;
        name = b;
    }
}

    public static void main(String args[])
    {

        int i_list1[] = {1,2,3,4,5};
        int i_list2[] =  new int[] {11,22,33};
        System.out.print("\ni_list1[i]: ");
        for(int i = 0; i < i_list1.length; i++)
            System.out.print( i_list1[i]+", ");
        System.out.print("\ni_list2[i]: ");
        for(int i = 0; i < i_list2.length; i++)
            System.out.print( i_list2[i]+", ");

        Integer[] i_arr1 = new Integer[10];        
        Integer[] i_arr2 = new Integer[]{101,102,103};
        for(int i = 0; i < i_arr1.length; i++)
            i_arr1[i] = i+1;
       print_list(i_arr1);       
       print_list(i_arr2);

        Double[] d_arr1 = new Double[10];        
        Double[] d_arr2 = new Double[]{101.1,102.2,103.3};
        for(int i = 0; i < d_arr1.length; i++)
            d_arr1[i] = i+0.123;
        print_list(d_arr1);        
        print_list(d_arr2);

        String[] s_arr1 = new String[2];  
        s_arr1[0] =  "aaa";        
        s_arr1[1] =  "bbb";
        String[] s_arr2 = new String[]{"AAA","BBB","CCC"};
        print_list(s_arr1);        
        print_list(s_arr2);

        myclass[] mc = new myclass[4];
        mc[0] = new myclass(1,"A");          
        mc[1] = new myclass(2,"B");        
        mc[2] = new myclass(3,"C");        
        mc[3] = new myclass(4,"D");        

        for(int i = 0; i < mc.length; i++)
            System.out.println("mc["+i+"]: id = "+mc[i].id+", name: "+mc[i].name);
        
        myclass[] mc2 = new myclass[]{new myclass(11, "AA"),new myclass(12, "BB")};
        for(int i = 0; i < mc2.length; i++)
            System.out.println("mc2["+i+"]: id = "+mc2[i].id+", name: "+mc2[i].name);
        
    }
}
