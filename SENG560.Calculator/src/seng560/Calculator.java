/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seng560;

import java.util.Scanner;
import arithmetic.Arithmetic;


/**
 *
 * 
 * @author mc
 */
public class Calculator {
        
       
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();  // using the Arithmetic library by dcorion
 //       String currentValueString = null; 
        Integer currentValue = 0; 
//        boolean currentValueIsFloat = false; 
//        boolean enteredValueIsFloat = false;
        String enteredValueString;
        Integer enteredValue; 
        
        String enteredOperation = null; 
        
    System.out.println("Welcome to simple calculator, enter number then operation, "
            + "/n accepted operations are +,-,/,* /n numbers are integer only for alpha version. "
            + "type exit to quit"); 
   
  Scanner sc = new Scanner(System.in);

  //currentValueString = sc.nextLine().strip(); 
  
  validstartingnumber: while(true){
            System.out.println("Enter Number");
          enteredValueString = sc.nextLine().strip();       
    try {
        currentValue = Integer.valueOf(enteredValueString);
        break validstartingnumber;     
        } catch(NumberFormatException e) {
         System.out.println("Invalid Integer Try again " + enteredValueString);
    }
  }
  
  //System.out.println("Current Value "+currentValue);
    
  eventloop: while(!"exit".equalsIgnoreCase(enteredOperation)){
         
   validcommand: while(true) {
   System.out.println("Enter Operation ");
    enteredOperation = sc.nextLine().strip();
        switch (enteredOperation){
            case "+","-","*","/" -> {
               // System.out.println("operand is "+enteredOperation);
                break validcommand;
            }
            case "exit" ->{
                System.out.println("Bye");
                break eventloop;
                }           
            default -> System.out.println("miss understood "+enteredOperation+" please try anouther operation");
            }
            
           }
   
   validnumber: while(true){
        System.out.println("Enter Number");
        enteredValueString = sc.nextLine().strip();
       if ("exit".equalsIgnoreCase(enteredValueString)){
        break eventloop;
           }
    try {
        enteredValue = Integer.valueOf(enteredValueString);
        break validnumber;     
    } catch(NumberFormatException e) {
        System.out.println("Invalid Integer Try again " + enteredValueString);
    }
    
   }
 //System.out.println(enteredValueString);
     switch (enteredOperation){
            case "+" -> {
                currentValue = arithmetic.add(currentValue,enteredValue);       
            }
            case "-" -> {
                currentValue = arithmetic.subtract(currentValue, enteredValue);       
            }
            case "*" -> {
                currentValue = arithmetic.multiply(currentValue, enteredValue);       
                }
            case "/" -> {
                try {
                    currentValue = arithmetic.divide(currentValue, enteredValue);
                } catch (Exception e) {
                    System.out.println("Divide by zero, try a different operation or value");
                //break;    
                    }
                }
            case "exit" ->{
                System.out.println("Bye");
                break eventloop;
            }   
        }
   
   System.out.println("Current Total "+ currentValue);
   
    }
//System.out.println(outputBase);
//System.out.println(currentValueString);
/* will wait for input then assign it to the variable,
 * in this case it will wait for an int.
 */
    
    }
    
}
