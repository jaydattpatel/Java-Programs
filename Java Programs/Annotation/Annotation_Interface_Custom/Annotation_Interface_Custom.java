/*
author : Jaydatt Patel

Java annotations are used to provide meta data for Java code. Being meta data, Java
annotations do not directly affect the execution of the code, although some types of
annotations can actually be used for that purpose. Java annotations were added to Java from
Annotations are used to provide supplemental information about a program. 

- Annotations start with ‘@’.
- Annotations do not change the action of a compiled program.
- Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors methods, classes, etc.
- Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for example.
- Annotations basically are used to provide additional information, so could be an alternative to XML and Java marker interfaces.

Predefined/ Standard Annotations:
Java popularly defines seven built-in annotations as we have seen up in the hierarchy diagram.
Four are imported from java.lang.annotation: 
        @Retention, @Documented, @Target, @Inherited.
Three are included in java.lang: 
        @Deprecated, @Override and @SuppressWarnings

1. @Override: Indicates that a method in a subclass is intended to override a method in its superclass.
2. @Deprecated: Marks a method, class, or field as deprecated, indicating that it is no longer recommended for use.
3. @SuppressWarnings: Suppresses compiler warnings for a specific part of the code.
4. @FunctionalInterface: Indicates that an interface is intended to be a functional interface, which can have only one abstract method (SAM - Single Abstract Method).
5. @Retention: The @Retention annotation is used to specify how long an annotation should be retained. There are three retention policies:
        RetentionPolicy.SOURCE: The annotation is retained only in the source code and is discarded during compilation.
        RetentionPolicy.CLASS: The annotation is retained in the .class files but not available at runtime.
        RetentionPolicy.RUNTIME: The annotation is retained in the .class files and is available at runtime.

6. @Documented: The @Documented annotation indicates that the annotation should be included in the documentation generated by tools like Javadoc.
7. @Target: The @Target annotation specifies where the annotation can be applied, such as on classes, methods, fields, etc.
8. @Inherited: The @Inherited annotation indicates that an annotation type should be inherited to subclasses if it is annotated on a superclass.


There are three types of annotations.
1. Marker Annotation
2. Single-Value Annotation
3. Multi-Value Annotation 

1. Marker Annotation : An annotation that has no method, is called marker annotation.
            @interface MyAnnotation{}  

2. Single-Value Annotation : An annotation that has one method, is called single-value annotation.
        @interface MyAnnotation{  
            int value() [optional : default 0]; 
        } 

3. Multi-Value Annotation : An annotation that has more than one method, is called Multi-Value annotation. Default is optional. 
        @interface MyAnnotation { 
            int value1() default 1; 
            String value2() default ""; 
            String value3() default "xyz"; 
        } 

Let's see the code to apply the multi-value annotation :
    @MyAnnotation(value1=10,value2="ArunKumar",value3="Ghaziabad") 

 */


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// User-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{
	String Developer() default "Rahul"; 
	String Expirydate();
} // will be retained at runtime


public class Annotation_Interface_Custom{

	@TestAnnotation(Developer="Rahul", Expirydate="01-10-2020")
	void fun1(){
		System.out.println("Test method 1");
	}

	@TestAnnotation(Developer="Anil", Expirydate="01-10-2021")
	void fun2(){
		System.out.println("Test method 2");
	}
	
	public static void main(String args[]){
		System.out.println("Hello");
	}
}
