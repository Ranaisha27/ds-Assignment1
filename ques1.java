import java.util.Scanner;
 
class Palindrome
{
   public static void isPalindrome(String str)
   {
      int len = str.length();
      String rev="";
      String temp=str;
      Boolean b1 = Boolean.valueOf("True"); 
      Boolean b2 = Boolean.valueOf("False"); 
      for ( int i = len - 1 ; i >= 0 ; i-- )
         rev = rev + str.charAt(i);
	
      if(temp.equals(rev))
      System.out.println(b1); 

      else
      System.out.println(b2);
      
   }
   public static void main(String args[])
   {
      String str;
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter a string:");
      str = in.nextLine();
      isPalindrome(str);
   }
}