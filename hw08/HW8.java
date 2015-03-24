//Aaron Cohen
//CSE2
//hw08
//HW8- Adventure World Game

//This lab will use various coding methods to create a user experience in an interactive game
//the main method will run the game and utilize other methods

//import scanner
import java.util.Scanner;
//import math class
import java.lang.Math;

public class HW8{
    //method to create giant
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    //method to create cave
       public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    //method to create boxes
     public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    //method to continue
    public static String getInput(Scanner scan, String string){
        //get user input
        String check= "";
        check= scan.next();
        //continue given a c or C
        if(check.equals("C") || check.equals("c")){
            return string;
        }
        else{
            System.out.println("Yea right LOSER!");
            System.exit(1);
        }
        return string;
    }
        
    public static String getInput(Scanner scan, String string, int trial){
        //create a hit counter
        int hits = 0;
        //create loop that runs until Giant is dead
        while(hits<trial){
            String fight = "";
            fight= scan.next();
            if(fight.equals("A") || fight.equals("a")){
                int hit = (int)(Math.random()*11);
                if (hit>=5){
                    System.out.println("Critical Hit!");
                    hits++;
                }
                else{
                    System.out.println("Gosh! How did you miss it!");
                }
            }
            //if user chooses to run
            if (fight.equals("E") || fight.equals("e")){
                int flee = (int)(Math.random()*11);
                if (flee == 10){
                    System.out.println("You successfully escaped!");
                    break;
                }
                else{
                    System.out.println("You failed to escape");
                }
            }
            if(!fight.equals("E") || !fight.equals("e") || !fight.equals("A") || !fight.equals("a")){
                System.out.println("Excecuted by the Giant, Game Over!");
                System.exit(1);
            }
            if(hits<trial){
                System.out.println("Enter A or a to ATTACK, E or e to ESCAPE, anything else to YIELD");
                
            }
        }
        return string;
    } 
    
    //method to choose treasure box
    public static String getInput(Scanner scan){
        int box = scan.nextInt();
        switch(box){
            case 1:
                System.out.print("You've won $10,000");
                break;
            case 2:
                System.out.print("You've won a half eaten turkey sandwhich");
                break;
            case 3: 
                System.out.print("You've won a one-on-one date with Betty White");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                System.exit(1);
                break;
        }
        String string = "t";
        return string;
    }
    
    //include main method from hw google doc
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }

}



