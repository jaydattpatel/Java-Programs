/*
author : Jaydatt Patel
JUnit Test 
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {
 
    public static void main(String[] args) { 

    System.out.println("============= Test Calling ============="); 
    
    //This statement is to load all type of results in the result object 
    Result result = JUnitCore.runClasses(JUnit_Annotation.class); 

    System.out.println("============= Test Terminated ============="); 

    
    //Here it is getting the run count from the result object 
    System.out.println("Total number of tests : " + result.getRunCount()); 
    
    //This is to get the failure count from the result object 
    System.out.println("Total number of tests failed : " + result.getFailureCount());

    for(Failure failure : result.getFailures()) 
        System.out.println("Failure : "+ failure.getMessage()); //message only in case of failure  

    System.out.println("Successful : "+ result.wasSuccessful()); 
    
    } 
} 

/*
Output:
============= Test Calling =============
Before test---------------
Creating MathProvider object.
Starting test : divideTest
Ending test : divideTest
After test---------------


Before test---------------
Creating MathProvider object.
Starting test : addTest
Ending test : addTest
After test---------------


============= Test Terminated =============
Total number of tests : 2
Total number of tests failed : 0
Successful : true


 */