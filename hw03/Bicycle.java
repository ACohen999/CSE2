//Aaron Cohen
//CSE02
//hw03 Program #1
//Bicylcle

import java.util.Scanner; //import scanner
//assign class
public class Bicycle {
    //main method
    public static void main(String [] args){
    //set up scanner
    Scanner myScanner;
    //give scanner a value
    myScanner= new Scanner(System.in);
    
    //prompt user to enter number of seconds
    System.out.print("Enter the number of seconds: ");
    //accept user input
    int nSeconds= myScanner.nextInt();
    
    //prompt user to enter number of counts
    System.out.print("Enter number of counts: ");
    //accept user input
    int nCounts= myScanner.nextInt();
    
    //create variables to calculate distance
    double wheelDiameter=27.0; //diameter of the wheel
    double Pi= 3.14159; //value of pi
    double feetPerMile= 5280; //number of feet per mile
    double inchesPerFoot=12; //number of inches in a foot
    double secondsPerMinute=60; //number of seconds in a minute
    
    //calulations for distance and velocity
    double distanceTrip= nCounts*wheelDiameter*Pi/inchesPerFoot/feetPerMile; //solve for distance in inches and convert to miles
    double timeMinutes= (double) nSeconds/60; //convert seconds to minutes
    double avgMPH= distanceTrip/timeMinutes*60; //calculate velocity in miles per hour
    
    //print results
    System.out.println("The average distance was " +distanceTrip +" and took " +timeMinutes +" minutes."); //print distance and time
    System.out.println("The average mph was " +avgMPH); //print velocity (mph)
    }
}