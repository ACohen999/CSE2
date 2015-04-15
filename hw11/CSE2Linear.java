//Aaron Cohen
//CSE2
//CSE2 Linear
//homework #11

//have use enter 15 CSE2 grades and chekc them as integers and in valid range
//have user search for a specific grade using binary 
//scramble array and search again using linear

import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in); //define scanner class
        int [ ] array1 = new int[15]; //define array
        System.out.println("Enter 15 ints for CSE 2 final grades: "); //prompt user for values
        array1 = values(); //call values method
        System.out.println("The grades, sorted, are: "); //print this
        print(array1); //call the print method
        System.out.println("Enter a grade to search for: ");
        int input = myScanner.nextInt(); // assign input
        binary (array1, input); //call binary method
        System.out.println("Scambled: ");
        int [] array2 = new int[15];
        array2 = scramble(array1); //scramble method
        print(array2); //call the print method
        System.out.println("Enter a grade to search for: ");
        int input2 = myScanner.nextInt();
        linear(array2, input2); //call the linear method
    }
    //end of main method
    public static int[] values(){
        int [] array1 = new int[15];
        for(int i = 0; i <15; i++){
            while(true){
                Scanner myScanner = new Scanner (System.in);
                if(myScanner.hasNextInt()){
                    int value = myScanner.nextInt();
                    if(value>=0 && value <=100){
                        if(i == 0){
                            array1[i] = value;
                            break;
                        }
                        else{
                            if(value > array1[i-1]){
                                array1[i] = value;
                                break;
                            }
                            else{
                                System.out.println("Invalid input, try another. ");
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid input, try again. ");
                    }
                    
                }
                else{
                    System.out.println("Invalid input, enter an integer. ");
                }
            }
        }
        return array1;
    }
    
    public static void print(int [] array1){
        for(int i = 0; i<15; i++){
            System.out.print(array1[i] + " ");
        }
        
    }
    public static void binary(int [] array, int target){
        int low=0;
        int high=14;
        int mid= (low+high)/2; //find middle
        int iteration = 0; //set counter
        while(low<=high){
            iteration++;
            if(array[mid] < target){
                low = mid +1;
                mid = (low+high)/2;
            }
            else if(array[mid] == target){
                System.out.println(target + "was found in the list with" + iteration + "iterations.");
                break;
            }
            else{
                high = mid- 1;
                mid = (low+high)/2;
            }
        }
        if(low>high){
            System.out.println(target + "was not found in the list with" + iteration + "iterations.");
        }
    }
    
    public static int[] scramble(int[] array){
        Random generator = new Random(); //create random generator
        for(int i = array.length -1; i>0; i--){
            int index = generator.nextInt(i+1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }
    
    public static void linear(int [] array, int target){
        boolean found = false; //set to false
        for(int i =0; i<15; i++){
            if(array[i] == target){
                System.out.println(target + "was found in the list with" + (i+1) + "iterations.");
                found = true; //change value to true
                break;
            }
        }
        if(found != true){
            System.out.println(target + "was not found in the list with 15 iterations.");
        }
    }
}