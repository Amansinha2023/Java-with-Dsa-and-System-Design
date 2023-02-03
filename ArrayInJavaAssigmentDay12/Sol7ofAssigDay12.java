

public class Sol7ofAssigDay12 {
    public static void main(String args[]) {
        int[][] Sol7ofAssigDay12 = new int[2][2];
        
        // Marks Attained By Student 1
        Sol7ofAssigDay12[0][0] = 90;  // English
        Sol7ofAssigDay12[0][1] = 70;  // Maths
       
        
        // Marks Attained By Student 2
        Sol7ofAssigDay12[1][0] = 75;  // English
        Sol7ofAssigDay12[1][1] = 77;  // Maths
        
        
      
        
        // Displaying Marks of Students
        System.out.println("Student Marks Matrix");
        for(int i=0;i<=1;i++){
         for(int j=0;j<=1;j++){
          System.out.print(Sol7ofAssigDay12[i][j]);
         }
         System.out.println();
        }
        
        
    }
}