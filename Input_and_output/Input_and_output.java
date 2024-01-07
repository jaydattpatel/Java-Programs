/*
author: Jaydatt Patel
Using Scanner Class for Taking Input in Java :

import java.util.Scanner;

Inbuilt Scanner functions are as follows:
Integer,int: nextInt()
Float,float: nextFloat()
String : next() and nextLine()
 */

//import java.io.*;
import java.util.Scanner;

class Input_and_output {
  public static void main(String args[])
    {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = scn.nextLine(); //next() and nextLine()
        System.out.println(str);
                
        System.out.print("Enter integer:");
        int val = scn.nextInt();
        System.out.println(val);

        System.out.print("Enter long:");
        long val1 = scn.nextLong();
        System.out.println(val1);

        System.out.print("Enter Float:");
        float f = scn.nextFloat();
        System.out.println(f);

        System.out.print("Enter Double:");
        double d = scn.nextDouble();
        System.out.println(d);

        System.out.print("Enter Boolean(true or false):");
        boolean bool = scn.nextBoolean();
        System.out.println(bool);
        

        //println print string and move to new line
        System.out.println("1.println " + " val:" + val + " str:" + str);
        System.out.println("2.println new line");
    	
        //println print string but not move to new line
        System.out.print("1. print "+ " val:" + val + " str:" + str);
        System.out.print("\t2. print"+ " val:" + val + " str:" + str);

        //printf print string in customize formate.
        System.out.printf("\n1.printf"+ " val:"+ val + " str:" + str);        
        System.out.printf("\n2.printf"+ " val:%d" + " str:%s", val , str);

    }
}
