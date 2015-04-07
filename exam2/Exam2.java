//exam review
import java.util.Scanner;
import java.util.Random;

public class Exam2{
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
        Random rand= new Random();
        int number= rand.nextInt(10);
        System.out.println(number);
        boolean oOrE = even(number);
        if (oOrE== true){
            System.out.println("The random number is even!");
        }
        else{
            System.out.println("The random number is odd!");
        }
        
    }
    public static boolean even(int random){
        boolean oddOrEven= (random%2==0);
        return oddOrEven;
    }

        
    
}