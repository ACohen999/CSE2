//Aaron Cohen
//CSE2
//Run Factorial

//This program will calculate factorials of numbers between 9 and 16 using while loops

import java.util.Scanner; //import scanner
//declare public class
public class RunFactorial{
    //add main method
    public static void main( String args[]){
        Scanner myScanner = new Scanner (System.in); //declare scanner instance
        System.out.println("Please enter an integer between 9 and 16 (inclusive): "); //prompt user for input
        if(myScanner.hasNextInt()){
            int integer = myScanner.nextInt(); //assign integer to scanner value
            if (integer<9 || integer>16){
                System.out.println("Invalid input, enter again!"); 
            }
            else{
                System.out.println("Input accepted: "); //print input accepted
                int a = integer; //define variable
                int answer= 1; //initialize answer variable
                while(a>0){
                    answer*=a;
                    a--; //subtract one from multiplier
                    
                }
                System.out.println(integer + "!=" + answer); //print the answer
            }
        }
        
       else{
           System.out.println("Invalid input, please enter again!");
       } 
    }
    
}