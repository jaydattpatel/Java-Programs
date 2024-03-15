/*
author : Jaydatt Patel

The java Enum constants are static and final implicitly.
In Java, Enumerations or Java Enum serve the purpose of representing a group of named constants in a programming language. Java Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command-line flags, etc.
A Java enumeration is a class type. Although we don’t need to instantiate an enum using new, it has the same capabilities as other classes.

The enum constants have initial value that starts from 0, 1, 2, 3 and so on. But we can
initialize the specific value to the enum constants by defining fields and constructors. As
specified earlier, Enum can have fields, constructors and methods. 

Methods in the enum :

enum.values() : method can be used to return all values present inside the enum.
enum.valueOf() : method returns the enum constant of the specified string value if exists.
enum.ordinal() : each enum constant index can be found, just like an array index.

*/

public class Enum {
	
    public enum Color {
        RED,GREEN,BLUE;
    }

    public enum Season { 

        WINTER(5), SPRING(10), SUMMER(15), FALL(20); 
        private int value; 
        private Season(int value) { 
            this.value = value;      
        } 
    }

	public static void main(String[] args){

        System.out.print("Color: ");
		Color c1 = Color.RED;
		System.out.println(c1);

        System.out.print("Color Index: ");
        Color arr[] = Color.values();
        for (Color col : arr)
            System.out.print(col + "["+ col.ordinal()+"], "); // Calling ordinal() to find index of color.

        System.out.println("\nColor.valueOf(RED): "+Color.valueOf("RED"));    
        
        System.out.println("\nSeason with Index : ");
        for (Season s : Season.values()) 
            System.out.println("\t["+s.ordinal()+"] : "+ s + " " + s.value); 

	}
}
