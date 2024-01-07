/*
author: Jaydatt Patel
Different String functions
String is immutable and characters or String length will be constant and can not modify it.. 
*/

class string_fun {

    public static class A_class{
        int id;
        String name;

        A_class(int a,String s)
            {id = a; name = s;}

        public String toString(){
            return(" id :" + id+" name : "+ name);
        }

    }
    public static void main(String args[])
    {
      
        String str1 = "Welcome ";         
        char temp[] = {'T','o'};
        String str2 = new String(temp); 
        String str3 = new String(str1+str2+" Java Programming");
        System.out.println("\nstr1: "+str1+"\nstr2: "+str2+"\nstr3: "+str3);
    
        //toString() overloaded
        A_class obj = new A_class(123,"XYZ123");
        String str4 = "Class toString() overloaded- str4 : " + obj;
        System.out.println("\n"+str4);        

        //String variable s.isEmpty() to check empty or not, s.isBlank() to chech string is empty or white space only
        System.out.println("\nstr3.isEmpty(): "+str3.isEmpty());        
        System.out.println("str3.isBlank(): "+str3.isBlank());      
        System.out.println("\"   \".isBlank(): "+"   ".isBlank());


        //String variable s.toLowerCase(), s.toUpperCase() to get upper and lower case string
        System.out.println("\n\"University\".toLowerCase(): "+"University".toLowerCase());
        System.out.println("\"University\".toUpperCase(): "+"University".toUpperCase());
        System.out.println("str3.toLowerCase(): "+str3.toLowerCase());
        System.out.println("str3.toUpperCase(): "+str3.toUpperCase());

        //String(byte[] byte_arr). Construct a new String by decoding the byte array. It uses the platform’s default character set for decoding.
        byte[] byte_arr1 = {65,66,67,68,69};
        String str5 =new String(byte_arr1); 
        System.out.println("\nstr4 = String(byte_arr) : "+str5);

        /*  
        convert byte[],char[],int[] into String :
        String(byte[] b_array, int start_index, int count)        
        String(char[] char_array, int start_index, int count)        
        String(int[] int_array, int start_index, int count)     */
        byte[] byte_arr2 = {75, 76, 77, 78, 79};
        String str6 = new String(byte_arr2, 1, 3); 
        System.out.println("str6  = String(byte_arr2, 1, 3): "+ str6);

        char[] char_arr1 =  {75, 76, 77, 78, 79};
        String str7 = new String(char_arr1, 1, 3);
        System.out.println("str7  = String(char_arr1, 1, 3): "+ str7);

        int[] int_arr =  {75, 76, 77, 78, 79};
        String str8 = new String(int_arr, 1, 3);
        System.out.println("str8 =  String(int_arr, 1, 3): "+ str8);

        /*
        v.getChars( start, end, c1, c1_start_index) used to convert substring or entire String into char array.
        */
        char[] char_arr2 = new char[str3.length()];
        str3.getChars(11,15,char_arr2,0);
        System.out.print("char_arr2 = str3.getChars(11,15,char_arr2,0)["+str3+"] : ");  
        System.out.println(char_arr2);

        //v.toCharArray() used to convert entire String to Character array
        char[] char_arr3 = str3.toCharArray();
        System.out.print("char_arr3 = str3.toCharArray()["+str3+"] : ");  
        System.out.println(char_arr3);

        
        /*
        v.length() : return length of String
        v.charAt(int) : return character of specified poision
        v.substring(start index) : return substring from starting to max length index.
        v.substring(start index, end index) : return substring from starting to end index specified.
        */
        System.out.println("\n\"Welcome To Java\".length(): "+ "Welcome To Java".length());        
        System.out.println("\"Welcome To Java\".charAt(11): "+ "Welcome To Java".charAt(11));
        System.out.println("\"Welcome To Java\".substring(8): "+ "Welcome To Java".substring(8));        
        System.out.println("\"Welcome To Java\".substring(3,7): "+ "Welcome To Java".substring(3,7));


        //concatenation : String v.concat(string).concat(String).concat(String)...........
        String str9 = str1.concat(" "+str2+ " ").concat("Java").concat(" in ").concat("University");
        System.out.println("\ns1.concat(str2).concat(str3).concat(\"in\").concat(\"University\") :\n str9 : "+ str9);

        /*
        String v.indexOf(string) : Match string and return first index number. If not match then -1. 
        String v.indexOf(string, from index) : Match string from specific index number and return first index number. If not match then -1.
        */ 
        System.out.println("\n\"Welcome To Java\".indexOf(\"avj\"): "+ "Welcome To Java".indexOf("avj"));      
        System.out.println("\"Welcome To Java\".indexOf(\"Java\"): "+ "Welcome To Java".indexOf("Java"));              
        System.out.println("\"Learn Share Learn\".indexOf(\"a\",3): "+ "Learn Share Learn".indexOf("a",3));

        //String v.lastIndexOf(string, from index) : Match string in reverse order and return last matching index number. If not match then -1.       
        System.out.println("\"Learn Share Learn\".lastIndexOf(\"a\"): "+ "Learn Share Learn".lastIndexOf("a"));        
        System.out.println("\"Learn Share Learn\".lastIndexOf(\"a\",4): "+ "Learn Share Learn".lastIndexOf("a",4));


        /* 
        String v.equals(String) : return bool after compare characters between two string  in Case sensitive 
        v.equalsIgnoreCase(String) : return bool after compare characters between two string ignoring Case sensitive 
        */
        System.out.println( "\n\"Java\".equals(\"Java\"): "+"Java".equals("Java")); // returns true
        System.out.println( "\"Java\".equals(\"java\"): "+"Java".equals("java")); // returns false
        System.out.println( "\"Java\".equalsIgnoreCase(\"Java\"): "+"Java".equalsIgnoreCase("Java")); // returns true
        System.out.println( "\"Java\".equalsIgnoreCase(\"java\"): "+"Java".equalsIgnoreCase("java")); // returns true

        /*
        v.compareTo(String) : returns difference str1-str2 after compare characters between two string in Case sensitive in dictionary order.    
        v.compareToIgnoreCase(String) : returns difference str1-str2 after compare characters between two string ignoring Case sensitive dictionary order.
        if out<0, str1 comes before str2. if out=0, str1 and str2 are equal. if out>0, str1 comes after str2. */
        System.out.println( "\n\"Java\".compareTo(\"Java\"): "+"Java".compareTo("Java")); // returns true
        System.out.println( "\"Java\".compareTo(\"java\"): "+"Java".compareTo("java")); // returns false
        System.out.println( "\"Java\".compareToIgnoreCase(\"Java\"): "+"Java".compareToIgnoreCase("Java")); // returns true
        System.out.println( "\"Java\".compareToIgnoreCase(\"java\"): "+"Java".compareToIgnoreCase("java")); // returns true

        //String v.contains(String) Returns true if string match found else false.
        System.out.println("\n\"Welcome To Java\".contains(\"Java\"): "+ "Welcome To Java".contains("Java"));

        // Java String class intern() method returns the interned string. It can be used to return string from memory if it is created by a new keyword. It creates an exact copy of the heap string object in the String Constant Pool.
        //Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool. 

        String str10 = new String("Java");        
        String str11 = new String("Java");
        System.out.println("(str10 == str11)" +" ("+str10+" == "+str11+") : " +(str10 == str11));   // return false

        String str12 = new String("Java").intern();        
        String str13 = new String("Java").intern();
        System.out.println("(str12 == str13)" +" ("+str12+" == "+str13+") : " +(str12 == str13));   // return true


        /*  
        v.regionMatches() : compares specific region inside a string
        boolean regionMatches(int str1StartIndex, String str2,  int str2StartIndex, int length_char)
        boolean regionMatches(boolean ignoreCase, int str1StartIndex, String str2,  int str2StartIndex, int length_char)
        */
        String str14 = new String("Welcome To Java");
        String str15 = new String("Java");        
        String str16 = new String("java");
        System.out.println("\nstr14.regionMatches(11, str15, 0, 4) : "+
                            str14.regionMatches(11, str15, 0, 4));
        System.out.println("str14.regionMatches(11, str16, 0, 4) : "+
                            str14.regionMatches(11, str16, 0, 4));
        System.out.println("str14.regionMatches(true, 11, str16, 0, 4) : "+
                            str14.regionMatches(true,11, str16, 0, 4));  


        /* 
        v.startWith(string) , v.startWith(string,offset) :
        This method of the String class checks whether the given string starts with the specified string prefix or not.
        v.endsWith(string), v.endsWith(string,offset) :
        This method of the String class checks whether the given string ends with the specified string suffix or not.
        */
        System.out.println("\nstr3.startsWith(\"Wel\")"+"["+str3+"] : "+ str3.startsWith("Wel"));
        System.out.println("str3.startsWith(\"To\")"+"["+str3+"] : "+ str3.startsWith("To"));
        System.out.println("str3.endsWith(\"Java\")"+"["+str3+"] : "+ str3.endsWith("Java"));
        System.out.println("str3.endsWith(\"ing\")"+"["+str3+"] : "+ str3.endsWith("ing")); 


        //String v.trim() : Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        System.out.println("\n\"    University    \".trim(): "+"    University    ".trim());

        /*
        String v.replace(old char, new char) :Returns new string by replacing all occurrences of oldChar with newChar.
        String v.replaceFirst(old char, new char) : Returns new string by replacing first occurrences of oldChar with newChar.
        */
        System.out.println("\n\"Welcome To Java\".replace(\"Java\", \"World\"): "+ "Welcome To Java".replace("Java", "World"));
        System.out.println("\"Welcome To Java\".replaceFirst(\"a\", \"@\"): "+ "Welcome To Java".replaceFirst("a", "@"));

        //String v.repeat(int) : Returns new string by repeating string as per number count.
        System.out.println("\n\"Welcome \".repeat(3): "+ "Welcome ".repeat(3));

        //String v.valueOf() method converts different types of values into string.
        System.out.println("\n(String.valueOf(30)+10): "+(String.valueOf(30)+10));        
        System.out.println("(String.valueOf(15.4)+10): "+(String.valueOf(15.4)+10));

        /*
        String v.split("\\s") : splits the string based on whitespace 
        String v.split("\\s",word limit) : splits the entire string based on whitespace into specific word limit but zero for no limit
        String v.split("string",word limit) splits the entire string based on whitespace into specific word limit but zero for no limit
        */
        String str17[] = str3.split("\\s");
        System.out.println("\nstr17[] = str3.split(\"\\s\") : "); 
        for(int i = 0; i < str17.length; i++ )
            System.out.println("str17["+i+"] : "+str17[i]);


        String str18[] = str3.split("\\s",2);
        System.out.println("\nstr18[] = str3.split(\"\\s\",2) : "); 
        for(int i = 0; i < str18.length; i++ )
            System.out.println("str18["+i+"] : "+str18[i]);
        
        String str19[] = "Welcome@To@Java@Programming".split("@",2);
        System.out.println("\nstr19[] = \"Welcome@To@Java@Programming\".split(\"@\",2) : "); 
        for(int i = 0; i < str19.length; i++ )
            System.out.println("str19["+i+"] : "+str19[i]);



    }
   
}
