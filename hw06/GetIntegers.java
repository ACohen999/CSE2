//Aaron Cohen
//CSE2
//Get Integers

//This program prompts users for 5 positive integers and prints their sum
//All integers are printed on seperate lines and non positive numbers or 
//non-integers will be rejected
//this is done with non-nested loops

import java.util.Scanner; //import scanner
//add public class
public class GetIntegers{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
        int sum = 0; //intialize final sum variable
        int i,n; //initialize test variable and input variable
        System.out.println("Please enter 5 non-negative integers: "); //prompt user for 5 integers
        //begin for loop
        for(i=0; i<5; i++){
            if(myScanner.hasNextInt()){ //test for integer value
                n= myScanner.nextInt(); //assign variable n to input value
                if (n>= 0){
                    sum+= n; //add n to sum if integer is positive
                }
                else{
                    System.out.println("Invalid input, enter again"); //ask user to re-enter value
                    i--; //subtract 1 from the test so invalid input doesn't count towards 5 values
                }
            }
            
            else{
                System.out.println("Invalid input, enter again"); //ask user for new valye
                String bad = myScanner.next();
                i--; //subtract one from test
            }  
        }
        System.out.println("Sum is:" + sum); //print the sum
    }
}