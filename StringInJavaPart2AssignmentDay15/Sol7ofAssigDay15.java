//Program to delet all the consonanat from the string : "Hello,Have a good day."
class Sol7ofAssigDay15{
 public static void main(String[] args) {
  System.out.println();
  
  StringBuilder s=new StringBuilder("Hello,hava a good day.");
  for(int i=0;i<s.length();i++){
   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)==' '){
    continue;
   }
   else{
    System.out.print(s.charAt(i));
   }
  }
  System.out.println();
  
 }
}