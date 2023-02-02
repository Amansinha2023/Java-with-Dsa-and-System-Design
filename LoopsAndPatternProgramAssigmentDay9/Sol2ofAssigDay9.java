// Program to Print Triangle using Star Pattern Programming logic
import java.util.*;
class Sol2ofAssigDay9{

 public static void main(String args[]){

 System.out.println("Enter The Value of N");
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
 System.out.println("Entered Value of n:-" + n);

 for(int i=1;i<=n;i++){
  for(int s=1;s<=n-i;s++){
   System.out.print(" ");
   
   }
  for(int j=1;j<=i;j++){
   System.out.print("*");
  }

  for(int k=2;k<=i;k++){
   
   System.out.print("*");
   
  }
   System.out.println();
  }
 }
 }
