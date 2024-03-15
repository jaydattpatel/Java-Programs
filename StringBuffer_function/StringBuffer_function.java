/*
author: Jaydatt Patel
Different StringBuffer functions
StringBuffer is mutable and provide facility to modify characters or String along with length. 

*/

class course{

    public String toString(){
        System.out.println("-----Inside course.toString()");
        String s = new String(" BCA ");
        return (s);
    }
}

class Stringbuff_function {

    public static void main(String args[])
    {
        course course_obj = new course();

        StringBuffer sb1 = new StringBuffer("Welcome To Java Programming");         
        System.out.println("sb1: "+sb1+course_obj);   // get string of object using toSting()
        System.out.println("sb1.length(): "+sb1.length()+"\t\tsb1.capacity(): "+sb1.capacity());

        sb1.setLength(35);
        System.out.println("\nAfter sb1.setLength(35): ");        
        System.out.println("sb1.length(): "+sb1.length()+"\t\tsb1.capacity(): "+sb1.capacity());

        sb1.ensureCapacity(50);
        System.out.println("\nAfter sb1.ensureCapacity(50): ");
        System.out.println("sb1.length(): "+sb1.length()+"\t\tsb1.capacity(): "+sb1.capacity());  
        
        // v.charAt(int) : return character of specified poision 
        System.out.println("\nsb1.charAt(11): "+ sb1.charAt(11));

        //append/ concatenation : String v.append(string).append(string).append(String)...........
        sb1.append(" "+2023+ " ").append("in ").append("University");
        System.out.println("\nsb1.append(\" \"+2023+ \" \").append(\" in \").append(\"University\") :\n sb1 : "+ sb1);

        /*
        v.getChars( start, end, c1, c1_start_index) used to convert substring or entire String into char array.
        */
        char[] char_arr1 = new char[sb1.length()];
        sb1.getChars(11,15,char_arr1,0);
        System.out.print("\nchar_arr1 = sb1.getChars(11,15,char_arr1,0)["+sb1+"] : ");  
        System.out.println(char_arr1);

        // v.setCharAt(int index, int char) : set character of specified index
        sb1.setCharAt(11 , 'X');
        System.out.println("\nsb1.setCharAt(11 , 'X') : "+ sb1);

        // v.insert(int index, string) : insert String/int/character/object in specified index
        StringBuffer sb2 = new StringBuffer("I Java.");
        System.out.println("\nsb2 : "+ sb2);
        sb2.insert(2 , "like ");   
        System.out.println("sb2.insert(2 , \"like \") :\nsb2 : "+ sb2);     
        sb2.insert(sb2.length()-1 , (" in "+ 2023));
        System.out.println("sb2.insert(sb2.length()-1 , (\" in \"+ 2023)) :\nsb2 : "+ sb2);

        sb2.insert(sb2.length()-1 ,course_obj); // insert string of object using toSting()
        System.out.println("sb2.insert(sb2.length()-1 ,course_obj) :\nsb2 : "+ sb2);

        /* 
         v.delete(start index, end index) :    delete characters in pecified range index      
         v.deleteCharAt(index) : delete single character in string 
        */
        System.out.println("\nsb2 : "+ sb2);
        sb2.delete(11 , sb2.length());     
        System.out.println("After sb2.delete(11 , sb2.length()) :\nsb2 : "+ sb2);
        sb2.deleteCharAt(4);
        System.out.println("After sb2.deleteCharAt(4) :\nsb2 : "+ sb2);

        /*
        String str1.replace(start index, end index, string str2) : replace charactres in str1 with str2 in specific range index of str1.
        */
        System.out.println("\nsb1: "+sb1);
        sb1.replace(11,27, "World");
        System.out.println("After sb1.replace(11,27, \"World\"): " + sb1);        

        /*
        v.substring(start index) : return substring from starting to max length index.
        v.substring(start index, end index) : return substring from starting to end index specified.
        */
        System.out.println("\nsb1: "+sb1);
        System.out.println("sb1.substring(8): "+ sb1.substring(8)); 
        System.out.println("sb1.substring(8,3): "+ sb1.substring(11,18));

        //v.reverse() : reverse the existing string.
        sb2.reverse();
        System.out.println("\nAfter sb2.reverse() : sb2: "+ sb2);






    }
   
}
