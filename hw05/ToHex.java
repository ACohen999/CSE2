//Aaron Cohen
//CSE2
//HW04
//To Hex
//This program takes 3 decimal inputs representing RGB values
//It then converts them into hexidecimal 

import java.util.Scanner; //import the scanner
//define public class
public class ToHex{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //set up scanner to accept user input
        //intitialize user input variables
        int valueR= 0;
        int valueG= 0;
        int valueB= 0;
        System.out.println("Please enter 3 numbers representing RGB values: "); //prompt user to enter three RGB numbers
        if (myScanner.hasNextInt() && myScanner.hasNextInt() && myScanner.hasNextInt()){
        valueR= myScanner.nextInt(); //assign R integer value
        valueG= myScanner.nextInt(); //assign G integer value
        valueB= myScanner.nextInt(); //assign B integer value
        }
        else{
            System.out.print("Sorry, you must enter integers");
            return; //terminate program
        }
        
        //divide all inputs by 16
        int rDivBy16 = valueR/16;
        int gDivBy16 = valueG/16;
        int bDivBy16 = valueB/16;
        //find the remainder from above division
        int remainderR = valueR%16;
        int remainderG = valueG%16;
        int remainderB = valueB%16;
        
        if((valueR>255) || (valueR<0) || (valueG>255) || (valueG<0) || (valueB>255) || (valueB<0)){
            System.out.print("sorry, you must enter integers between 0 and 255");
            return; //terminate program
            
        }
        else{
            //print inputs in the format below
            System.out.print("The decimal numbers R:"+valueR+", G:"+valueG+", B:"+valueB+", is respresented in hexidecimal as: ");
            //begin swtich statement for first digit of R value
            switch (rDivBy16){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }
            //begin switch statement for R second digit
            switch (remainderR){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }
            //begin switch statement for G fist digit
            switch (gDivBy16){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }       
            //begin switch statement for G second digit
            switch (remainderG){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }  
            //begin switch statement for B first digit
            switch (bDivBy16){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }
            //begin switch statement for B second digit
            switch (remainderB){
                case(0):
                    System.out.print("0");
                    break;
                case(1):
                    System.out.print("1");
                    break;
                case(2):
                    System.out.print("2");
                    break;
                case(3):
                    System.out.print("3");
                    break;
                case(4):
                    System.out.print("4");
                    break;
                case(5):
                    System.out.print("5");
                    break;
                case(6):
                    System.out.print("6");
                    break;
                case(7):
                    System.out.print("7");
                    break;
                case(8):
                    System.out.print("8");
                    break;
                case(9):
                    System.out.print("9");
                    break;
                case(10):
                    System.out.print("A");
                    break; 
                case(11):
                    System.out.print("B");
                    break;
                case(12):
                    System.out.print("C");
                    break;
                case(13):
                    System.out.print("D");
                    break;
                case(14):
                    System.out.print("E");
                    break;
                case(15):
                    System.out.print("F");
                    break;
            }
        }
        
    }
}