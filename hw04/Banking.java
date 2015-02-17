//Aaron Cohen
//CSE 2
//HW04
//Banking
//Write a program using switch statements to allow users to process bank statements

import java.util.Scanner; //import scanner
import java.util.Random;  //import random number generator

//Define a class
public class Banking{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );  //declare an instance of the scanner
        int min = 1000; //set minimum valie
        int max = 5000; //set maximum value
        Random r = new Random(); //initialize random
        int initialBal = r.nextInt(max - min + 1) + min; //create random value
        String Input= ""; //initialize string variable
        int Input2=0; //initialize integer variable
        System.out.println("Your initial balance is $" + initialBal); //print the starting balance
        System.out.print("Would you like to make a deposit, withdraw money, or view account balance? (enter d, w, or v)" ); //ask user what function they are performing
        if (myScanner.hasNext("w") || myScanner.hasNext("d") || myScanner.hasNext("v")) {
            Input = myScanner.next(); //validate user input
        }
        else{
            System.out.println("This is an invalid response."); //tell the user their response wasn't valid
            return; //leave the program
        }
        switch (Input){
            case "w" :
                System.out.print("How much would you like to withdraw? (Enter an integer) ");     //ask user question
                if (myScanner.hasNextInt()) {
                    Input2 = myScanner.nextInt(); //accept user input
                }
                else {
                    System.out.print("This is an invalid response>"); //tell user their response is not valid
                    return;     //leaves the program
                }
                if (Input2 <=initialBal &&  Input2>= 0) {
                    System.out.println("Your current balance is $" +(initialBal - Input2)); //print new account balance
                }
                else {
                    System.out.println("This is an invalid input"); //tell user input is invalid
                }
                break;  //finish case
            case "d" :
                System.out.print("How much would you like to deposit? (Enter an integer) "); //ask user how much they want to deposit
                if(myScanner.hasNextInt()){
                    Input2 = myScanner.nextInt(); //accept user input
                }
                else{
                    System.out.println("This is an invalid response."); //tell the user their response is invalid
                    return; //leave the program
                }
                if(Input2>= 0){
                   System.out.println("Your current balance is $" + (initialBal+Input2)); //print 
                }
                else{
                    System.out.println("Deposits must be positive quantities."); //tell the user their input is unaacceptable
                }
                break; //finish case "d"
            case "v" :
                System.out.print("Your current balance is " +initialBal); //print current balance
                break; //end case "v"
        }
        
        
    } //end main method
} //end of class