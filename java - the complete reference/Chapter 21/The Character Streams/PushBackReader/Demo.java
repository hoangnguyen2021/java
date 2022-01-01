import java.io.CharArrayReader;
import java.io.PushbackReader;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {
      char[] c = "If a = b -> a - b = 0.".toCharArray();
      CharArrayReader charArrayIn = new CharArrayReader(c);
      
      try (PushbackReader pIn = new PushbackReader(charArrayIn))
      {
         int nextChar = pIn.read();
         while (nextChar != -1)
         {
            if (nextChar == '-')
            {
               nextChar = pIn.read();
               if (nextChar == '>')
               {
                  System.out.print("then");
               }
               else
               {
                  System.out.print("-");
                  pIn.unread(nextChar);
               }
            }
            else
            {
               System.out.print((char) nextChar);
            }
            nextChar = pIn.read();
         }
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}