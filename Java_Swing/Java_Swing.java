/*
author : Jaydatt Patel

What is JFC?
Java Foundation Classes are a set of Graphical User Interface. JFC adds rich graphics functionality and interactivity to Java applications. Java Foundation Classes are superset that contains AWT and completely written in java. Unlike AWT, Java Swing provides platformindependent and lightweight components.

Java Swing :
Swing is a Java Foundation Classes [JFC] library and an extension of the Abstract Window Toolkit [AWT]. Java Swing offers much-improved functionality over AWT, new components, expanded components features, and excellent event handling with drag-and-drop support.

Swing has about four times the number of User Interface [UI] components as AWT and is part of the standard Java distribution. By today’s application GUI requirements, AWT is a limited implementation, not quite capable of providing the components required for developing complex GUIs required in modern commercial applications. The AWT component set has quite a few bugs and does take up a lot of system resources when compared to equivalent Swing resources. Netscape introduced its Internet Foundation Classes [IFC] library for use with Java. Its Classes became very popular with programmers creating GUI’s for commercial applications.

The classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc. are provided by javax.swing package.

- Swing is a Set of API (API- Set of Classes and Interfaces)
- Swing is Provided to Design Graphical User Interfaces
- Swing is an Extension library to the AWT (Abstract Window Toolkit) 
- Includes New and improved Components that have been enhancing the looks and Functionality of GUIs’
- Swing can be used to build (Develop) The Standalone swing GUI Apps as Servlets and Applets
- It Employs model/view design architecture.
- Swing is more portable and more flexible than AWT, the Swing is built on top of the AWT.
- Swing is Entirely written in Java.
- Java Swing Components are Platform-independent, and The Swing Components are lightweight.
- Swing Supports a Pluggable look and feel and Swing provides more powerful components.
- such as tables, lists, Scrollpanes, Colourchooser, tabbed pane, etc.
- Further Swing Follows MVC.


• JButton : A push button that can display text, images, or both. 
• JLabel : A JLabel is an object component for placing text in a container.
• JCheckBox : A toggle button for displaying choices that are not mutually exclusive. 
• JCheckBox- MenuItem: A checkbox designed for use in menus.  
• JColorChooser : A complex, customizable component that allows the user to select a color from one or more color spaces. Used in conjunction with the javax.swing.color chooser package. 
• JComboBox : A combination of a text entry field and a drop-down list of choices. The user can type a selection or choose one from the list. 
• JComponent : The root of the Swing component hierarchy. Adds Swing- specific features such as tooltips and support for double- buffering. 
• JEditorPane : A powerful text editor, customizable via an EditorKit object.
Predefined editor kits exist for displaying and editing HTML- and
RTF-format text. 
• JFileChooser : A complex component that allows the user to select a file or directory. Supports filtering and optional file previews. Used in conjunction with
the javax.swing.file chooser package. 
• JLabel : A simple component that displays text, an image, or both. Does not respond to input. 
• JList : A component that displays a selectable list of choices. The choices are usually strings or images, but arbitrary objects may also be displayed. 
• JMenu : A pull-down menu in a JMenuBar or a submenu within another menu. 
• JMenuBar : A component that displays a set of pull-down menus. 
• JMenuItem : A selectable item within a menu. 
• JOptionPane : A complex component suitable for displaying simple dialog boxes. Defines useful static methods for displaying common dialog types.
• JPasswordField : A text input field for sensitive data, such as passwords. For security, does not display the text as it is typed.
• JPopupMenu : A window that pops   up   to   display   a   menu.   Used by JMenu and for standalone pop-up menus.
• JProgressBar : A component that displays the progress of a time- consuming operation.
• JRadioButton : A toggle button for displaying mutually exclusive choices. 
• JRadioButtonMenuItem : A radio button for use in menus. 
• JScrollBar : A horizontal or vertical scrollbar. 
• JSeparator : A simple component that draws a horizontal or vertical line. Used to visually divide complex interfaces into sections.
• JSlider : A component that simulates a slider control like those found on stereo equalizers. Allows the user to select a numeric value by dragging a knob. Can display tick marks and labels.
• JTable : A complex and powerful component for displaying tables and editing their contents. Typically used to display strings but may be
customized to display any type of data. Used in conjunction with the javax.swing.table package.
• JTextArea : A component for displaying and editing multiple lines of plain text. Based on JTextComponent.
• JTextComponent: The root component of a powerful and highly customizable text display and editing system. Part of the javax.swing.textpackage.
• JTextField : A component for the display, input, and editing of a single line of plain
text. Based on JTextComponent.
• JTextPane : A subclass of JEditorPane for displaying and editing formatted text that is not in HTML or RTF format. Suitable for adding simple word
processing functionality to an application.
• JToggleButton :  The parent component of both JCheckBox and JRadio Button. 
• JToolBar : A component that displays a set of user-selectable tools or actions. 
• JToolTip : A lightweight pop-up window that displays simple documentation or tips when the mouse pointer lingers over a component.
• JTree : A powerful component for the display of tree-structured data. Data values are typically strings, but the component can be customized to display any kind of data. Used in conjunction with the javax.swing.tree package. 
• Component :	A Component is the Abstract base class for about the non-menu user-interface controls of Java SWING. Components are representing an object with a graphical representation.
• Container :	A Container is a component that can container Java SWING Components
• Imagelcon : A ImageIcon control is an implementation of the Icon interface that paints Icons from Images
• JFileChooser : A JFileChooser it Controls represents a dialog window from which the user can select a file.
• JSpinner : A JSpinner this class is a single line input where the field that lets the user select by using a number or an object value from an ordered sequence.
 
 */
import javax.swing.*;

public class Java_Swing { 
 
    public static void main (String[] args) { 
        JFrame f = new JFrame(); 

        JButton b = new JButton("Click"); 
        b.setBounds(130,100,100,40); 
        f.add(b); 

        f.setSize(400,500); 
        f.setLayout(null); 
        f.setVisible(true); 
    } 
} 