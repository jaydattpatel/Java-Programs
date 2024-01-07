/*
 author: Jaydatt Patel
 Exception handing: 
    try{
            //statements that may cause an exception
        }
    catch (){
            // error handling code
        }
    ..catch (){
            // error handling code
        }
    // optional
    finally {  
        // this block of code to be always executed after try block ends even exception generated or not 
    }

Custom Exception : New class of error can  be created by extending exisiting error class of java libraries.. This new class of exception can be created like any other ordinary class. However, this class
will have to extend one of the below classes
1. java.lang.Throwable 
2. java.lang.Exception
3. java.lang.RuntimeException

            
 */
import java.util.Scanner;

class AgeException extends Exception {
        // the default constructor  
        AgeException() {       
            System.out.println("Invalid Age encountered");   
        } 
}   

public class Exception_custom {

    // The method that throws the custom exception should explicitly state them. In the below example the method 'validate' throws exception AgeException
    public static void validate(int age) throws AgeException
    { 
        if (age <= 0) { 
            throw(new AgeException()) ; // throw the specific custom exception 
        } 
    }
    
    public static void main(String args[]) 
    { 
        boolean valid_inputs = false; 
        int age = 0; 
        Scanner scn = new Scanner(System.in);
        while (valid_inputs == false) 
        { 
            try {     
                System.out.println("Enter age : "); 
                age = scn.nextInt();
                validate(age); 
                valid_inputs = true;
            } 
            catch (Exception e) { 
                valid_inputs = false; 
                System.out.println("Re-enter inputs!"); 
            } 
        } 
        System.out.println("Inputs valid!"); 
    }         
        
}
