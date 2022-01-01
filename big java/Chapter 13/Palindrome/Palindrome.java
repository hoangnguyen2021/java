public class Palindrome
{
   public static void main(String[] args)
   {
      String sentence1 = "Was it a car or a cat I saw?";      
      System.out.println(sentence1);
      System.out.println("Palindrome: " + isPalindrome(sentence1));
      String sentence2 = "Sir, I'm Eve!";      
      System.out.println(sentence2);
      System.out.println("Palindrome: " + isPalindrome(sentence2));
   }
   
   public static boolean isPalindrome(String text)
   {
      if (text.length() <= 1)                                              // special terminating case
      {
         return true;
      }
      
      char start = text.charAt(0);                                         // first character
      char end = text.charAt(text.length() - 1);                           // last character
      if (!Character.isLetter(start))                                      // if the first character is not a letter
      {
         return isPalindrome(text.substring(1));                           // then remove it and check again
      }
      else if (!Character.isLetter(end))                                   // if the last character is not a letter
      {
         return isPalindrome(text.substring(0, text.length() - 1));        // then remove it and check again
      }
      else
      {
         if (Character.toLowerCase(start) == Character.toLowerCase(end))   // if start and end are the same
         {
            return isPalindrome(text.substring(1, text.length() - 1));     // then remove them and continue to check
         }
         else                                                              // if any pairs of start and end are different
         {
            return false;                                                  // return false immediately
         }
      }
   }
}