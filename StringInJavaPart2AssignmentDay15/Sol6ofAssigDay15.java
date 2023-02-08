//Program to chekc whether "e" is present in the string "Umbrella" or not .
class Sol6ofAssigDay15{
 public static void main(String[] args) {
  System.out.println();
  
  String s="Umbrella";
  for(int i=1;i<s.length();i++){
   if(s.charAt(i)=='e'){
    System.out.println("E is present in Index   "  + i);
   }
  }
  
 }
}