import java.util.Scanner;
import java.util.Random;

public class continued{
    public static void main(String[] args){
        Scanner myScanner= new Scanner (System.in);
        int input=1;
        while(input != 0){
            System.out.println("Please enter a number from 1 to 7, 0 to quit");
            input = myScanner.nextInt();
            if(input !=1){
                System.out.println("The day you entered is: " + convertToDay(input));
            }
        }
    }    
    public static String convertToDay(int number){
        String day = "";
        switch(number){
            case 1: day = "Monday";
            break;
            case 2: day = "Tuesday";
            break;
            case 3: day = "Wednesday";
            break;
            case 4: day = "Thusday";
            break;
            case 5: day = "Friday";
            break;
            case 6: day = "Satuday";
            break;
            case 7: day = "Sunday";
            break;
            default: day = "not a day";
            break;
        }
        return day;  
    }
        
}
        
    
	   
	       