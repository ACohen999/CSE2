//Aaron Cohen
//CSE 2
//Homework #4
//Which Number

import java.util.Scanner; //import scanner

//assign class
public class WhichNumber{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //set up scanner
        String answer=""; //initialize variable
        String answer1=""; //initialize variable
        String answer2=""; //initialize variable
        String answer3=""; //initialize variable
        String answer4=""; //initialize variable
        String answer5=""; //initialize variable
        System.out.println("Think of a number between 1 and 10 inclusive."); //prompt user to think of a number
        System.out.print("Is your number even?"); //ask if user's number is even
        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")){
            answer= myScanner.next();
            } //validate user's answer
            else{
                System.out.println("Sorry, that is not a valid input."); //tell the user their input is invalid
                return; //leave the program
            }
        
        if (answer.equals("Y") || answer.equals("y")){
            System.out.print("Is your number divisible by 3?"); //ask user if number is divisible by 3
            if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    answer2 = myScanner.next();
            }
            else{
                System.out.println("Sorry, that is not a valid input."); //tell them their input is invalid
                return; //leave the program
            }
                if(answer2.equals("Y") || answer2.equals("y")){
                    System.out.println("Your number is 6!"); //tell the user their number is 6
                    return;
                    }//leave program
        
                else{
                    System.out.print("Is your number divisible by 4?"); //ask user if number is divisible by 4
                }
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    answer3 = myScanner.next(); //validate their answer
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input."); //tell them their input is invalid
                        return; //leave the program
                    }
                    if(answer3.equals("Y") || answer3.equals("y")){
                        System.out.print("Is the number divided by 4 greater than 1?"); //ask them this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        answer4 = myScanner.next(); //validate their answer
                        }
                        else{
                            System.out.print("Sorry, that is not a valid input"); //tell them their input is invalid
                            return; //leave the program
                        }
                        if(answer4.equals("Y") || answer4.equals("y")){
                            System.out.println("Your number is 8!"); //tell them their number is 8
                            return; //leave the program
                        }
                        else{
                            System.out.println("Your number is 4!"); //tell them their number is 4
                            return; //leave the program
                            
                        }
                    }           
                    else{ System.out.print("Is it divisible by 5? "); //ask them this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        answer5 = myScanner.next();
                        }
                        else {
                        System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                        return;     //leaves the program
                        }
                        if (answer5.equals("Y") || answer5.equals("y")) {
                        System.out.println("Your number is 10! ");         //print this question
                        return;     //ends the program
                        }
                        else {
                        System.out.println("Your number is 2!");     //print this question
                        return;     //ends the program
                        }
                    }
                }
                else {
                    System.out.print("Is it divisible by 3? ");     //print this question
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    answer2 = myScanner.next();
                }
                else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                }
                if (answer2.equals("Y") || answer2.equals("y")) {
                    System.out.print("When divided by 3, is the result greater than 1? ");         //print this question
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    answer3 = myScanner.next();
                    }
                    else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                    }
                    if (answer3.equals("Y") || answer3.equals("y")) {
                        System.out.println("Your number is 9! ");         //print this answer
                        return;     //ends the program
                    }
                    else {
                        System.out.println("Your number is 3!");     //print this answer
                        return;     //ends the program
                    }
                }
                else {
                    System.out.print("Is it greater than 6? ");     //print this question
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    answer3 = myScanner.next();
                    }
                    else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                    }
                    if (answer3.equals("Y") || answer3.equals("y")) {
                        System.out.println("Your number is 7!");         //print this answer
                        return;     //ends the program
                    }
                    else {
                        System.out.print("Is it less than 3? ");     //print this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        answer4 = myScanner.next();
                        }
                        else {
                        System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                        return;     //leaves the program
                        }
                        if (answer4.equals("Y") || answer4.equals("y")) {
                        System.out.println("Your number is 1!");         //print this answer
                        return;     //ends the program
                        }
                        else {
                        System.out.println("Your number is 5!");     //print this answer
                        return;     //ends the program
                        }
                    
                     }
        
                }  
                }
        }
}
    