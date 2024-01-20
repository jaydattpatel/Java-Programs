/*

author: Jaydatt Patel

An assertion allows testing the correctness of any assumptions that have been made in the program. An assertion is achieved using the assert statement in Java. While executing assertion, it is believed to be true. If it fails, JVM throws an error named AssertionError. It is mainly used for testing purposes during development. 

The assert statement is used with a Boolean expression and can be written in two different ways.

First way: 
    assert expression;

Second way : 
    assert expression1 : expression2;
    exp1: boolean
    exp2: int,string,obj,etc... 

Enabling Assertions : By default, assertions are disabled. We need to run the code as given. The syntax for enabling assertion statement in Java source code is

        java –ea file_name  Or  java –enableassertions file_name

Disabling Assertions: The syntax for disabling assertions in java is

        java –da file_name  or  java –disableassertions file_name


 */


public class Assertion{

    public static void main(String args[]) throws Exception
    {
          
        int value = 15;
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value);
        
    }
}