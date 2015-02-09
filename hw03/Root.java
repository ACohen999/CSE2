//Aaron Cohen
//CSE02
//hw03
//Program #2
//Roots

import java.util.Scanner; //import scanner

//assign class
public class Root {
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //set up scanner 
        System.out.print("Enter a double,and I print its cube root-"); //print purpose of program
        double X= myScanner.nextDouble(); //accept the input
            //guess the root
            double guess1 = X/3;
            double guess2 = (2*guess1*guess1*guess1+X)/(3*guess1*guess1);
            double guess3 = (2*guess2*guess2*guess2+X)/(3*guess2*guess2);
            double guess4 = (2*guess3*guess3*guess3+X)/(3*guess3*guess3);
            double guess5 = (2*guess4*guess4*guess4+X)/(3*guess4*guess4);
            double guess6 = (2*guess5*guess5*guess5+X)/(3*guess5*guess5);
         
            
            double Test = (guess6*guess6*guess6);//ID variable to test cube root
            //print result
            System.out.println("The cube root is: "+guess6 +":");
            System.out.println(guess6+" * "+guess6+" * "+guess6+" = "+Test);
                        
        
        
        
    }
}