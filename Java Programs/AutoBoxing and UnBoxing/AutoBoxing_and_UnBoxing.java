/*

author : Jaydatt Patel

Autoboxing refers to the conversion of a primitive value into an object of the corresponding wrapper class is called autoboxing.
 
Unboxing on the other hand refers to converting an object of a wrapper type to its corresponding primitive value. 

For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

(Primitive Type)	|       (Wrapper Class)
    boolean	        |           Boolean
    byte	        |           Byte
    char	        |           Character
    float 	        |           Float
    int 	        |           Integer
    long	        |           Long
    short 	        |           Short
    double	        |           Double


 */

class AutoBoxing_and_UnBoxing{

    public static void main(String args[]){
          Integer i = 10;
 
        // Unboxing the Object
        int i1 = i;
        System.out.println("Integer : " + i + ", int : " + i1);

        // Autoboxing of character
        Character ch = 'a';
 
        // Auto-unboxing of Character
        char ch1 = ch;

        System.out.println("Character : " + ch + ", char : " + ch1);

    }
}