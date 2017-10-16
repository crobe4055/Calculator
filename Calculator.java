/*
 Program Name: Assigment 3 version 1
 Programmer:   Christopher Roberts
 Written Date: 03/18/2016
 Instructor:   Prof. Ramos
 Course:       Java 
 
 
 1.Create a Java Swing Calculator. The calculator can add, subtract, multiply and divide.
   
   
 2.Analysis: Identifier   Type      Default  Min      Max      Description
             -----------  --------  -------  -------  -------  --------------
   Constants:    

   Inputs:       operand1
                 operand2     
		   
   Outputs:      result
		  
   Equations: if (addition = true) result = operand1 + operand2;
              if (subtraction = true) result = operand1 - operand2;
              if (multiplication = true) result = operand1 * operand2;
              if (division = true) result = operand1 / operand2; 

   Output Layout:
                  GUI
 
 

 3.Design (pseudocode):
 
   1. Import Java swing and awt libraries.
   2. Create Frame for calculator.
   3. Create Buttons for calculator .
	4. Create Workspace for calculations.
	5. Create Actions for each individual button.
	6. Add Buttons, Workspace and Actions to Calculator.
   7. Create an Instance of Calculator to test.
   8. END PROGRAM.
   
   ____________________________________________________________________________________________________________________________________________	
*/



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
  
public class Calculator extends JFrame 
{
   
   public JTextArea workspace = new JTextArea();                                 // Creates workspace for calculations.
   
   private JButton one, two, three,                                              // Creates individual buttons for calculator
                   four, five, six, 
                   seven, eight, nine, 
                   zero, add, subtract, 
                   multiply, divide, decimal, 
                   equal, clear, plus_minus;
                                    
                                   
   private double operand1;                                                      // Input of the first number.                              
   private double operand2;                                                      // Input of the second number.
   private double result;                                                        // Calculations of two operands
   private Boolean addition = false,                                             // Boolean used to determine which choice the equal button should use.
                   subtraction = false, 
                   multiplication = false, 
                   division = false;
    
//-----------------------------------------------------------------
//  Main Function
//-----------------------------------------------------------------

   public static void main(String [] args)
   {
      Calculator c = new Calculator();                                           // Creates an instance of Calculator called 'c'.
      c.setVisible(true);                                                        // Allows Component to be visible
      c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                         // Closes calculator
   }  

//-----------------------------------------------------------------
//  Calculator
//-----------------------------------------------------------------

   public Calculator()
   {
      super("Calculator");
      Frame(this);
      WorkSpace();
      Buttons();
      BActions();
   }

//-----------------------------------------------------------------
//  Calculator Frame
//-----------------------------------------------------------------      
   private void Frame(Calculator c)
   {   
      c.setSize(307,410);                                                       // Sets dimensions of calculator
      c.setResizable(false);                                                    // Sets calculator to not be resizeable
      c.setLocationRelativeTo(null);                                            // Sets calculator to always open in center of screen
      c.setLayout(null);                                                        // Allows for Absolute Positioning
      setAppearance();                                                          // Makes calculator visible
   }   
   
 
//-----------------------------------------------------------------
//  Calculator Appearance
//-----------------------------------------------------------------
 
   public static void setAppearance()                                        
   {
      try
      {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());                     // Makes the calculator look like the System's Theme.
      }
      catch(UnsupportedLookAndFeelException e){e.printStackTrace();}
      catch(ClassNotFoundException e){e.printStackTrace();}
      catch(InstantiationException e){e.printStackTrace();}
      catch(IllegalAccessException e){e.printStackTrace();}
   }
   
//-----------------------------------------------------------------
//  Calculator Workspace
//-----------------------------------------------------------------   
   private void WorkSpace()
   {
      workspace.setBounds(5,10,291,50);
      workspace.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);                            
      workspace.setText("0");                                                    // Default screen shows '0'.
      workspace.setEditable(false);
      workspace.setFont(new Font("Arial",Font.BOLD,30));
      add(workspace);
   
   }
       
