import java.util.Scanner;

public class PasswordGenerator
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the length of the password: ");
      int length = in.nextInt();
      String password = generatePassword(length);
      System.out.println(password);
      
   }
   
   public static String generatePassword(int length)
   {
      String password = "";
     
      for (int i = 1; i <= (length - 2); i++)
      {
         password = password + generateRandomChar();
      }
      
      String randomSpecialChar = generateRandomSpecialChar();
      String randomNum = generateRandomNum();
      password = addStringToString(password, randomSpecialChar);
      password = addStringToString(password, randomNum);
      return password;
   }
   
   public static String generateRandomChar()
   {
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int randomNum = (int) (Math.random()*26);
      return "" + alphabet.charAt(randomNum);
   }
   
   public static String generateRandomSpecialChar()
   {
      String specialChar = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
      int randomNum = (int) (Math.random()*32);
      return "" + specialChar.charAt(randomNum);
   }
   
   public static String generateRandomNum()
   {
      int randomNum = (int) (Math.random()*10);
      return "" + randomNum;
   }
   
   public static String addStringToString(String oldString, String addingString)
   {
      int randomNum = (int) (Math.random()*(oldString.length() + 1));
      String newString = oldString.substring(0,randomNum) + addingString + oldString.substring(randomNum);
      return newString;
   }

}