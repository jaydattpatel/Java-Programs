/*
author: Jaydatt Patel
Array multi dimension Declaration and access.
Stntax:
<data_type> <variable_name>[][];
<data_type> []<variable_name>[]; 
<data_type>[][] <variable_name>; 
 
 */

class Array_multi {

    //generic print function for multidimension array for Integer,Double,String
    public static <T> void print_list(T[][] list)
        {
            System.out.print("\nElements"+": ");
            for(T row[] : list)
            {
                System.out.print("\n");
                for(T cell : row)
                    System.out.print(cell+", ");
            }
        }
        
    
    public static class myclass
    {
        int id;
        String name;
        myclass(){};
        myclass(int a, String b)
            {
                id = a;
                name = b;
            }
    }

    public static void main(String args[])
    {
        int int_list[][] = new int[4][5];
        int q = 0;
        //get data of array by length of array
        for(int row = 0; row < int_list.length; row++)
        {
            q += 10;
            for(int col = 0; col < int_list[row].length; col++)
                    int_list[row][col] = q+col;   
        }

        //print the data of array by length of array
        System.out.print("\n\nint_list[][]: ");
        for(int row = 0; row < int_list.length; row++)
        {
            System.out.print("\n");
            for(int col = 0; col < int_list[row].length; col++)
                    System.out.print(" "+int_list[row][col]);      
        } 

        //declare flexible multidimension array method-1.
        Integer int_list1[][] = new  Integer[3][];
        int_list1[0] = new Integer[2];        
        int_list1[1] = new Integer[5];
        int_list1[2] = new Integer[3];
        q = 0; 
        for(int row = 0; row < int_list1.length; row++)
        {
            q += 100;
            for(int col = 0; col < int_list1[row].length; col++)
                    int_list1[row][col] = q+col;   
        }
        System.out.print("\n\nint_list1[][]: ");
        print_list(int_list1);
        
        //declare flexible multidimension array method-2.
        Integer arrRef[] = {31,32,33,34};
        Integer int_list2[][] = {
            {1,2,3},
            {11,12,13,14,15,16},
            {21,22},
            arrRef,
            null};
        int_list2[4] = new Integer[] {51,52,53};
        System.out.print("\n\nint_list2[][]: ");
        print_list(int_list2);

        Double d_list[][] = new  Double[3][];
        d_list[0] = new Double[2];        
        d_list[1] = new Double[5];
        d_list[2] = new Double[3];
        q = 0; 
        for(int row = 0; row < d_list.length; row++)
        {
            q += 10.0;
            for(int col = 0; col < d_list[row].length; col++)
                    d_list[row][col] = (double)q + (double)col;   
        }
        System.out.print("\n\nd_list[][]: ");
        print_list(d_list);

        String arrRefstr[] = {"a4","b4","c4","d4"};
        String str_list[][] = {
            {"a1","b1","c1"},
            {"a2","b2","c2","d2","e2","f2"},
            {"a3","b3"},
            arrRefstr,
            null};
        str_list[4] = new String[]{"a5","b5","c5"};
        System.out.print("\n\nstr_list[][]: ");
        print_list(str_list);

        myclass mc_list[][] = new myclass[4][];
        mc_list[0] = new myclass[2];          
        mc_list[1] = new myclass[4];        
        mc_list[2] = new myclass[5];        
        mc_list[3] = new myclass[3];        
        q = 0;
        for(int row = 0; row < mc_list.length; row++)
        {
            q += 100;
            for(int col = 0; col < mc_list[row].length; col++)
            {
                    mc_list[row][col] = new myclass();
                    mc_list[row][col].id = q+col;                    
                    mc_list[row][col].name = ("Name"+ (q+col));  
            } 
        }

        System.out.print("\n\nmc_list[][]: ");
        for(int row = 0; row < mc_list.length; row++)
        {
            System.out.print("\n");
            for(int col = 0; col < mc_list[row].length; col++)
            {
                    System.out.print("(id: "+mc_list[row][col].id + ", " +       
                                    "name: "+mc_list[row][col].name +"), ");
            } 
        }
        
    }
}