//-----------------------------------------------------------------
//  Calculator Buttons
//-----------------------------------------------------------------      
   private void Buttons()
   {
    
   
   // One Button                         
      one = new JButton("1");                                     // Initializes buttons.
      one.setBounds(10,194,65,55);                                // Sets button size and placement.
      one.setFont(new Font("Arial",Font.BOLD,20));                // Sets font size of button
      add(one);                                                   // Adds button to calculator.
   
   // Two Button   
      two = new JButton("2");
      two.setBounds(82,194,65,55);
      two.setFont(new Font("Arial",Font.BOLD,20));
      add(two);
      
   // Three Button   
      three = new JButton("3");
      three.setBounds(154,194,65,55);
      three.setFont(new Font("Arial",Font.BOLD,20));
      add(three);
   
   // Four Button   
      four = new JButton("4");
      four.setBounds(10,132,65,55);
      four.setFont(new Font("Arial",Font.BOLD,20));
      add(four);
   
   // Five Button   
      five = new JButton("5");
      five.setBounds(82,132,65,55);
      five.setFont(new Font("Arial",Font.BOLD,20));
      add(five);
   
   // Six Button   
      six = new JButton("6");
      six.setBounds(154,132,65,55);
      six.setFont(new Font("Arial",Font.BOLD,20));
      add(six);
   
   // Seven Button   
      seven = new JButton("7");
      seven.setBounds(10,70,65,55);
      seven.setFont(new Font("Arial",Font.BOLD,20));
      add(seven);
      
   // Eight Button   
      eight = new JButton("8");
      eight.setBounds(82,70,65,55);
      eight.setFont(new Font("Arial",Font.BOLD,20));
      add(eight);
   
   // Nine Button   
      nine = new JButton("9");
      nine.setBounds(154,70,65,55);
      nine.setFont(new Font("Arial",Font.BOLD,20));
      add(nine);
   
   // Zero Button   
      zero = new JButton("0");
      zero.setBounds(10,256,65,55);
      zero.setFont(new Font("Arial",Font.BOLD,20));
      add(zero);
   
   // Add Button   
      add = new JButton("+");
      add.setBounds(226,256,65,55);
      add.setFont(new Font("Arial",Font.BOLD,20));
      add(add);
   
   // Subtract Button   
      subtract = new JButton("-");
      subtract.setBounds(226,194,65,55);
      subtract.setFont(new Font("Arial",Font.BOLD,20));
      add(subtract);
   
   // Multiply Button   
      multiply = new JButton("*");
      multiply.setBounds(226,132,65,55);
      multiply.setFont(new Font("Arial",Font.BOLD,20));
      add(multiply);
   
   // Divide Button   
      divide = new JButton("/");
      divide.setBounds(226,70,65,55);
      divide.setFont(new Font("Arial",Font.BOLD,20));
      add(divide);
      
   // Decimal Button   
      decimal = new JButton(".");
      decimal.setBounds(82,256,65,55);
      decimal.setFont(new Font("Arial",Font.BOLD,20));
      add(decimal);
      
   // Equal Button   
      equal = new JButton("=");
      equal.setBounds(154,318,137,55);
      equal.setFont(new Font("Arial",Font.BOLD,20));
      add(equal);
      
   // Plus_Minus Button   
      plus_minus = new JButton("+/-");
      plus_minus.setBounds(154,256,65,55);
      plus_minus.setFont(new Font("Arial",Font.BOLD,20));
      add(plus_minus);
      
   // Clear button  
      clear = new JButton("Clear");
      clear.setBounds(10,318,137,55);
      clear.setFont(new Font("Arial",Font.BOLD,20));
      add(clear);
     
    
   }
   
//-----------------------------------------------------------------
//  Button Actions
//-----------------------------------------------------------------  
   private void BActions()
   {
      one.addActionListener(                                      // Creates an action to go with each corresponding button.
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("1");
                  return;
               }
               
               workspace.append("1");
            }
         });
   
      two.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("2");
                  return;
               }                 
               workspace.append("2");
            }
         });
   
      three.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("3");
                  return;
               }
               
               workspace.append("3"); 
            }
         });
         
      four.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("4");
                  return;
               } 
               
               workspace.append("4");
            }
         });
         
      five.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("5");
                  return;
               }
               
               workspace.append("5"); 
            }
         });
         
      six.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("6");
                  return;
               }                  
               workspace.append("6");
            }
         });
         
      seven.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("7");
                  return;
               }
               
               workspace.append("7"); 
            }
         });
         
      eight.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("8");
                  return;
               }                  
               workspace.append("8");
            }
         });
         
      nine.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("9");
                  return;
               }                  
               workspace.append("9"); 
            }
         });
         
      zero.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().length() > 13)
               {
                  return;
               }
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  workspace.setText("0");
                  return;
               }                  
               workspace.append("0"); 
            }
         });
         
      add.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               operand1 = input();
               workspace.setText("");
               addition = true;
               subtraction = false;
               multiplication = false;
               division = false;
            }
         });
         
      subtract.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               operand1 = input();
               workspace.setText("");
               addition = false;
               subtraction = true;
               multiplication = false;
               division = false;              
            }
         });
         
      multiply.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               operand1 = input();
               workspace.setText("");
               addition = false;
               subtraction = false;
               multiplication = true;
               division = false;
            }
         });
         
      divide.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               operand1 = input();  
               workspace.setText("");
               addition = false;
               subtraction = false;
               multiplication = false;
               division = true;
            }
         });
         
      decimal.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               if (workspace.getText().contains("."))
               {
                  return;
               }
               workspace.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); 
               workspace.append(".");
            }
         });
         
      equal.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               workspace.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
               operand2 = input();
               if(addition == true)
               {
                  result = operand1 + operand2;
                  workspace.setText(Double.toString(result));
               }
               if(subtraction == true)
               {
                  result = operand1 - operand2;
                  workspace.setText(Double.toString(result));
               } 
               if(multiplication == true)
               {
                  result = operand1 * operand2;
                  workspace.setText(Double.toString(result));
               } 
               if(division == true)
               {
                  result = operand1 / operand2;
                  workspace.setText(Double.toString(result));
               }  
            }
         });
         
      plus_minus.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               workspace.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
               if (workspace.getText().equalsIgnoreCase("0"))
               {
                  return;
               }
               workspace.setText(Double.toString(Double.parseDouble(workspace.getText()) * (-1)));
               if (workspace.getText().endsWith(".0"))
                  workspace.setText(workspace.getText().replace(".0",""));
            }
         });
         
      clear.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               workspace.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
               workspace.setText("0");                                                        // Sets the display blank
            
            }
         });
   }
   
//-----------------------------------------------------------------
//  Input for Addition, Subtraction, Multiplication, Division
//-----------------------------------------------------------------    
   private double input()
   {
      Double number;
      String input;
      input = workspace.getText();
      number = Double.valueOf(input);
      return number;
   }
}
