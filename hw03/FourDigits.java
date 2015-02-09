//Aaron Cohen
//CSE02
//hw03
//Program #3
//Four Digits

import java.util.Scanner; //import scanner

//assign class
public class FourDigits {
    //main method
    public static void main(String [] args){
        Scanner myScanner = new Scanner( System.in ); //set up scanner to accept user inputs
        System.out.print("Enter a double, and I display the four digits right of the decimal point: "); //prompt user to enter double
        double input = myScanner.nextDouble(); //set input to scanner as a double
        
        //identify the desired 4 digits
        int Step1 = (int) input;//make the input an integer
        int Step2 = Step1*10000; //multiply previous number by 10k
        int Step3 = (int)(input * 10000); //multiply input by 10k
        int answer = Step3-Step2; //subtract step2 from step3
        
        
        //print the results
        System.out.println("The four digits to the right of the decimal point are "+ answer); 
        
    }
}