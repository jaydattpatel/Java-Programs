/*
author: Jaydatt Patel
Generic class, we define flexible datatype place holder within class. 
We can not pass premitive datatype like int,char,float in this method.
 */


class Generic_class
{
	public static class Test <T1,T2>{
	T1 obj1; // An object of type T1
	T2 obj2; // An object of type T2

	// constructor
	Test(T1 obj1, T2 obj2)
		{
			this.obj1 = obj1;
			this.obj2 = obj2;
		}

	// To print objects of T1 and T2
	public void print()
		{
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}
	public static void main (String[] args)
	{
		Test <String, Integer> obj =
			new Test<String, Integer>("ABCD", 20);

		obj.print();

	}
}


