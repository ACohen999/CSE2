//Aaron Cohen
//CSE2
//hw10
//Remove Elements
//copy code from google doc
//write additional methods to satisfy specifications in homework description

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
	
  }
  
  public static int[] randomInput(){
      int [] randomArray = new int[10];
      for(int i=0; i<randomArray.length; i++){
          randomArray[i] = (int)(Math.random()*10);
      }
      return randomArray;
  } //end randomInput method
  
  public static int[] remove(int[] list, int target){
      int count= 0; 
      int[] newList = list;
      for(int i = 0; i< newList.length; i++){
          if(newList[i] == target){
              newList = delete(newList, i);
              i--;
          }
          
      }//end for loop
      if(newList == list){
          System.out.println("Element" + target+ "was not found");
          
      }
      else{
          System.out.println("Element" + target + "has been found");
      }
      return newList; //return the new list to main method
      
  }
  
  public static int[] delete(int[] list, int pos){
      //make array with 1 less item than first
      int[] newList = new int[list.length -1];
      if(pos >= 0 && pos <10){
          for(int i = 0; i < newList.length; i++){
              if(i < pos){
                  newList[i] = list[i];
              }
              else{
                  newList[i] = list[i+1];
              }
          }//end for loop
      }
      else{
          System.out.println("The index is not valid. ");
          newList= list;
      }
      return newList;
  }
  
}
