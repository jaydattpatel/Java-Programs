/*
author : Jaydatt Patel

What is JFC?
Java Foundation Classes are a set of Graphical User Interface. JFC adds rich graphics functionality and interactivity to Java applications. Java Foundation Classes are superset that contains AWT and completely written in java. Unlike AWT, Java Swing provides platformindependent and lightweight components. JFC stands for Java Foundation Classes. JFC is the set of GUI components that simplify desktop Applications. Many programmers think that JFC and Swing are one and the same thing, but that is not so. JFC contains Swing [A UI component package] and quite a number of other items:

Cut and paste: Clipboard support.
Accessibility features: Aimed at developing GUIs for users with disabilities.
The Desktop Colors Features were first introduced in Java 1.1
Java 2D: it has Improved colors, images, and text support.

AWT : 
Although the most powerful and exciting features of the JFC were introduced in the later versions of the Java, the JFC also includes the graphics and GUI features of Java 1.0 and Java 1.1. These features are provided by the Abstract Windowing Toolkit (AWT). The graphics and GUI capabilities of the AWT are rudimentary, and many of them have been superseded
by more advanced features in Java. Nevertheless, the AWT is the bedrock upon which more advanced JFC functionality is built. 

 */
import java.awt.*;

public class Java_AWT { 
 
    public static void main (String[] args) { 

        Frame f = new Frame();  // create frame object

        Label l1 = new Label("Select known Languages :"); // create label object
        l1.setBounds(100, 50, 150, 30); // set position and size
        f.add(l1); //add to frame
        
        Checkbox c1 = new Checkbox("Hindi"); // CheckBox created
        c1.setBounds(100, 80, 80, 30);
        f.add(c1);
 
        // CheckBox created
        Checkbox c2 = new Checkbox("English");
        c2.setBounds(100, 110, 80, 30);
        f.add(c2);
 
        // CheckBox created
        Checkbox c3 = new Checkbox("Gujarati");
        c3.setBounds(100, 140, 80, 30);
        f.add(c3);

        Button b1 = new Button("SUBMIT");
        b1.setBounds(100, 170, 80, 25);
        f.add(b1);
 
        Button b2 = new Button("CANCEL");
        b2.setBounds(200, 170, 80, 25);
        f.add(b2); 

        f.setSize(400,500); 
        f.setLayout(null); 
        f.setVisible(true); 
    } 
} 