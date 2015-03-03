//Aaron Cohen
//CSE 2
//Make Symbols

//randomly generate a number 1-100
//print out that number of stars for even
//print that number of &s if it is odd

//add public class
public class MakeSymbols{
    //add main method
    public static void main( String[] args){
        int number = (int)(Math.random()*100 + 1); //generate a random number from 1 to 100
        System.out.println("Random number generated: " + number);
       //test for even numbers
        if (number%2 == 0){
            do{
                System.out.print("*"); //print a star
                number--; //subtract one from number
            }
            while(number>0); //stop program when number is at 0
            
        }
        else{
            do{
               System.out.print("&"); //print an &
               number--; //subtract 1 from number
            
            }
            while(number>0); //stop program when number is 0
            
        }
    }
    
}