/*
author: Jaydatt Patel
String args[]
pass command line arguments using powershell or command prompt: 
java args_arguments.java -t +2 asd 
 */

public class args_arguments {

    public static void main(String args[])
    {
        for(String arg : args) 
            System.out.println(arg);
        
        System.out.println("count: "+args.length);
    }
}
