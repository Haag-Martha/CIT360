package cit360;

/**
*
* @author martha
*/

import java.util.Scanner;

public class Application {
   public static void main(String[] args){
       ApplicationControlPattern dispatcher = new ApplicationControlPattern();
       String add = "add";
       String sub = "sub";
       String div = "div";
       String mul = "mul";
 
       Integer num1 = -5;
       Integer num2 = 5;
       String command;

       Scanner in = new Scanner(System.in);

       System.out.println("What's the first number you'd like to calculate? ");
       num1 = Integer.parseInt(in.nextLine());

       System.out.println("How would you like to calculate it? (+, -, /, or *): ");
       command = in.nextLine();
       if (command.equals("+") || command.equals("-") || command.equals("/") || command.equals("*")){

       } else {
           System.out.println("You MUST enter a valid calulation operator."
                   + "\nRestart and try again with +, -, /, or * with no spaces");
           return;
       }

       System.out.println("What's your second number? ");
       num2 = Integer.parseInt(in.nextLine());

       if (num2 == 0 && command.equals("/")){
           System.out.println("Error! Does not compute! Cannot divide by 0. Please restart and try again.");
           return;
       } else{
           System.out.print(num1 + " " + command + " " + num2 + " = ");
           ApplicationControlPattern.handleCommand(command,num1,num2);
       }

   }
}
