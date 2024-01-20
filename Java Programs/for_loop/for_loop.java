/*
author: Jaydatt Patel
Enhanced for loop
 */

class for_loop {

public static <T> void show(T[] list)
	{
		System.out.printf("\nElements are: ");
		for (T x : list) //for (int x : int_list) here loop will created x variable copy value of array one by one.
			System.out.printf(x + " ");
	}

public static void main(String args[])
{

	Integer int_list[] = {1,2,3,4,5};
	String str_list[] = { "Ron", "Harry", "Hermoine" };
	Double float_list[] = {11.22,22.33,33.44,44.55,55.11};
        
	show(int_list);	
	show(str_list);
	show(float_list);

}

}