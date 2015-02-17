//Aaron Cohen
//CSE 02
//lab04
//2/13/15

import java.util.Scanner; //import scanner

//write program to determine if there are enough cookeis for people to get desired number
//check to make sure all inputs are valid
//add class
public class Cookies{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    Scanner myScanner; 
   			    int nPeople=0; //initialize variable nPeople
   			    int nCookies=0; //intialize variable nCookies
   			    myScanner = new Scanner ( System.in ); //declare instance of scanner object
   			    System.out.print("Enter the number of people attending event: "); //prompt user to enter number of guests
   			    if(myScanner.hasNextInt()){
   			        nPeople= myScanner.nextInt(); //declare scanner input as nPeople
   			     }
   			     else{
   			         System.out.println("You did not enter an integer"); //tell user input is invalid
   			         return; //leaves the program and terminate it
   			         }
   			    if(nPeople > 0){
   			        System.out.print("Enter the number of cookies you are planning to buy: ")
   			    }
   			    else{
   			        System.out.println("You did not enter an integer greater than 0"); //tell t
   			        return;//leave the program and terminate it
   			        }
   			    if(myScanner.hasNextInt()){
   			        nCookies = myScanner.nextInt(); //declare scanner input as nCookies
   			    }
   			    else{
   			        System.out.println("You did not enter an integer greater than 0"); //tell user input is invalid
   			    }
   			    if(nCookies>0){
   			        System.out.print("How many do you want each person to get?"); //prompt user to enter number for each person
   			    }
   			    else{
   			        System.out.println("You did not enter an integer greater than 0"); //tell user input is invalid
   			    
   			        
  
   			    
   			    
   			     

   			    
   			    
   			    

}  //end of main method   
  	} //end of class

