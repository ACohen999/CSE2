//Aaron Cohen
//CSE2
//4/28/15

//create a ragged 4d array of random doubles between 0 and 30
//use various methods that manipulate arrays

import java.util.Scanner; //import scanner
import java.util.Random; //import random generator
//define class
public class FourDwin{
    //add main method
    public static void main(String [] arg){
        int x = 0;
        int y =0;
        int z = 0;
        System.out.println("Enter an X: ");
        while(z<1){
            Scanner myScanner = new Scanner(System.in);
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                if(x>0){
                    z++;
                }
                else{ System.out.println("Input integer is invalid. Please enter an integer. ");}
            }
            else{ System.out.println("Input integer is invalid. Please try again.");}
        }//end while loop
        System.out.println("Enter an integer Y that is greater than x. ");
        int i = 0;
        while(i<1){
            Scanner myScanner = new Scanner(System.in);
            if(myScanner.hasNextInt()){
                y = myScanner.nextInt();
                if(y>x){
                    i++;
                }
                else{
                    System.out.println("Invalid input. Please enter a Y value greater than X.");
                }
            }
            else{ System.out.println("Invalid input, please enter an integer.");}
        }// end while loop
        Random randy = new Random();
        int m = (randy.nextInt(y-x+1)+x);
        int n = (randy.nextInt(y-x+1)+x);
        int o = (randy.nextInt(y-x+1)+x);
        double [][][][] array = new double[3][m][n][o];
        
        for(int a = 0; a<3; a++){
            for(int b =0; b<m; b++){
                for(int c= 0; c<n; c++){
                    for(int d =0; d<o;d++){
                        double value = (randy.nextDouble()*30.0); 
                        array[a][b][c][d] = value;
                    }
                }
            }
        }//end of for loops
        System.out.println("Original array: ");
        printArray(array);
        System.out.println("Sorted Array: ");
        double[][][][] sorted;
        sorted = sort4DArray(array);
        printArray(sorted);
        System.out.println();
        statArray(sorted);
        
    }//end main method
    
    public static void printArray(double [][][][] array){
        System.out.print("{");
        for(int d =0; d<array.length; d++){
            System.out.print("{");
            for(int f = 0; f<array[d].length; f++){
                System.out.print("{");
                for(int h = 0; h<array[d][f].length; h++){
                    System.out.print("{");
                    for(int g = 0; g<array[d][f][h].length; g++){
                        System.out.printf("%1$.1f",array[d][f][h][g]);
                        System.out.print(", ");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("}");
        }
        System.out.print("}");
        System.out.println();
    }//end of method
    
    public static double[][][][] sort4DArray(double [][][][] array){
        for(int i = 1; i<array.length; i++){
            for(int j  = i-1; j>=0; j--){
                if(array[j].length > array[j+1].length){
                    double [][][] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                else if(array[j].length == array[j+1].length){
                    array[j] = sort3DArray(array[j]);
                }
            }
        }
        return array;
    }// end of method
    
    
    public static double[][][] sort3DArray(double [][][] array){
        for(int i = array.length - 1; i>=0; i--){
            int max = i;
            for(int j =i;j>=0; j--){
                if((array[j].length) > (array[max].length)){
                    max = j;
                }
            }
            double [][] temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        return array;
    }//end of method
    
    public static void statArray(double [][][][] array){
        int number = 0;
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                for(int k =0; k<array[i][j].length; k++){
                    for(int l = 0; l<array[i][j][k].length; l++){
                        sum+= array[i][j][k][l];
                        number++;
                    }
                }
            }
        }
        System.out.println( );
        System.out.println("Members: " + number);
        System.out.println("Sum: " + sum);
       
        System.out.println("Mean: " +  (sum/number));
        
    }//end of method
}