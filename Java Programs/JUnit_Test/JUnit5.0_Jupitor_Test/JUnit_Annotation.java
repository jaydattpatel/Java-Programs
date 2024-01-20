/*
author : Jaydatt Patel
-----------------------------------------------------------------------------------------------
JUnit Test

 */

import static org.junit.Assert.*;
// import static org.junit.Assert.assertArrayEquals;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;
// import static org.junit.Assert.assertNotSame;
// import static org.junit.Assert.assertNull;
// import static org.junit.Assert.assertTrue;

import org.junit.*;
// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;

import org.junit.jupiter.api.RepeatedTest;


class MathProvider {

    public int add(int firstNumber, int secondNumber) { 
        return (firstNumber + secondNumber);  
    } 

    public int divide(int firstNumber, int secondNumber) { 
        return (firstNumber / secondNumber);  
    } 
} 
    
public class JUnit_Annotation {

    MathProvider provider;

    @Before
    public void setUp() {
        System.out.println("Before test---------------\nCreating MathProvider object."); 
        provider = new MathProvider(); 
    }

    @Test
    @RepeatedTest(3)
    public void addTest() {
        System.out.println("Starting test : " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 2;
        assertEquals(firstNumber + secondNumber, provider.add(firstNumber, secondNumber));
        System.out.println("Ending test : " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    @RepeatedTest(5)
    public void divideTest() {
        System.out.println("Starting test : " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 2;
        assertEquals(firstNumber / secondNumber, provider.divide(firstNumber, secondNumber));
        System.out.println("Ending test : " + new Object(){}.getClass().getEnclosingMethod().getName());
    }
    
    @After
    public void tearDown() {
        System.out.println("After test---------------\n\n"); 
    }

} 
