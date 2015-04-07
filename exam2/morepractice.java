import java.util.Scanner;

public class morepractice{
   public static void main(String [] args){
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter 3 integers");
       int a = myScanner.nextInt();
       int b = myScanner.nextInt();
       int c = myScanner.nextInt();
       int d = (b*b) - (4 * a * c);
       if(d==0){
           solve(b,a);
       }
       if(d<0){
           solve();
       }
       if(d>0){
           solve(a,b,c);
       }
       
   }
   public static void solve(int b, int a){
       System.out.println("Discriminent is 0");
       double solution = ((-1)*b)/(2*a);
       System.out.println("The solution is " + solution);
       return;
   }
   public static void solve(){
       System.out.println("Discriminent is negative");
       System.out.println("Solutions are not real");
       return;
   }
   public static void solve(int a, int b, int c){
       System.out.println("Discriminent is positive");
       int d= (b*b) - (4 * a * c);
       double s1= ((-b)+ Math.sqrt(d))/(2*a);
       double s2= ((-b)- Math.sqrt(d))/(2*a);
       System.out.println("Solutions are " + s1 + "and " + s2);
   }
}






