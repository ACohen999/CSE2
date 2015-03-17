//Aaron Cohen
//CSE2
//March 17, 2015
//Waves

//write a program that creates 3 stacks of numbers
//repeat this using For loops, while loops and do-while loops

import java.util.Scanner; //import scanner

public class waves{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //declare instance of scanner
        int input; //initialize input
        do{
            System.out.println("Enter a number between 1 and 30 (inclusive):"); //prompt user for input
            while(!myScanner.hasNextInt()){
                System.out.println("Input must be an integer");//tell user input is invalid
                myScanner.next();
            }
            input = myScanner.nextInt();
        }
        while (input>30 || input<1);
        System.out.println();
        //use for loop
        System.out.println("FOR LOOP:");
        
        for(int i= 1; i<=input; i++){
            if(i%2 ==0){
                for(int k=0; k< i; k++){
                   for(int j=0; j<=k; j++){
                       System.out.print(i);
                   }
                   System.out.println("");
                }
            }
            else{
                for(int k =i; k>0;k--){
                    for(int j = k; j>0; j--){
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
            
        }
        
        //use while loop
        System.out.println("WHILE LOOP");
        int i = 1;
        int k= 0;
        int j = 0;
        
        while(i<= input){
            if(i%2 ==0){
                k=0;
                while(k<1){
                    j=0;
                    while(j<=k){
                        System.out.print(i);
                        j++;
                    }
                    System.out.println("");
                    k++;
                }
            }
            else{
                k=1;
                while(k>0){
                    j=k;
                    while(j>0){
                        System.out.print(i);
                        j--;
                    }
                    System.out.println("");
                    k--;
                }
            }
            i++;
        }
        
        //use do-while loop
        System.out.println("DO-WHILE LOOP:");
        i=1;
        k=0;
        j=0;
        
        do{
            if(i%2 == 0){
                k=0;
                do{
                    j=0;
                    do{
                    System.out.print(i);
                    j++;
                    
                }
                while(j<=k);
                
                System.out.println("");
                k++;
                
            }
            while(k<i);
        }
        else{
            k=i;
            do{
                j=k;
                do{
                    System.out.print(i);
                    j--;
                }
                while(j>0);
                System.out.println("");
                k--;
            }
            while(k>0);
        }
        i++;
        }while(i<=input);
        
    }
}