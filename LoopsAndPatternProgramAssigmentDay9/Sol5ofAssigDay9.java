//Program to print my Name i.e "AMAN"

public class Sol5ofAssigDay9 {
 public static void main(String args[]){
  int n=10;
  for(int i=1;i<=n;i++){


   for(int j=1;j<=n;j++){                    //This loop Print A
    if((i==1)||(j==1)||(i==(n/2))||(j==n)){
     System.out.print("*");
    }
    else{
     System.out.print(" ");
    }
   }

   System.out.print(" ");                 //Provides space between A & M

   for(int j=1;j<=n;j++){                   // This loop Print M
    if((j==1)||((i==j)&&i<=(n/2))||((i+j==n)&&i<=(n/2))||(j==n)){
     System.out.print("*");
    }
    else{
     System.out.print(" ");
    }
   }

   System.out.print(" ");               // Provide space between M & A

   for(int j=1;j<=n;j++){                 // This loop print A
    if((i==1)||(j==1)||(i==(n/2))||(j==n)){
     System.out.print("*");
    }
    else{
     System.out.print(" ");
    }
   }

   System.out.print(" ");                 //Provides space between A & N

   for(int j=1;j<=n;j++){                // This loop print N
    if((j==1)||(i==j)||(j==n)){
     System.out.print("*");
    }
    else{
     System.out.print(" ");
    }
   }


   System.out.println();
  }
 }
 
}
