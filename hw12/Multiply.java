//Aaron Cohen
//CSE2
//HW12
//Multiply

import java.util.Scanner; //import scanner
import java.util.Random; //import random


public class Multiply{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in); // declare scanner
        int width = 0;
        int width2 = 0;
        int height = 0;
        int height2 = 0;
        while(true){
            System.out.println("Matrix One Dimensions");
            while(true){
                System.out.print("Enter Height: ");
                if(myScanner.hasNextInt()){
                    height = myScanner.nextInt();
                    if(height>0){
                        break;
                    }
                    else{ System.out.println("Invalid height, dimensions must be positive. Please ");
                    continue;
                    }
                }
                else{
                    System.out.println("Invalid hiehgt, dimension must be positive integer. Please ");
                    myScanner.next();
                }
            }
            while(true){
                System.out.print("Enter Width: ");
                if(myScanner.hasNextInt()){
                    width = myScanner.nextInt();
                    if(width <= 0){
                        System.out.print("Invalid width, dimensions must be postiive. Please ");
                        continue;
                    }
                    else{ break; }
                }
                else{
                    System.out.println("Invalid width, dimensions must be positive integers. Please ");
                    myScanner.next();
                }
            }
            System.out.println(" ");
            System.out.println("Matrix Two Dimensions");
            while(true){
                System.out.print("Enter Height: ");
                if(myScanner.hasNextInt()){
                    height2 = myScanner.nextInt();
                    if(height2>0){ break; }
                    else{
                        System.out.println("Invalid height, dimensions must be postive. Please ");
                        continue;
                    }
                }
                else{
                    System.out.println("Invalid height, dimensions must be positive integers. Please ");
                    myScanner.next();
                }
            }
            while(true){
                System.out.print("Enter Width: ");
                if(myScanner.hasNextInt()){
                    width2 = myScanner.nextInt();
                    if(width2 > 0){break; }
                    else{
                        System.out.println("Invalid width, dimensions must be positive. Please ");
                        continue;
                    }
                }
                else{
                    System.out.println("Invalid width, dimensions must be positive integers. Please ");
                    myScanner.next();
                }
            }
            if(width == height2){break;}
            else{
                System.out.println("Invalid inputs, the width of matrix 1 must equal height of matrix 2");
                continue;
            }
        }
        System.out.println(" ");
        int[][] matrix1 = randomMatrix(width,height);
        System.out.println("Matrix 1 dimensions: (" + height + "X" + width + ")");
        printMatrix(matrix1);
        System.out.println(" ");
        int[][] matrix2 = randomMatrix(width2, height2);
        System.out.println("Matrix 2 dimensions: (" + height2 + "X" + width2 + ")" );
        printMatrix(matrix2);
        System.out.println(" ");
        
        int[][] multiplied = matrixMultiply(matrix1,matrix2);
        printMatrix(multiplied);
        
    }
    public static int[][] randomMatrix(int width, int height){
        Random random = new Random();
        int[][] array = new int[height][width];
        for(int i = 0; i<height; i++){
            array[i] = new int[width];
            for(int j = 0; j<width; j++){
                array[i][j] = random.nextInt(21)-10;
            }
        }
        return array;
    }
    
    public static void printMatrix( int[][] array){
       for(int i = 0; i<array.length; i++){
           System.out.print("[");
           for(int j = 0; j<array[i].length; j++){
               System.out.print(array[i][j] + " ");
           }
           System.out.print("]\n");
       }
    }
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        int height = array1.length;
        int width = array2[0].length;
        int [][] multiplied = new int[height][width];
        for(int i = 0; i<height; i++){
            for(int j = 0; j <width; j++){
                for(int k = 0; k<array1[i].length; k++){
                    multiplied[i][j] += (array1[i][k]*array2[k][j]);
                }
            }
        }
        return multiplied;
    }
}