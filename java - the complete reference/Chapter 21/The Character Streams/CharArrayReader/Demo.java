import java.io.CharArrayReader;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      String s = "Hello\nCan you read me?\nCool";
      char[] c = s.toCharArray();
      
      try (CharArrayReader charArrayIn = new CharArrayReader(c))
      {
         int eachChar = charArrayIn.read();
         while (eachChar != -1)
         {
            System.out.print((char) eachChar);
            eachChar = charArrayIn.read();
         } 
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}