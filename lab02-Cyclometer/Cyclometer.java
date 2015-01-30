//Aaron Cohen
//January 30, 2015
//CSE 02
//record and print data from bicycle cyclometer
//print minutes per trip, number of counts for each trip, distance per trip, distance of combine trips
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480; //identify number of seconds in trip 1
        int secsTrip2=3220; //identify number of seconds in trip 2
        int countsTrip1=1561; // identify number of counts in trip 1
        int countsTrip2=9037; // identify number of counts in trip 2
        double wheelDiameter=27.0, //diameter of bicycle wheels
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet in one mile
        inchesPerFoot=12, //number of inches per foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; // ID these variables as doubles
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+ "minutes and had" + 
            countsTrip1 + "counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+ "minutes and had" + 
            countsTrip2 + "counts.");
            distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance=distanceTrip1+distanceTrip2;

        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
 	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");



               
        
        
    } //end of main methd
} //end of class
