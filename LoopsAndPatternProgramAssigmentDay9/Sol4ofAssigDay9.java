
//Program to print "PW SKILLS"

public class Sol4ofAssigDay9 {
 
 
  public static void main(String args[]){
   int n=10;
  
   for(int i=1;i<=n;i++){                           // THis loop Prints P
    for(int j=1;j<=n;j++){
     if((i==1)||(j==1)||(i==(n/2))||((j==n)&&(i<=(n/2)))){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
     
    }
 
    System.out.print(" ");                     // Provides single space between P and W
 
    for(int j=1;j<=n;j++){                       // This is loop to print W
     if((j==1)||(j==n)||((i+j==n)&&i>=(n/2))||((i-j==0)&&i>=(n/2))){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
 
    System.out.print("          ");                    // Provides Large space between W and S
 
    for(int j=1;j<=n;j++){                           // This is to print S
     if(((i==1)||(j==1)&&i<=(n/2))||(i==(n/2))||((j==n)&&i>=(n/2))||(i==n)){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
 
    System.out.print(" ");                     // Provide space between S and K
 
 
    for(int j=1;j<=n;j++){                        // This loop prints K
     if((j==1)||(i+j==6)||(i-j==4)){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
    
    System.out.print(" ");                   // Provides space between K and I
 
     for(int j=1;j<=n;j++){                  // THis loop prints I
     if((i==1)||(j==(n/2))||(i==n)){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
 
    System.out.print(" ");             // Provides space between I and L
 
    for(int j=1;j<=n;j++){             // This loop print L
     if((j==1)||(i==n)){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
 
    System.out.print(" ");             // Provides space between L and L
 
    for(int j=1;j<=n;j++){             // This loop print L
     if((j==1)||(i==n)){
      System.out.print("*");
     }
     else{
      System.out.print(" ");
     }
    }
 
    System.out.print(" ");                    // Provides Large space between L and S
 
    for(int j=1;j<=n;j++){                           // This is to print S
     if(((i==1)||(j==1)&&i<=(n/2))||(i==(n/2))||((j==n)&&i>=(n/2))||(i==n)){
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
