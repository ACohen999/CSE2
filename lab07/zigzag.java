//Aaron Cohen
//CSE2
//Lab07

import java.util.Scanner;

public class zigzag{
    
    public static void main(String[] args) {
    	
    	while (true) {
		
    	Scanner scan = new Scanner(System.in);
    	
    	int nStars = 0;
    	
    	boolean goodInput = false;
    	
    	System.out.print("Enter an int between 3 and 33: ");
    	while(goodInput == false) {
    		if (scan.hasNextInt()) {
				nStars = scan.nextInt();
				if (nStars > 2 && nStars < 34) {
					goodInput = true;
				} else {
					System.out.println("Invalid Input - Not beteen 3 and 33");
				}
			} else {
				System.out.println("Invalid Input - Not an integer");
				scan.next();
			}
    	}
    	
    	for (int i = 0; i < nStars-1; i++) {
			System.out.print("*");
		}
    	
    	for (int i = 0; i < nStars-1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println(" ");
		}
    	
    	for (int i = 0; i < nStars; i++) {
			System.out.print("*");
		}
    	
    	System.out.println("");
    	System.out.print("Enter y or Y to go again: ");
    	
    	String response = scan.next();
    	char letter = response.charAt(0);
    	
    	if(!(letter == 'y') && !(letter == 'Y')) {
    		break;
    	}
    	
    	System.out.println("");
    	}
    	
    }
    
}