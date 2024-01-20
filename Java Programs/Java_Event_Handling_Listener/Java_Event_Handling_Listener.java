/*
 author : Jaydatt Patel

 An event can be defined as changing the state of an object or behavior by performing actions. Actions can be a button click, cursor movement, keypress through keyboard or page scrolling, etc. 

 1. Foreground Events
Foreground events are the events that require user interaction to generate, i.e., foreground events are generated due to interaction by the user on components in Graphic User Interface (GUI). Interactions are nothing but clicking on a button, scrolling the scroll bar, cursor moments, etc.

2. Background Events
Events that don’t require interactions of users to generate are known as background events. Examples of these events are operating system failures/interrupts, operation completion, etc.

Source: Events are generated from the source. There are various sources like buttons, checkboxes, list, menu-item, choice, scrollbar, text components, windows, etc., to generate events.

Listeners: Listeners are used for handling the events generated from the source. Each of these listeners represents interfaces that are responsible for handling events.
 */

import java.awt.*;
import java.awt.event.*;


public class Java_Event_Handling_Listener extends Frame {

   public static void main(String args[]) {
   
       Frame frame = new Frame();
       frame.setTitle("Demo Button Events");
       frame.setSize(600,500); 
       frame.setLayout(new FlowLayout()); 

       Label Label = new Label("Select a button ");

       TextField textField = new TextField();
       TextArea textArea = new TextArea();

       Button Submit = new Button("Submit"); 
       Button Cancel = new Button("Cancel"); 

      textField.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent ae) { 
            Label.setText(ae.getActionCommand()); 
         } 
      }); 

       Submit.addActionListener(new ActionListener() { 
          public void actionPerformed(ActionEvent ae) { 
             Label.setText("Submit was pressed."); 
          } 
       }); 

       Cancel.addActionListener(new ActionListener() { 
          public void actionPerformed(ActionEvent ae) { 
             Label.setText("Cancel was pressed."); 
          } 
       }); 
       frame.add(textArea);
       frame.add(textField);
       frame.add(Label); 

       frame.add(Submit); 
       frame.add(Cancel); 

       frame.setVisible(true); 
   }
}